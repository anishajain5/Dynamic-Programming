package Dynamic_programming;

public class Longest_common_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aabb";
		String s2="abab";
		System.out.println(lcs_i(s1,s2));

	}
	
	public static int lcs_i(String s1, String s2) {
		int [][] strg= new int[s1.length()+1][s2.length()+1];
		strg[s1.length()][s2.length()]=0;
		for(int i=s1.length();i>=0;i--) {
			for(int j= s2.length(); j>=0; j--) {
				if(i==s1.length()||j==s2.length()) {
					strg[i][j]=0;
					continue;
				}
				if(s1.charAt(i)==s2.charAt(j)) {
					strg[i][j]=1+strg[i+1][j+1];
				}
				else {
					strg[i][j]=Math.max(strg[i+1][j], strg[i][j]);
				}
			}
		}
		return strg[0][0];

}
}