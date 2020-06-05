package Dynamic_programming;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abgb";
		String s2="agbg";
		System.out.println(ed_i(s1, s2));

	}
	public static int ed_i(String s1, String s2) {
		int [][] strg= new int[s1.length()+1][s2.length()+1];
		strg[s1.length()][s2.length()]=0;
		for(int i=s1.length();i>=0;i--) {
			for(int j=s2.length();j>=0;j--) {
				if(i==s1.length()) {
				strg[i][j]=s2.length()-j;
				continue;
			}
			if(j==s2.length()) {
				strg[i][j]=s1.length()-i;
				continue;
			}
			if(s1.charAt(i)==s2.charAt(j)) {
				strg[i][j]= strg[i+1][j];
			}
			else {
				int f1= strg[i+1][j+1];
				int f2= strg[i+1][j];
				int f3= strg[i][j+1];
				strg[i][j]=Math.min(Math.min(f1, f2), f3)+1;
			}
		}
	}
		return strg[0][0];
	}
}
