package sy.leetcode;

public class RemoveElement {
    public static int removeElement(int[] A, int elem) {
        int length = A.length;
        for(int i=0; i < length; i++) {
        	if(A[i] == elem) {
        		for(int j=i; j < length-1; j++) {
        			A[j] = A[j+1];
        		}
        		length--;
        		i--;
        	}
        }
        return length;
    }
	public static void main(String[] args) {
		int[] A = new int[] {2,4,2,2,2,2,2,9};
		System.out.println(RemoveElement.removeElement(A, 2));
		for(int i=0; i<RemoveElement.removeElement(A, 2); i++)
			System.out.print(A[i]);
	}

}
