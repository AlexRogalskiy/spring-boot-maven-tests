import java.io.*;
import org.springframework.boot.maven.*;

File f = new File( basedir, "target/jar-exclude-devtools-0.0.1.BUILD-SNAPSHOT.jar");
new Verify.JarArchiveVerification(f, Verify.SAMPLE_APP) {
	@Override
	protected void verifyZipEntries(Verify.ArchiveVerifier verifier) throws Exception {
		super.verifyZipEntries(verifier)
		verifier.assertHasNoEntryNameStartingWith("lib/spring-boot-devtools")
	}
}.verify();
