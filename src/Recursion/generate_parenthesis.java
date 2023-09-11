package Recursion;
import java.util.*;
public class generate_parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		List<String> li=new ArrayList<>();
		generate(n,0,0,"");
	}

	private static void generate(int n, int open,int close, String ans) {
		// TODO Auto-generated method stub
		if(open==n && close==n) {
			System.out.println(ans);
			return;
		}
		if(open>n||close>n||close>open) {
			return;
		}
		generate(n,open+1,close,ans+"(");			
		generate(n,open,close+1,ans+")");						
		
		
		
	}

}
