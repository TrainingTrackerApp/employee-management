package in.capgemini.tracker.service;

import java.util.List;

import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;

/**
 * This ProjectService interface will perform all the business logic on Project.
 * @author shubh gupta
 *
 */


public interface EmployeeService {
	/**
	 *  The createProject method will create the project in system
	 * @param project to be created
	 */
	void AddEmployee(Employee emp );
	/**
	 *  The showALLProjects method will return the list of available projects
	 *   @return list of available projects
	 */
	List<Employee> showALLEmployees();
	/**
	 * The updateProject method will update the project detail based on provided project
	 * @param project to be updated
	 */
	void updateEmployee(Employee emp);
	/**
	 * This remove method will remove the project based on provided list
	 * @param id of the project to be removed
	 * @throws EmployeeNotFoundException 
	 */
	void removeEmployee(Long id) throws EmployeeNotFoundException;



}
