package Dynamic_programming;

public class Countboardpath_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int [] strg= new int[n+1];
		System.out.println(cbp(0, 10, strg));
		System.out.println(cbp_i(0, 10));

	}
	public static int cbp(int curr,int end, int [] strg) {
		if(curr>end) {
			return 0;
		}
		if(curr==end) {
			return 1;
		}
		if(strg[curr]!=0) {
			return strg[curr]; 
		}
		int count=0;
		for(int dice=1; dice<=6; dice++) {
			count= count+cbp(curr+dice,end,strg);
		}
		strg[curr]=count;
		return count;
	}
	
	public static int cbp_i(int curr,int end) {
		int [] strg= new int[end+1];
		strg[end]=1;
		for(int i=end-1; i>=0; i--) {
			int sum=0;
			for(int dice=1; dice<=6&&dice+i<strg.length;dice++) {
				sum= sum+strg[dice+i];
			}
			strg[i]=sum;
		}
		return strg[curr];
	}

}
