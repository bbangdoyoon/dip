package ex0714;

public class Ex02 {
	public static void printoneArr(int [] arr) {
		for (int i = 0; i < arr. length; i++)
			System.out.printf("arr[%d] = %d\n",i, arr[i]);
	}
	public static void printtwoArr(int [][] arr) {
		for (int i = 0; i < arr. length; i++) {
				printoneArr(arr[i]);
			    System.out.println();
	    }		    
    }
	public static void main(String[] args) {
		int a[][] = { {1,2,3,}, {4,5,6}, {7,8,9} };
		int b[] = a[0];
		int c[] = a[1];
		
		a[0] = a[2];       // 789 456 789가 됨
		a[1] = b;          // 789 123 789
		a[2] = c;  
		
		Ex01.printtwoArr(a);
	}

}
