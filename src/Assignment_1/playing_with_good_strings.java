package Assignment_1;

import java.util.Scanner;

public class playing_with_good_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		good_string(s);
	}

	private static void good_string(String s) {
		// TODO Auto-generated method stub
		int ans=0;
        int c=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                c+=1;
            }
            else{
                if(c>ans){
                    ans=c;
                }
                c=0;
            }
        }
        if(c>ans){
            ans=c;
        }
        System.out.println(ans);
	}


}
