package in.capgemini.tracker.daoimpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import in.capgemini.tracker.dao.EmployeeDAO;
import in.capgemini.tracker.exception.EmployeeNotFoundException;
import in.capgemini.tracker.modal.Employee;
import in.capgemini.tracker.util.DBUtil;


public class EmployeeDAOJDBCImpl extends DBUtil implements EmployeeDAO {
	@Override
	public void save(Employee employee) {
		String sql = "insert into employees (employeeName, employeeIdentifier, employeeDescription) values(?,?,?)";
		PreparedStatement pstmt = preparedstatement(sql);
		try {
			pstmt.setString(1, employee.getName());
			pstmt.setLong(2, employee.getID());
			pstmt.setString(3, employee.getQualification());
			pstmt.execute();
		}
		catch(SQLException e) {
			System.out.println("Problem is : " + e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
		}
	}

	@Override
	public void update(Integer id,String employeeIdentifier) {
		String sql = "update employees set employeeIdentifier=? where id=?";
		PreparedStatement pstmt = preparedstatement(sql); 
		try {
			pstmt.setString(1, employeeIdentifier);
			pstmt.setInt(2, id);		
			pstmt.execute();
		}
		catch(SQLException e) {
			System.out.println("Problem is " + e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
		}
	}

	@Override
	public List<Employee> list() {
		String sql = "select * from employees";
		PreparedStatement pstmt = preparedstatement(sql);
		Employee employee;
		List<Employee> employees = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				employee = new Employee();
				employee.setID(rs.getLong("id"));
				employee.setName(rs.getString("EmployeeName"));
				employee.setQualification(rs.getString("employeeQualification"));
				
				employees.add(employee);
			}
		}
		catch(SQLException e) {
			System.out.println("Problem is " + e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
		}
		return employees;
	}

	@Override
	public void delete(Long id) throws EmployeeNotFoundException {
		String sql = "delete from employees where id=?";
		PreparedStatement pstmt = preparedstatement(sql); 
		try {
			pstmt.setLong(1, id);
			pstmt.execute();
		}
		catch(SQLException e) {
			System.out.println("Problem is " + e.getMessage());
		}
		finally {
			closePreparedStatement();
			closeConnection();
		}
	}


}
