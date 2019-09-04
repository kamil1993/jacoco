package jacoco.api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import simpleTests.Summe;

public class MyRunner {
	
//	public static Runnable createRunnable(final String className) {
//		Runnable toBeRetuerned = new Runnable() {
//			public void run() {
//				try {
//					JUnitCore.runClasses(Class.forName(className));
//				} catch (ClassNotFoundException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//		return toBeRetuerned;
//	}
	//public static String ClassName = "Summe";
	public static void main(String [] args) throws ClassNotFoundException {
		System.out.println(Summe.class.getTypeName());
		JUnitCore.runClasses(Class.forName(Summe.class.getName()));
	}
}