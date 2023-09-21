package assignment_2;

public class obedient_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		System.out.println(isobedient(s,""));
	}

	private static boolean isobedient(String s, String ans) {
		// TODO Auto-generated method stub
		if(s.length()==0) {
			return true;
		}
		if(ans.length()==0 && s.charAt(0)!='a') {
			return false;
		}
		
		
		return false;
	}

}
