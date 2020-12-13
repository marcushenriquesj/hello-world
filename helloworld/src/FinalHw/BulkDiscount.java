package FinalHw;

public class BulkDiscount extends DiscountPolicy {

	
	private int min;
	private double percentOff;
	
	public BulkDiscount(int theMin,double thePercentOff){
		
		min = theMin;
		percentOff = thePercentOff;
	}
	
	
	@Override
	public double getDiscount(int count, double itemCost) {
		// TODO Auto-generated method stub
		double discount = 0;
		if(count >= min){
			
			discount = ((count*itemCost)*percentOff)/100;
		}
		else {
			//nothing
		}
		
		
		return discount;
	}
}
