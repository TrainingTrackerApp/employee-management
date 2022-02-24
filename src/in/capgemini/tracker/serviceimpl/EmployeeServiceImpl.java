package in.capgemini.tracker.serviceimpl;


import java.util.List;

import in.capgemini.tracker.dao.EmployeeDAO;
import in.capgemini.tracker.daoimpl.EmployeeDAOPlainImpl;
import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;
import in.capgemini.tracker.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDAO;
	
	public  EmployeeServiceImpl()
	{
	employeeDAO = new EmployeeDAOPlainImpl();
	}
	@Override
	public void AddEmployee(Employee emp) {
		emp.setID(System.currentTimeMillis());
		employeeDAO.save(emp);

	}

	@Override
	public List<Employee> showALLEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.list();
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

	public void removeEmployee(Long id) throws EmployeeNotFoundException {
		try {
			employeeDAO.delete(id);
			
		}catch(EmployeeNotFoundException e) {
			throw new EmployeeNotFoundException(e.getMessage());
		}
	}
	
	
}
