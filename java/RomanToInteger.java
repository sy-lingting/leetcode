package sy.leetcode;

public class RomanToInteger {

	public int romanToInt(String s) {
		System.out.println("s:"+s);
		if(s == null) return 0;
		if(s.length() == 1) {
			switch (s.charAt(0)) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				System.exit(0);
			}
		}
		else {
			int posM = s.indexOf('M');
			if(posM == 0) return 1000+romanToInt( s.substring(posM+1, s.length()));
			else if (posM > 0) 
				return romanToInt( s.substring(posM, s.length()))-romanToInt(s.substring(0, posM));
			int posD = s.indexOf('D');
			if(posD == 0) return 500+romanToInt( s.substring(posD+1, s.length()));
			else if(posD > 0) 
				return romanToInt( s.substring(posD, s.length()))-romanToInt(s.substring(0, posD));
			int posC = s.indexOf('C');
			if(posC == 0) return 100+romanToInt( s.substring(posC+1, s.length()));
			else if(posC > 0) 
				return romanToInt( s.substring(posC, s.length()))-romanToInt(s.substring(0, posC));
			int posL = s.indexOf('L');
			if(posL == 0) return 50+romanToInt( s.substring(posL+1, s.length()));
			else if(posL > 0) 
				return romanToInt( s.substring(posL, s.length()))-romanToInt(s.substring(0, posL));
			int posX = s.indexOf('X');
			if(posX == 0) return 10+romanToInt( s.substring(posX+1, s.length()));
			else if(posX > 0) 
				return romanToInt( s.substring(posX, s.length()))-romanToInt(s.substring(0, posX));
			int posV = s.indexOf('V');
			if(posV == 0) return 5+romanToInt( s.substring(posV+1, s.length()));
			else if(posV > 0) 
				return romanToInt( s.substring(posV, s.length()))-romanToInt(s.substring(0, posV));
			int posI = s.indexOf('I');
			if(posI == 0) return 1+romanToInt( s.substring(posI+1, s.length()));
			else if(posI > 0) 
				return romanToInt( s.substring(posI, s.length()))-romanToInt(s.substring(0, posI));	
		}
		return 0;
		
	}
	public static void main(String[] args) {
		String s = "MCMLXXVI";
		RomanToInteger rti = new RomanToInteger();
		//System.out.println(rti.romanToInt("M"));
		//System.out.println(rti.romanToInt("D"));
		//System.out.println(rti.romanToInt("C"));
		//System.out.println(rti.romanToInt("L"));
		//System.out.println(rti.romanToInt("X"));
		System.out.println(rti.romanToInt(s));
		System.out.println(rti.romanToInt("MDCCCXCIX"));
		//System.out.println(rti.romanToInt("CM"));
		//System.out.println(rti.romanToInt("MC"));
		//System.out.println(s.indexOf('L'));
		//System.out.println(s.substring(0, 3));
		//System.out.println(s.substring(3, 8));
	}

}
