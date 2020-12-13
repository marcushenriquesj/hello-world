package FinalHw;

public class SubCipher implements MessageEncoder {
	
	private int shift;
	
	public SubCipher(int theShift){
		shift = theShift;
	}
	
	@Override
	public String decode(String plainText) {
		String decode = "";
		for(int a =0; a < plainText.length(); a++){
			char x = plainText.charAt(a);
			x = rShiftCharacter(x);
			decode = decode + x;
			
		}
		
		
		
		return decode;
	}
	
	@Override
	public String encode(String plainText) {
		String encode = "";
		for(int b = 0; b < plainText.length(); b++){
			char x = plainText.charAt(b);
			x = shiftCharacter(x);
			encode = encode+x;
		}
		
		
		return encode;
	}

	
	Character shiftCharacter(Character x) {
		return  (char) (x + shift);
	}
	
	Character rShiftCharacter(Character x) {
		return  (char) (x - shift);
	}

}