package parntchldabd;

public class Insurancepolicy {
	
	protected int policyId;
	protected String PolicyName;
	protected String customername;
	protected float amount;
	public Insurancepolicy(int policyId, String policyName, String customername, float amount) {
		this.policyId = policyId;
		PolicyName = policyName;
		this.customername = customername;
		this.amount = amount;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float calculateBonus()
	{
		float Bonus=(8*amount)/100;
		return Bonus;
	}
	
	

}
