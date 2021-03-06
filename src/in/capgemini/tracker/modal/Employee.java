package in.capgemini.tracker.modal;


/**
 * This project Modal is used to hold the data and will travel layer to layer.
 * @author shubh gupta
 *
 */
public class Employee {
	/**
	 * id of the employee 
	 * autogenerated
	 */
	private Long ID;
	/**
	 *   Name of the employee
	 */
	private String Name;
	/**
	 * Qualification of the employee
	 */
	private String Qualification;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Qualification=" + Qualification + "]";
	}
	

	 
	
	
}
