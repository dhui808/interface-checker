package interfacechecker;

/**
 * The main class for interface checker utilities.
 *
 */
public class InterfaceCheckerMain {

	public static void main(String[] args) {
		
		InterfaceCheckerResourceManager icr = InterfaceCheckerResourceManager.getInstance();
		icr.parse(args);
		icr.prepareResource();		
		JavaInterfaceChecker.runStats(icr);
	}

	private static void usage() {
		String s = String.join(System.lineSeparator(), "Usage:", "InterfaceCheckerMain sourceGitUrl targetGitUrl");
	}
}
