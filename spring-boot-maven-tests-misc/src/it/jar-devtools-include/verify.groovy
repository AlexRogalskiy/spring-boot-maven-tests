import java.io.*;
import org.springframework.boot.maven.*;

File f = new File( basedir, "target/jar-devtools-include-0.0.1.BUILD-SNAPSHOT.jar");
new Verify.JarArchiveVerification(f, Verify.SAMPLE_APP) {
	@Override
	protected void verifyZipEntries(Verify.ArchiveVerifier verifier) throws Exception {
		super.verifyZipEntries(verifier)
		verifier.assertHasEntryNameStartingWith("BOOT-INF/lib/spring-boot-devtools")
	}
}.verify();
