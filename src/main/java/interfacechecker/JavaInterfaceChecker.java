package interfacechecker;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JavaInterfaceChecker {

	public final static String JAVA_SUFFIX = "java";
	
	public static void runStats(InterfaceCheckerResourceManager icr) {
		
		List<String> ifs = searchForInterfaces(icr);
		Map<String, List<String>> ifMap = searchForReferences(ifs, icr);
		generateReport(ifMap);
	}

	private static void generateReport(Map<String, List<String>> ifMap) {
		// TODO Auto-generated method stub
		
	}

	private static Map<String, List<String>> searchForReferences(List<String> ifs, InterfaceCheckerResourceManager icr) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<String> searchForInterfaces(InterfaceCheckerResourceManager icrm) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<InterfaceCheckerResource> icrList = icrm.getResources();
		
		icrList.forEach(null);
		return list;
	}

	public static void list(File file, List<File> fileList) {
	
		if (file.isFile()) {
			String name = file.getName();
			int i = name.lastIndexOf('.');
			
			if (i < 0) return;
			
			if (JAVA_SUFFIX.equals(name.substring(i))) {
				fileList.add(file);
			}
			
			return;
		}
		
	    File[] children = file.listFiles();
	    Arrays.asList(children)
	    	  .forEach(child -> list(child, fileList));
	}
}
