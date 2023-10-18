package Question_Bank;

public class Remove_Duplicates_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="programming";
		solution(s,"");
	}

	private static void solution(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return;
		}
		if(ans.length()==0 || s.charAt(0)!=ans.charAt(ans.length()-1)) {			
			solution(s.substring(1),ans+s.charAt(0));
		}else {
			solution(s.substring(1),ans);
		}
	}

}
