package com.fixitytexh.insurance;

public class Company {
	//LifeInsurance insurances[]=new LifeInsurance[1000];
	Insurance insurances[]= new Insurance[1000];
	
	
	int noOfPolicies;
   
 public Insurance openLifePolicy(String name,String NomineeName,double totalInsuredAmount,double insuredAmount)
	     {
	       if(noOfPolicies<1000)
	        {
	        
	          Insurance insurance=new LifeInsurance();
	          ((LifeInsurance)insurance).setName(name);
	          ((LifeInsurance)insurance).setNomineeName(NomineeName);
	          ((LifeInsurance)insurance).setInsuredAmount(totalInsuredAmount);
	          ((LifeInsurance)insurance).setTotalInsuredAmount(insuredAmount);
	          ((LifeInsurance)insurance).setPolicyId(LifeInsurance.getGeneratePolicyId());
	          ((LifeInsurance)insurance).setStatus("Active");
	          ((LifeInsurance)insurance).setYears(totalInsuredAmount,insuredAmount);
	           insurances[noOfPolicies++]=insurance;
	            
	            return insurance;
	          }
	    
	       return null;
	    }
   
public Insurance openHealthPolicy(String name,double amount,String Childs)
{
  if(noOfPolicies<1000)
   {
   
     Insurance insurance=new HealthInsurance();
     ((HealthInsurance)insurance).setName(name);
     ((HealthInsurance)insurance).setInsuredAmount(amount);
     ((HealthInsurance)insurance).setPolicyId(HealthInsurance.getGeneratePolicyId());
     ((HealthInsurance)insurance).setStatus("sucess");
      insurances[noOfPolicies++]=insurance;
       
       return insurance;
     }

  return null;
}
public Insurance openVechilePolicy(String name,String vechileNumber,String vechileYear,String vechileType,double amount)
{
  if(noOfPolicies<1000)
   {
     Insurance insurance=new VehicleInsurance();
     ((VehicleInsurance)insurance).setName(name);
     ((VehicleInsurance)insurance).setInsuredAmount(amount);
     ((VehicleInsurance)insurance).setPolicyId(VehicleInsurance.getGeneratePolicyId());
     ((VehicleInsurance)insurance).setVechileDetails(vechileType, vechileNumber, vechileYear);
     ((HealthInsurance)insurance).setStatus("sucess");
      insurances[noOfPolicies++]=insurance;
       
       return insurance;
     }

  return null;
}

Insurance getPolicyDetails(String policyId)
{
	for(int i=0;i<noOfPolicies;i++)
	{
     
	if(insurances[i].getPolicyId().equals(policyId))
	{
		return insurances[i];
	}
	  
	  //break;
	}
	return null;
}





double getAmount(String policyId)
{
	for(int i=0;i<noOfPolicies;i++)
	{
	if(insurances[i].getPolicyId().equals(policyId))
	{
		double amount=(insurances[i].getTotalInsuredAmount()*(0.1))+insurances[i].getTotalInsuredAmount();
		return amount;
		
		}
	}
	return 0;
	
}

public Insurance renewalpolicyId(String id,double amount)
{
	for(int i=0;i<noOfPolicies;i++)
	{
	if(insurances[i].getPolicyId().equals(id))
	{
		((LifeInsurance)insurances[i]).setPolicyId((id+"_1"));
		((LifeInsurance)insurances[i]).setTotalInsuredAmount(amount);
		return insurances[i];
		
	}
	}
	return null;
}




Insurance[] getInsurances()
{
	  Insurance Insurances[]=new Insurance[noOfPolicies];
	  for(int i=0;i<noOfPolicies;i++)
		Insurances[i]=insurances[i];
	 return Insurances; 
}

}
