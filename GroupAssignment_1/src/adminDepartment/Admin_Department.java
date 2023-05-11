package adminDepartment;

import superDepartments.Super_Department;

public class Admin_Department implements Super_Department {

	@Override
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	public String getWorkDeadline() {
		return"Complete by EOD" ;
	}

	@Override
	public String isTodayAHoliday() {
		return "Today is not Holiday";
	}
}

