package in.capgemini.tracker.daoimpl;

import java.util.ArrayList;
import java.util.List;

import in.capgemini.tracker.dao.EmployeeDAO;
import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;

/**
 * This ProjectDAoPlainImpl is for showing the basic CRUD functionality on list collection
 * @author shubh gupta
 *
 */


public class EmployeeDAOPlainImpl implements EmployeeDAO
 {
	List<Employee> localRepository;
	public EmployeeDAOPlainImpl() {
		localRepository=new ArrayList<>();
	}

	@Override
	public void save(Employee emp) {
		localRepository.add(emp);
		
		
	}

	@Override
	public void update(Integer id, String employeeIdentifier){
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return localRepository;
	}

	@Override
	public void delete(Long id) throws EmployeeNotFoundException
	    {
	        boolean isFound=false;
	        for (Employee employee:localRepository)
	        {
	            if (employee.getID().equals(id))
	            {
	                isFound=true;
	                localRepository.remove(employee);
	                break;
	            }
	            else
	            {
	                isFound=false;
	            }
	        }
	        System.out.println(isFound);
	    }

		
		


}
