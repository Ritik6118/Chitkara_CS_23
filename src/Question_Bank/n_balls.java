package Question_Bank;

public class n_balls {
	static int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		int c=0;
		int[] arr= {4,0,3,2};
		while(j<arr.length && i<arr.length) {
			while(arr[i]>=2) {
				arr[i]-=2;
				c++;
			}
			while(arr[i]>0 && arr[j]>0) {
				arr[i]--;
				arr[j]--;
				c++;
			}
			i++;
			j++;
		}
		System.out.println(c);
	}
	
	

}
