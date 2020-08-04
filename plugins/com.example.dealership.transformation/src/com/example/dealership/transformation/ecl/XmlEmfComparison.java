package com.example.dealership.transformation.ecl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

import com.example.dealership.DealershipPackage;
import com.example.dealership.transformation.util.EpsilonUtil;
import com.example.dealership.transformation.util.FileUtil2;

public class XmlEmfComparison {
	
	InMemoryEmfModel model;
	
	public void setModel(InMemoryEmfModel m) {
		this.model = m;
	}
	
	public List<MatchTrace> compareXmlEmf() throws Exception{
		IFile file = FileUtil2.getFileFromURI(model.getResource().getURI());
		ArrayList<EmfModel> libraryModels = new ArrayList<>();
		ArrayList<MatchTrace> matchTraces = new ArrayList<>(); 
		for (IResource xmlFile : FileUtil2.getXmlModels(file)) {
			EmfModel dealership = model;
			EpsilonUtil.getEmfModel("N", DealershipPackage.eINSTANCE.getNsURI(),
					file.getProject().getFolder("emf").getLocation().toOSString() + "/" + xmlFile.getName().replace(".xml", "") + ".dealership", false, true);
			PlainXmlModel xmlCatalogue = EpsilonUtil.getXmlModel("X", xmlFile.getLocation().toOSString(), true, false);
			matchTraces.add(runEcl(dealership, libraryModels, xmlCatalogue));
		}
		return matchTraces;
	}
	
	
	private static MatchTrace runEcl(EmfModel dealership, List<EmfModel> libraryModels, PlainXmlModel xmlCatalogue) throws Exception {
		MatchTrace mt = null;
		EclModule m = new EclModule();
		m.parse(EpsilonUtil.path2URL("resources/scripts/comparison.ecl"));
		
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		
		m.getContext().getModelRepository().addModel(dealership);
		m.getContext().getModelRepository().addModel(xmlCatalogue);
		
		for (EmfModel libraryModel : libraryModels) {
			m.getContext().getModelRepository().addModel(libraryModel);
		}
		
		m.execute();	
		mt = m.getContext().getMatchTrace();
		
		return mt;
	}
}
