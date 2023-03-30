package Com.SecureHome.main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int accountid;
	private String accountType;
	private String bankAccountName;
	private String accountHolderName;
	private long accountNumber;
	private long accountIfscCode;
	private String accountStatus;
	private long accountMicrCode;
	private int branchcode;
	private String branchName;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBankAccountName() {
		return bankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getAccountIfscCode() {
		return accountIfscCode;
	}
	public void setAccountIfscCode(long accountIfscCode) {
		this.accountIfscCode = accountIfscCode;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public long getAccountMicrCode() {
		return accountMicrCode;
	}
	public void setAccountMicrCode(long accountMicrCode) {
		this.accountMicrCode = accountMicrCode;
	}
	public int getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	




	





}
