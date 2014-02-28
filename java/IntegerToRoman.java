package sy.leetcode;

public class IntegerToRoman {
	public String intToRoman(int num) {
		if((num <= 0) || (num > 3999)) System.exit(0);
		String roman = new String("");
		int th = num / 1000;
		for(int i=0; i<th; i++)
			roman=roman+"M";
		num = num % 1000;
		
		int h = num / 100;
		if(h == 9) {
			roman=roman+"CM";
		} else if(h >= 5) {
			roman=roman+"D";
			h = h-5;
			for(int i=0; i<h; i++) {
				roman+="C";
			}
		} else if(h == 4) {
			roman+="CD";
		} else {
			for(int i=0; i<h; i++) {
				roman+="C";
			}
		}
		num = num % 100;
		
		int te = num / 10;
		if(te == 9) {
			roman=roman+"XC";
		} else if(te >= 5) {
			roman=roman+"L";
			te = te-5;
			for(int i=0; i<te; i++) {
				roman+="X";
			}
		} else if(te == 4) {
			roman+="XL";
		} else {
			for(int i=0; i<te; i++) {
				roman+="X";
			}
		}
		num = num % 10;
		
		int s = num;
		if(s == 9) {
			roman=roman+"IX";
		} else if(s >= 5) {
			roman=roman+"V";
			s = s-5;
			for(int i=0; i<s; i++) {
				roman+="I";
			}
		} else if(s == 4) {
			roman+="IV";
		} else {
			for(int i=0; i<s; i++) {
				roman+="I";
			}
		}
		return roman;
	}
	
	public static void main(String[] args) {
		IntegerToRoman itr = new IntegerToRoman();
		System.out.println(itr.intToRoman(3999));
	}
}
