package FinalHw;

public class HazardPay extends PayCalc {

	// creates new rate based on getpay method
	public HazardPay(double Rate) {
		super(Rate);
	}
//new rate made = time and a half
	public double computePay(double Time){
		return super.computePay(Time)*1.5;
	}

	
	
}