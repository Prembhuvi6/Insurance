package com.fixitytexh.insurance;
public class LifeInsurance implements Insurance {
	String name;
	String policyId;
	String nomineeName;
	double InsuredAmount;
	double totalInsuredAmount;
	String status;
	String newPolicyId;
	int Years;

	
	static int generetePolicyId=1001;
	public static String getGeneratePolicyId()
	{
	return "LP_"+generetePolicyId++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNomineeName() {
	return nomineeName;	
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName=nomineeName;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public double getInsuredAmount() {
		return InsuredAmount;
	}
	public void setInsuredAmount(double InsuredAmount) {
		this.InsuredAmount = InsuredAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTotalInsuredAmount() {
		return totalInsuredAmount;
	}
	public void setTotalInsuredAmount(double totalInsuredAmount) {
		this.totalInsuredAmount = totalInsuredAmount;
	}
	public int getYears() {
		return Years;
	}
	public void setYears(double totalInsuredAmount,double insuredAmount) {
		Years =(int)(totalInsuredAmount/insuredAmount);
	}
	public String getNewPolicyId() {
		return newPolicyId;
	}
	public void setNewPolicyId(String newPolicyId) {
		this.newPolicyId = newPolicyId;
	}
	
	
	
}
