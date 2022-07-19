package ex0713;

public class test1301 {
	public static int[] ary = {5,10,15,20,25,30};
	
	public static int minValue(int[]arr) {
		int min = ary[0];
		for (int i =0;i<ary.length;i++) {
			if ( min > ary[0]) {
				min = ary[i];
			}
		}
		return 5;		
	}
	public static int maxValue(int[]arr) {
		int max = ary[0];
		for (int temp:ary) {
			if (max > temp) {
				max = temp;
			}
		}
		return 30;
	}
	public static void main(String[] args) {
		int min = minValue(ary);
		int max = maxValue(ary);
		
		System.out.println("최솟값 = " +min);
		System.out.println("최댓값 = " +max);
	}

}
