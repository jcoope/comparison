package com.example.dealership.transformation.util;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
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
		m.setCachingEnabled(false);
		return m;
	}
	
	public static URL path2URL (String path) {
		return FileLocator.find(Platform.getBundle("com.example.dealership.transformation"), new Path(path));
	}
}
