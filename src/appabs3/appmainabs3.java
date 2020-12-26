package appabs3;

import java.util.Scanner;

import parntchldabd.Insurancepolicy;
import parntchldabd.LifeInsurancePolicy;

public class appmainabs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr policy Id:");
		int policyid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the policy name:");
		String PolicyName=sc.nextLine();
		System.out.println("Enter the Customer Name:");
		String CustomnerName=sc.nextLine();
		System.out.println("Enter teh amount");
		float amounbt=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the nominee Name");
		String NomineeNme=sc.nextLine();
		System.out.println("Enter no of years");
		int noofyears=sc.nextInt();
		LifeInsurancePolicy lifeinsurancepolicy=new LifeInsurancePolicy(policyid,PolicyName,CustomnerName,amounbt,NomineeNme,noofyears);
         System.out.println("Policy Id-"+lifeinsurancepolicy.getPolicyId());
         System.out.println("Policy Name-"+lifeinsurancepolicy.getPolicyName());
         System.out.println("Customer Name-"+lifeinsurancepolicy.getCustomername());
         System.out.println("Amount-"+lifeinsurancepolicy.getAmount());
         System.out.println("Nominee Name-"+lifeinsurancepolicy.getNomineename());
         System.out.println("Period-"+lifeinsurancepolicy.getNoOfYears()+"years");
         System.out.println("Bonusd amount-"+lifeinsurancepolicy.calculateBonus());
	}

}
