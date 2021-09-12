package org.sample;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Execution {
public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(JunitProgram.class);
		int runCount = result.getRunCount();
		System.out.println("Total RunCount "+runCount);
		int ignoreCount = result.getIgnoreCount();
		System.out.println("Ignore count "+ignoreCount);
		int failureCount = result.getFailureCount();
		System.out.println("Failure Count "+failureCount);
		List<Failure> failures = result.getFailures();
		for (int i = 0; i < failures.size(); i++) {
			System.out.println(failures.get(i));
		}
}
}
