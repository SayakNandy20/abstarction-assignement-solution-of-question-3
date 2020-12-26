package parntchldabd;

public class LifeInsurancePolicy extends Insurancepolicy {
	private String nomineename;
	private int noOfYears;
	public LifeInsurancePolicy(int policyId, String policyName, String customername, float amount, String nomineename,
			int noOfYears) {
		super(policyId, policyName, customername, amount);
		this.nomineename = nomineename;
		this.noOfYears = noOfYears;
	}
	public String getNomineename() {
		return nomineename;
	}
	public void setNomineename(String nomineename) {
		this.nomineename = nomineename;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		float Bonuscorrect=(15*super.getAmount())/100;
		return Bonuscorrect;
	}
	
	

}
