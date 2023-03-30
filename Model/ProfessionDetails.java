package Com.SecureHome.main.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProfessionDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int professionid;
	
	private int employeeId;
	private String professionType;
	private String professionDesignation;
	private double professionSalary;
	private int totalExperience;
	@OneToOne(cascade = CascadeType.ALL)
	private PermanentAddress permanentaddress;
	
	public int getProfessionid() {
		return professionid;
	}
	public void setProfessionid(int professionid) {
		this.professionid = professionid;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getProfessionType() {
		return professionType;
	}
	public void setProfessionType(String professionType) {
		this.professionType = professionType;
	}
	public String getProfessionDesignation() {
		return professionDesignation;
	}
	public void setProfessionDesignation(String professionDesignation) {
		this.professionDesignation = professionDesignation;
	}
	public double getProfessionSalary() {
		return professionSalary;
	}
	public void setProfessionSalary(double professionSalary) {
		this.professionSalary = professionSalary;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	public PermanentAddress getPermanentaddress() {
		return permanentaddress;
	}
	public void setPermanentaddress(PermanentAddress permanentaddress) {
		this.permanentaddress = permanentaddress;
	}
	








}
