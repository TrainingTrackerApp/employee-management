package in.capgemini.tracker.util;

import java.util.List;
import java.util.Scanner;

import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;
import in.capgemini.tracker.service.EmployeeService;
import in.capgemini.tracker.serviceimpl.EmployeeServiceImpl;

public class MenuUtil {
	private EmployeeService employeeService;
	private Scanner sca;
	public MenuUtil() {
		employeeService = new EmployeeServiceImpl();
	}
	public void start() {
		int menuChoice;
		String continueChoice;
		sca = new Scanner(System.in);
		
		do {
			showMenu();
			System.out.println("Enter your choice from 1,2,3,4,5");
			menuChoice=sca.nextInt();
			switch(menuChoice)
			{
			case 1:
				Employee employee = new Employee();
				System.out.println("Enter Employee Name");
				employee.setName(sca.nextLine());
				sca.nextLine();
				System.out.println("Enter Employee Qualification");
				employee.setQualification(sca.nextLine());
				employeeService.AddEmployee(employee);
				System.out.println("Employee Details added sucessfully");
				break;
			case 2:
				System.out.println("-----------------List operation------------");
				List<Employee> employees = employeeService.showALLEmployees();
				for(Employee emplo : employees)
				{
					System.out.println(emplo);
				}
				break;
			case 3:
				System.out.println("Update employee detail");
				break;
			case 4:
				System.out.println("Enter ID of employee to delete");
                Long id=sca.nextLong();
                try
                {
                    employeeService.removeEmployee(id);
                }
                catch(EmployeeNotFoundException e)
                {
                    System.out.println("Problem "+e.getMessage());
                }
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				break;
				
				
			}System.out.println("Do you Want To Continue: (yes/no)");
			continueChoice= sca.next();
		}while(continueChoice.equals("yes"));
		
		}

	private void showMenu() {
		System.out.println("---------Training Tracker--------------");
		System.out.println("1. ADD Employee Details");
		System.out.println("2. List of Employee");
		System.out.println("3. Update Employee Details");
		System.out.println("4. Delete Employee Details");
		System.out.println("5. Exit");
	}

}
