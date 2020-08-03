package com.example.dealership.transformation.etl;

import java.io.File;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.etl.EtlModule;

import com.example.dealership.DealershipPackage;
import com.example.dealership.transformation.util.EpsilonUtil;

public class Xml2Emf {
	
	IFile file;
	
	public Xml2Emf(IFile file) {
		this.file = file;
	}
	
	public void run() throws Exception {
		cleanModel();
		for (IResource f : getXmlModels()) {
			EmfModel dealership = EpsilonUtil.getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(),
					file.getLocation().toOSString(), true, true);
			EmfModel library = EpsilonUtil.getEmfModel("N", DealershipPackage.eINSTANCE.getNsURI(),
					file.getProject().getFolder("emf").getLocation().toOSString() + "/" + f.getName().replace(".xml", "") + ".dealership", false, true);
			PlainXmlModel xmlCatalogue = EpsilonUtil.getXmlModel("X", f.getLocation().toOSString(), true, false);
			runEtl(dealership, library, xmlCatalogue);
		}
	}

	private IResource[] getXmlModels() throws CoreException{
		return file.getProject().getFolder("xml").members();
	}
	
	private void runEtl(EmfModel dealership, EmfModel libraryModel, PlainXmlModel xmlCatalogue) throws Exception {		
		EtlModule m = new EtlModule();
		URL url = FileLocator.find(Platform.getBundle("com.example.dealership.transformation"), new Path("resources/scripts/Xml2Emf.etl"));
		m.parse(url);
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		
		m.getContext().getModelRepository().addModel(dealership);
		m.getContext().getModelRepository().addModel(libraryModel);
		m.getContext().getModelRepository().addModel(xmlCatalogue);
		
		m.execute();

		m.getContext().getModelRepository().dispose();
		m.getContext().dispose();
	}
	
	private void cleanModel() throws Exception {
		EolModule m = new EolModule();
		m.parse("delete (M!Library.all);");
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		EmfModel dealership = EpsilonUtil.getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(), file.getLocation().toOSString(), true, true);
		m.getContext().getModelRepository().addModel(dealership);
		
		m.execute();

		m.getContext().getModelRepository().dispose();
		m.getContext().dispose();
	}
}
