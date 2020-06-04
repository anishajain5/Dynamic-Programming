package Dynamic_programming;

public class Count_mazepath_dp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ec=2;
		int er=2;
		int [][] strg= new int[er+1][ec+1];
System.out.println(cmp(0, 0, er, ec, strg));
System.out.println(cmp_i(0, 0, er, ec));
	}
	
	public static int cmp(int cr,int cc, int er,int ec, int [][] strg) {
		if(cc>ec||cr>er) {
			return 0;
		}
		if(cc==ec&&cr==er) {
			return 1;
		}
		if(strg[cr][cc]!=0) {
			return strg[cr][cc];
		}
		int count=0;
		count=count+cmp(cr+1, cc, er, ec, strg);
		count= count+cmp(cr, cc+1, er, ec, strg);
		strg[cr][cc]=count;
		return count;
	}
 public static int cmp_i(int cr,int cc ,int er, int ec) {
	 int [][] strg= new int [er+1][ec+1];
	 strg[ec][er]=1;
	 for(int i=er;i>=0;i--) {
		 for(int j=ec; j>=0;j--) {
			 if(i==er||j==ec) {
				 strg[i][j]=1;
			 }
			 else {
				 strg[i][j]= strg[i+1][j]+strg[i][j+1];
			 }
		 }
	 }
	 return strg[cr][cc];
 }
	

}
