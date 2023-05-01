package interfacechecker;

import java.util.ArrayList;
import java.util.List;

public class InterfaceInfo {
	private String packageName;
	private String interfaceName;
	private List<ImplementationInfo> implementationInfoList = new ArrayList<ImplementationInfo>();

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public List<ImplementationInfo> getImplementationInfoList() {
		return implementationInfoList;
	}
	
	public static class ImplementationInfo {
		private String packageName;
		private String implementationName;
		
		public String getPackageName() {
			return packageName;
		}
		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}
		public String getImplementationName() {
			return implementationName;
		}
		public void setImplementationName(String implementationName) {
			this.implementationName = implementationName;
		}
	}
}
