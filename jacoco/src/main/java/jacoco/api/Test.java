package jacoco.api;

import java.io.File;
import java.io.IOException;

import org.jacoco.core.analysis.Analyzer;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.report.DirectorySourceFileLocator;
import org.jacoco.report.html.HTMLFormatter;

public class Test {

	public static void main(String[] args) throws IOException {
		final HTMLFormatter a = new HTMLFormatter();
		Analyzer analyzer = new Analyzer(new ExecutionDataStore(), null);
		DirectorySourceFileLocator vi = new DirectorySourceFileLocator(new File("./target"), "UTF-8", 0);
		System.out.println(a.getResources());
		String filePath; //where your jar is located.
		//Runtime.getRuntime().exec("java -jar C:\\Users\\kamilelias\\.m2\\repository\\org\\jacoco\\org.jacoco.cli\\0.8.0\\org.jacoco.cli-0.8.0.jar report [<execfiles> ...] --classfiles C:\\Users\\kamilelias\\eclipse-EE\\jacoco\\target\\classes\\simpleTests --html C:\\Users\\kamilelias\\Desktop");
		
	}
}
