package candidateTest;

import candidate.*;

public class CandidateTest {
	static float CGPAInterveiwRating;
	public static void main(String args[]) {

		System.out.println("Enter CGPA Interview Rating");

		Candidate candidate1 = new Candidate("Pratibha", "Dahanu", 8.0f);
		Candidate candidate2 = new Candidate("Shweta", "VIrar", 8.5f);
		Candidate candidate3 = new Candidate("XYZ", "Vasai", 7.0f);
		CandidateTest.printInfo(candidate1);
		CandidateTest.printInfo(candidate2);
		CandidateTest.printInfo(candidate3);

	}

	public static void printInfo(Candidate candidate) {
		System.out.println("Name:" + candidate.getName());
		System.out.println("Address: " + candidate.getAddress());
		System.out.println("CGPA: " + candidate.CGPAInterveiwRating());
		System.out.println("Campany Allocated is "
				+ candidate.checkCompanyAllocation(candidate.CGPAInterveiwRating()));
		System.out.println("Fees to be paid by candidate is RS."
				+ candidate.checkFeeStructure(candidate.CGPAInterveiwRating()));
	}
}
