package com.example.dealership.transformation.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.example.dealership.transformation.etl.Xml2Emf;

public class TransformationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveMenuSelection(event); 
		IStructuredSelection structuredSelection = (IStructuredSelection) selection; 
		IFile file = (IFile) structuredSelection.getFirstElement();
		
		try {
			new Xml2Emf(file).run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return event;	
	}

}
