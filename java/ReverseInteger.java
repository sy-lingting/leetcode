package sy.leetcode;

public class ReverseInteger {

	public static int reverse(int x) {
		int y = 0;
		int temp = 0;
		while(x != 0) {
			temp = y*10 + x%10;
			x = x/10;
			if (temp * y < 0) System.exit(0);
			y = temp;
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-100400));
		System.out.println(reverse(1000000003));
		System.out.println(reverse(100400));
	}

}
