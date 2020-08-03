package com.example.dealership.transformation.util;

import java.io.File;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

public class EpsilonUtil {
	public static EmfModel getEmfModel (String name, String metamodelUri, String path, boolean readOnLoad, boolean storedOnDisposal) throws EolModelLoadingException {
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
	
	public static PlainXmlModel getXmlModel (String name, String path, boolean readOnLoad, boolean storedOnDisposal) throws EolModelLoadingException {
		PlainXmlModel m = new PlainXmlModel();
		m.setName(name);
		m.setFile(new File(path));
		m.setReadOnLoad(readOnLoad);
		m.setStoredOnDisposal(storedOnDisposal);
		m.load();
		return m;
	}
}
