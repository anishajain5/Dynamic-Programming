package Dynamic_programming;

public class Knapsack_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wts= {1,2,3};
		int[] values= {10,1,5};
		int capacity=5;
		
		System.out.println(knapsackI(wts, values, capacity));


	}
	
	public static int knapsackI(int [] wts, int [] values, int capacity) {
		// we can avoid hard coding first row and first column as it is already zero by default
		int [][] strg=new int [wts.length+1][capacity+1];
		for(int i=1; i<=wts.length;i++) {
			for(int j=1;j<=capacity;j++) {
				if(wts[i-1]<=j) {
					strg[i][j]=Math.max(strg[i-1][j], values[i-1]+strg[i-1][j-wts[i-1]]);
				}
				else {
					strg[i][j]=strg[i-1][j];
				}
			}
		}
	return strg[wts.length][capacity];
	}

}
