package interfacechecker;

public class InterfaceCheckerResource {
	
	private String sourceRepoUrl;
	private String sourcePath;
	private String targetRepoUrl;
	private String targetPath;
	
	public String getSourceRepoUrl() {
		return sourceRepoUrl;
	}
	public void setSourceRepoUrl(String sourceRepoUrl) {
		this.sourceRepoUrl = sourceRepoUrl;
	}
	public String getSourcePath() {
		return sourcePath;
	}
	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}
	public String getTargetRepoUrl() {
		return targetRepoUrl;
	}
	public void setTargetRepoUrl(String targetRepoUrl) {
		this.targetRepoUrl = targetRepoUrl;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
}
