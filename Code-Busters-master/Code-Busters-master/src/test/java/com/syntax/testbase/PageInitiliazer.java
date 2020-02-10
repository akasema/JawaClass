package com.syntax.testbase;



import com.syntax.pages.DashboardPageElements;
import com.syntax.pages.DependentPageElements;
import com.syntax.pages.EmployeeListElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.pages.QualificationsElements;

public class PageInitiliazer extends BaseClass {
	protected static DependentPageElements dependent;
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static EmployeeListElements empList;
	protected static QualificationsElements qual;

	public static void initializeAllPage() {
		dependent = new DependentPageElements();
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		empList=new EmployeeListElements();
		qual =new QualificationsElements();
}
}
