package interfacechecker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class InterfaceCheckerResourceManager {

	/**
	 * sources stores the Git repo URLs whose interfaces will be examined for implementations
	 * in Git repo URLs in targets. 
	 */
	private ArrayList<InterfaceCheckerResource> resources;
	
	private static InterfaceCheckerResourceManager instance = new InterfaceCheckerResourceManager();
	
	public static InterfaceCheckerResourceManager getInstance() {
		return instance;
	}
	
	public void parse(String[] args) {
		
		if (0 == args.length) {
			loadDefaultGitRepo();
		} else if (4 == args.length) {
			
		} else {
			throw new InterfaceCheckerException("Need 4 arguments.");
		}
	}

	private void loadDefaultGitRepo() {
		
		ObjectMapper mapper = new ObjectMapper();
		ObjectReader reader = mapper.readerForListOf(InterfaceCheckerResource.class);
		String inFile = "/opt/interface-checker/default-git-repo.json";

		try {
			resources = reader.readValue(new File(inFile));
		} catch (IOException e) {
		    throw new InterfaceCheckerException(e);
		}
		
		resources.forEach(this::populateResource);
	}

	private void populateResource(InterfaceCheckerResource resource) {
		
		if (null == resource.getTargetRepoUrl()) {
			resource.setTargetRepoUrl(resource.getSourceRepoUrl());
		}
		
		if (null == resource.getTargetPath()) {
			resource.setTargetPath(resource.getSourcePath());
		}
	}
	
	private void prepareFolder(InterfaceCheckerResource resource) {
		
		String sourcePath = resource.getSourcePath();
		File sourceFile = new File(sourcePath);
		
		if (false == sourceFile.exists()) {
			sourceFile.mkdir();
		}
		
		String targetPath = resource.getTargetPath();
		File targetFile = new File(targetPath);
		
		if (false == targetFile.exists()) {
			targetFile.mkdir();
		}
	}

	public void prepareResource() {
		
		resources.forEach(this::prepareFolder);
	}

	public ArrayList<InterfaceCheckerResource> getResources() {
		return resources;
	}
}
