package com.biswajit.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FetchEmailDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Coming from FetchEmail Delegate");
		System.out.println("userIdInput in FetchEmail Delegete:: " + execution.getVariable("userIdInput"));
		execution.setVariable("userEmailIdFromDelegate", "stefan@gmail.com");

	}

}
