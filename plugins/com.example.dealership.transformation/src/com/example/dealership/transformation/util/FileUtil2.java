package com.example.dealership.transformation.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

public class FileUtil2 {
	
	public static IResource[] getXmlModels(IFile file) throws CoreException{
		return file.getProject().getFolder("xml").members();
	}
	
	public static IFile getFileFromURI(URI uri) {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true)));
	}
	
}
