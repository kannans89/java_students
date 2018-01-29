package candidate;

public class Candidate {
	private String campany;
	private int fee;
	private String name;
	private String address;
	private float CGPAInterveiwRating;

	public Candidate(String name, String address, Float CGPAInterveiwRating) {
		this.setName(name);
		this.setAddress(address);
		this.CGPAInterveiwRating = CGPAInterveiwRating;
	}

	public String checkCompanyAllocation(float CGPAInterveiwRating) {
		this.CGPAInterveiwRating = CGPAInterveiwRating;
		if (this.CGPAInterveiwRating >= 7.5)
			campany = "SwabhaTechLab";
		else
			campany = "ActiSolution";
		return campany;
	}

	public int checkFeeStructure(float pCGPAInterveiwRating) {
		if (pCGPAInterveiwRating < 7.5)
			fee = 40000;
		return fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float CGPAInterveiwRating() {
		return CGPAInterveiwRating;
	}

	public void setCGPAInterveiwRating(float CGPAInterveiwRating) {
		this.CGPAInterveiwRating = CGPAInterveiwRating;
	}

}
