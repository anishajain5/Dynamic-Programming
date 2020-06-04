package Dynamic_programming;

public class reduce_to1_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		int [] strg= new int[n+1];
		System.out.println(minsteps(n,strg));
		System.out.println(minsteps_i(n));

	}
	public static int minsteps(int n,int [] strg) {
		if(n==1) {
			return 0;
		}
		if(strg[n]!=0) {
			return strg[n];
		}
		int ans=Integer.MAX_VALUE;
		if(n%3==0) {
			int f1=1+minsteps(n/3,strg);
			ans= Math.min(ans, f1);
		}
		if(n%2==0) {
			int f2= 1+minsteps(n/2,strg);
			ans= Math.min(ans, f2);
		}
		int f3=1+minsteps(n-1,strg);
		ans=Math.min(ans, f3);
		strg[n]=ans;
		
		return ans;
	}
	
	public static int minsteps_i(int num) {
		int [] strg= new int[num+1];
		strg[1]=0;
		for(int i=2;i<=num;i++) {
			int f1= Integer.MAX_VALUE;
			int f2= Integer.MAX_VALUE;
			int f3= Integer.MAX_VALUE;
			if(i%3==0) {
				f1= strg[i/3];
			}
			if(i%2==0) {
				f2=strg[i/2];
			}
			f3=strg[i-1];
			strg[i]=Math.min(Math.min(f1, f2), f3)+1;
		}
		return strg[num];
	}

}
