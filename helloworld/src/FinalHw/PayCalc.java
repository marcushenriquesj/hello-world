package FinalHw;

public abstract class PayCalc {

	// a public object called payrate which is = to the pay per hour
	private double payRate;
	
// A method to get the amount paid to someone based on their rate of pay per hour times the amount of hours
	public double computePay(double Time){
		
		double hoursworked = Time;
		double TotalPaid = (hoursworked*payRate);
		return TotalPaid;
	}
	
	//gets the payRate = to the input from another class
	public PayCalc(double Rate){
		Double theRate = Rate;
		payRate = theRate;
	}

	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	
	
}
