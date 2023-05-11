package techDepartment;

import superDepartments.Super_Department;

public class Tech_Department implements Super_Department {

	@Override
	public String departmentName() {
		return"Welcome to Tech Department" ;
	}

	@Override
	public String getTodaysWork() {
		return"Complete coding of module 1" ;
	}

	@Override
	public String getWorkDeadline() {
		return"Complete by EOD" ;
	}
	public String getTechStackInformation() {
		return "core Java";
	}

	@Override
	public String isTodayAHoliday() {
		return"Today is not Holiday";
	}

}
