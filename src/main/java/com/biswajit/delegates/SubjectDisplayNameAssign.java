package com.biswajit.delegates;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SubjectDisplayNameAssign implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub

		Map subjectMap = (Map) execution.getVariable("subjectObj");

		String subjectDisplayName = null;
		switch (subjectMap.get("name").toString()) {
		case "English":
			subjectDisplayName = "Eng";
			break;
		case "Mathematics":
			subjectDisplayName = "Maths";
			break;
		case "Science":
			subjectDisplayName = "Sci";
			break;
		}
		
		subjectMap.put("displayName", subjectDisplayName);

	}

}
