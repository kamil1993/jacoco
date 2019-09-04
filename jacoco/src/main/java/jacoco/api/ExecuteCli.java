package jacoco.api;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecuteCli {

	 public static void main(String[] args) {
			System.out.println("Execute shell commands example");
			System.out.println();

			try {
				final String dir = System.getProperty("user.dir");
		        System.out.println("current dir = " + dir);
			    String cmd = "java -jar jacococli.jar classinfo "+dir+"\\target\\classes\\simpleTests\\Summe.class --destfile "+dir+"\\target\\classes";
			    System.out.println("Executing command: " + cmd);
			    Process p = Runtime.getRuntime().exec(cmd);
			    int result = p.waitFor();
			    
			    System.out.println("Process exit code: " + result);
			    System.out.println();
			    System.out.println("Result:");
			    BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

			    String line = "";
			    while ((line = reader.readLine()) != null) {
				System.out.println(line);
			    }

			} catch (Exception e) {
			    e.printStackTrace();
			}
		    }
}
