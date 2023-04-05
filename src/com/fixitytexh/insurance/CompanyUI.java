package com.fixitytexh.insurance;

import java.util.Scanner;

public class CompanyUI {
	public static void main(String args[]) {
		Company company = new Company();
		Scanner sc = new Scanner(System.in);
        
		while (true) {
			System.out.println("display menu.....");
			System.out.println("1. New Policy ");
			System.out.println("2. Policy Status/Info");
			System.out.println("3. Renewal");
			System.out.println("4. Top Up");
			System.out.println("5. All Policies");
			System.out.println("6. Claim");
			System.out.println("7. Claim Status");
			System.out.println("8. All Claim");
			System.out.println("9. Exit.");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1. Life Insurance");
				System.out.println("2. General - Health");
				System.out.println("3. General - Vehicle.");
				System.out.println("enter input value");
				int ch = sc.nextInt();
				System.out.println("enter your name");
				String name = sc.next();
				Insurance insurance = null;
				if (ch == 1) {
					System.out.println("enter Nominee Name");
					String NomineeName = sc.next();
					System.out.println("enter total Insured amount policy");
					double totalInsuredAmount = sc.nextDouble();
					System.out.println("Enter how much amount to pay: ");
					double insuredamount = sc.nextDouble();
					insurance = company.openLifePolicy(name, NomineeName, totalInsuredAmount, insuredamount);
				} else if (ch == 2) {
					System.out.println("enter how many childs");
					String childs = sc.next();
					System.out.println("enter Insured Amount");
					double amount = sc.nextDouble();
					insurance = company.openHealthPolicy(name, amount, childs);
				} else if (ch == 3) {
					System.out.println("enter vechile Number");
					String vechileNumber = sc.next();
					System.out.println("enter vechile year");
					String vechileYear = sc.next();
					System.out.println("enter vechile model");
					String vechileType = sc.next();
					System.out.println("enter vechile ensured amount");
					double amount = sc.nextDouble();
					insurance = company.openVechilePolicy(name, vechileNumber, vechileYear, vechileType, amount);

				}
				if (insurance != null)
					System.out.println("your policyid is: " + insurance.getPolicyId()
							+ "\nyour insurance policy created sucessfully." + "\nyou have to pay years "
							+ insurance.getYears());

				else
					System.out.println(" unable to create your policy");

				break;

			case 2:
				System.out.println("enter policyId: ");
				String policyId = sc.next();
				insurance = company.getPolicyDetails(policyId);
				if (insurance != null)
					System.out.println("\n1.Name : " + insurance.getName() + "\n2.Policy Id : "
							+ insurance.getPolicyId() + "\n3.policy Amount : " + insurance.getInsuredAmount()
							+ "\n4.Policy Status: " + insurance.getStatus() + "\n5.total policy Amount "
							+ insurance.getTotalInsuredAmount() + "\n6.your policy period" + insurance.getYears());
				else
					System.out.println("Invalid id");
				break;

			case 3:
				System.out.println("enter policy id");
				String id=sc.next();
				insurance = company.getPolicyDetails(id);
				if (insurance != null)
				{
					System.out.println("\n1.Name : " + insurance.getName() + "\n2.Policy Id : "
							+ insurance.getPolicyId() + "\n3.policy Amount : " + insurance.getInsuredAmount()
							+ "\n4.Policy Status: " + insurance.getStatus() + "\n5.total policy Amount "
							+ insurance.getTotalInsuredAmount() + "\n6.your policy period" + insurance.getYears());
				
				double amount=company.getAmount(id);
				if(amount!=0)
					System.out.println("increase 10 persent with present amount"+amount);
				System.out.println("if you accept click 1 or click 2");
				int n=sc.nextInt();
				if(n==1)
				{
					
					
					insurance=company.renewalpolicyId(id,amount);
					
			  	 System.out.println("you accepted renewal your new Id: "+insurance.getPolicyId());
			  	 
				}
				
				}

			}// switch
		} // while
		
	}
}