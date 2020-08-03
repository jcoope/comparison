package com.example.dealership.transformation.etl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import com.example.dealership.DealershipPackage;

public class Example {

	public static void main(String[] args) throws Exception{
		//convertXml2Emf();
		performModelValidation(compareXmlEmf());
	}
	
	private static void performModelValidation(ArrayList<MatchTrace> mt) throws Exception{
		EmfModel dealership = getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/dealership.model", true, false);
		runEvl(mt, dealership);
	}
	
	
	private static ArrayList<MatchTrace> compareXmlEmf() throws Exception{
		ArrayList<EmfModel> libraryModels = new ArrayList<>();
		ArrayList<MatchTrace> matchTraces = new ArrayList<>(); 
		for (File xmlFile : getXmlModels()) {
			EmfModel dealership = getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/dealership.model", true, false);
			libraryModels.add(getEmfModel(xmlFile.getName().replace(".xml", ""), DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/libraries/" + xmlFile.getName().replace(".xml", "") +".model", true, false));
			PlainXmlModel xmlCatalogue = getXmlModel("X", xmlFile.getAbsolutePath(), true, false);
			matchTraces.add(runEcl(dealership, xmlCatalogue));
		}
		return matchTraces;
	}
	
	private static File[] getXmlModels(){
		return new File("resources/xml").listFiles();
	}
	
	private static void convertXml2Emf() throws Exception {	
		resetMainModel();
		for (File xmlFile : getXmlModels()) {
			EmfModel dealership = getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/dealership.model", true, true);
			EmfModel library = getEmfModel("N", DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/libraries/" + xmlFile.getName().replace(".xml", "") +".model", false, true);
			PlainXmlModel xmlCatalogue = getXmlModel("X", xmlFile.getAbsolutePath(), true, false);
			runEtl(dealership, library, xmlCatalogue);
		}
	}
	
	private static void resetMainModel() throws Exception {
		EolModule m = new EolModule();
		m.parse("delete (M!Library.all);");
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		EmfModel dealership = getEmfModel("M", DealershipPackage.eINSTANCE.getNsURI(), "resources/emf/dealership.model", true, true);
		m.getContext().getModelRepository().addModel(dealership);
		
		m.execute();

		m.getContext().getModelRepository().dispose();
		m.getContext().dispose();
	}
	
	private static void runEtl(EmfModel dealership, EmfModel libraryModel, PlainXmlModel xmlCatalogue) throws Exception {
		EtlModule m = new EtlModule();
		m.parse(new File("resources/scripts/Xml2Emf.etl"));
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
	
	private static MatchTrace runEcl(EmfModel dealership, PlainXmlModel xmlCatalogue) throws Exception {
		MatchTrace mt = null;
		EclModule m = new EclModule();
		m.parse(new File("resources/scripts/test.ecl"));
		
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		
		m.getContext().getModelRepository().addModel(dealership);
		m.getContext().getModelRepository().addModel(xmlCatalogue);
		
		m.execute();
		
		mt = m.getContext().getMatchTrace();

		m.getContext().getModelRepository().dispose();
		m.getContext().dispose();
		
		return mt;
	}
	
	private static void runEvl(ArrayList<MatchTrace> mt, EmfModel dealership) throws Exception {
		EvlModule m = new EvlModule();
		m.parse(new File("resources/scripts/validation.evl"));
		
		if (!m.getParseProblems().isEmpty()) {
			System.err.println("Parse Problems. Exiting...");
		}
		
		m.getContext().getModelRepository().addModel(dealership);
		m.getContext().getFrameStack().put(Variable.createReadOnlyVariable("matchTraces", mt));
		
		
		
		m.execute();
		
		System.out.println("Model validation completed with: " + m.getContext().getUnsatisfiedConstraints().size() + " errors");
		
		for (UnsatisfiedConstraint c : m.getContext().getUnsatisfiedConstraints()) {
			System.out.println(c.getMessage());
		}
		
		m.getContext().getModelRepository().dispose();
		m.getContext().dispose();
	}
	
	
	private static EmfModel getEmfModel (String name, String metamodelUri, String path, boolean readOnLoad, boolean storedOnDisposal) throws EolModelLoadingException {
		EmfModel m = new EmfModel();
		m.setName(name);
		m.setMetamodelUri(metamodelUri);
		m.setModelFile(new File(path).getAbsolutePath());
		m.setReadOnLoad(readOnLoad);
		m.setStoredOnDisposal(storedOnDisposal);
		m.setCachingEnabled(false);
		m.load();
		return m;
	}
	
	private static PlainXmlModel getXmlModel (String name, String path, boolean readOnLoad, boolean storedOnDisposal) throws EolModelLoadingException {
		PlainXmlModel m = new PlainXmlModel();
		m.setName(name);
		m.setFile(new File(path));
		m.setReadOnLoad(readOnLoad);
		m.setStoredOnDisposal(storedOnDisposal);
		m.load();
		return m;
	}

}
