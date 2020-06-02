package Dynamic_programming;

public class fibonacci_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int [] strg= new int [n+1];
		System.out.println(fib_store(n, strg));
		System.out.println(fib_store(n));

	}
	
	public static int fib_store(int n, int [] strg) {
		if(n==0||n==1) {
			return n;
		}
		if(strg[n]!=0) {
			return strg[n];
		}
		int fnm1= fib_store(n-1, strg);
		int fnm2= fib_store(n-2, strg);
		int fn= fnm1+fnm2;
		
		strg[n]=fn;
		return strg[n];
	}
	
	public static int fib_store(int n) {
		int [] strg= new int[n+1];
		strg[0]=0;
		strg[1]=1;
		for(int i=2; i<=n;i++) {
			strg[i]= strg[i-1]+strg[i-2];
		}
		return strg[n];
	}

}
