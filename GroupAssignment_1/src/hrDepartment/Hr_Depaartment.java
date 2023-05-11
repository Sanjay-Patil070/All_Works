package hrDepartment;

import superDepartments.Super_Department;

public class Hr_Depaartment implements Super_Department {

	@Override
	public String departmentName() {
		return"Welcome to Hr Department" ;
	}

	@Override
	public String getTodaysWork() {
		return"Fill today's timesheet and mark your attendance" ;
	}

	@Override
	public String getWorkDeadline() {
		return"Complete by EOD" ;
	}
	public String doActivity() {
		return "Team Lunch ";
	}

	@Override
	public String isTodayAHoliday() {
		return"Today is not Holiday" ;
	}

}
