package in.capgemini.tracker.dao;

import java.util.List;

import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;


/**
 * This project interface will work on the CRUD for project
 * 
 * @author shubh gupta
 *
 */

public interface EmployeeDAO {
	/**
	 * This save method will save the project in the database
	 * @param project to be saved in DB
	 */
	void save (Employee emp);
   /**
    * this update method will update the project detail
    * @param project to be updated
    */
	void update(Integer id, String employeeIdentifier);
   /**
    * this list method will return all the project list
    * @return list of projects if found
    */
   List<Employee> list();
   /**
    * this delete method will delete the project based on id provided
    * @param na of the project to be deleted if found
 * @throws EmployeeNotFoundException 
    */
   void delete(Long id) throws EmployeeNotFoundException;

  
   
}
