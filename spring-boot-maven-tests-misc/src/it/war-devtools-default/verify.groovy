import java.io.*;
import org.springframework.boot.maven.*;

File f = new File( basedir, "target/war-devtools-default-0.0.1.BUILD-SNAPSHOT.war");
new Verify.WarArchiveVerification(f) {
	@Override
	protected void verifyZipEntries(Verify.ArchiveVerifier verifier) throws Exception {
		super.verifyZipEntries(verifier)
		verifier.assertHasNoEntryNameStartingWith("WEB-INF/lib/spring-boot-devtools")
	}
}.verify();

