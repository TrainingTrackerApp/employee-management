package in.capgemini.tracker.test;


import java.util.List;

import in.capgemini.tracker.dao.EmployeeDAO;
import in.capgemini.tracker.daoimpl.EmployeeDAOPlainImpl;
import in.capgemini.tracker.modal.Employee;

public class EmployeeDAOImpl_SaveOperationTest {
	public static void main(String[] args) {
		EmployeeDAO employeeDAO = new EmployeeDAOPlainImpl();
		Employee employee= new Employee();
		employee.setID(11l);
		employee.setName("John Cena");
		employee.setQualification("B.tech");
		employeeDAO.save(employee);
		System.out.println("success");
		List<Employee>emplooyes = employeeDAO.list();
		System.out.println(emplooyes);
	}
}