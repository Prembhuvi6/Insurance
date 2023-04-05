package com.fixitytexh.insurance;

public class HealthInsurance implements Insurance {
	
  String name;
  String policyId;
  int childs;
  double insuredAmount;
  String status;
  double totalInsuredAmount;
  int Years;
  
  static int generetePolicyId=1001;
	public static String getGeneratePolicyId()
	{
	return "HP_"+generetePolicyId++;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPolicyId() {
	return policyId;
}
public void setPolicyId(String policyId) {
	this.policyId = policyId;
}
public int getChilds() {
	return childs;
}
public void setChilds(int childs) {
	this.childs =childs;
}
public double getInsuredAmount() {
	return insuredAmount;
}
public void setInsuredAmount(double insuredAmount) {
	this.insuredAmount = insuredAmount;
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
public void setYears() {
	Years =(int)(getTotalInsuredAmount()/getInsuredAmount());
}

}
