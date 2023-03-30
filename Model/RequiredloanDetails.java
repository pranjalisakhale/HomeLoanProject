package Com.SecureHome.main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequiredloanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanid;
	private String loanNo;
	private double loanAmount;
	private double rateOfInterest;
	private  int tenure;
	private int emiAmountPerMonth;
	private double totalAmountToBePaid;
	public int getLoanid() {
		return loanid;
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public String getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getEmiAmountPerMonth() {
		return emiAmountPerMonth;
	}
	public void setEmiAmountPerMonth(int emiAmountPerMonth) {
		this.emiAmountPerMonth = emiAmountPerMonth;
	}
	public double getTotalAmountToBePaid() {
		return totalAmountToBePaid;
	}
	public void setTotalAmountToBePaid(double totalAmountToBePaid) {
		this.totalAmountToBePaid = totalAmountToBePaid;
	}
 


	





}
