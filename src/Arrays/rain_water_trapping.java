package Arrays;



public class rain_water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,1};
		int water=rainwater(arr);
		System.out.println(water);
	}

	public static int rainwater(int[] arr) {
		// TODO Auto-generated method stub
//		int l=0;
//		int[] left=new int[arr.length];
//		for (int i = 0; i < left.length; i++) {
//			left[i]=Math.max(l, arr[i]);
//			l=left[i];
//		}
//		int r=0;
//		int[] right=new int[arr.length];
//		for (int i = right.length-1; i >= 0; i--) {
//			right[i]=Math.max(r, arr[i]);
//			r=right[i];
//		}
		int l=0;
		int [] left=new int[arr.length ];
		for(int i=0;i<left.length;i++) {
			left[i]=Math.max(l, arr[i]);
			l=left[i];
		}
		int r=0;
		int [] right=new int[arr.length ];
		for(int i=right.length-1;i>=0;i--) {
			right[i]=Math.max(r, arr[i]);
			r=right[i];
		}
//		display(right);
		int water=0;
		for (int i = 0; i < arr.length; i++) {
			water+=Math.min(left[i], right[i])-arr[i];
		}
		return water;
		
		
		
		
		
		
		
		
		
//		display(right);
//		display(left);
		
	}

	private static void display(int[] right) {
		// TODO Auto-generated method stub
		for (int i = 0; i < right.length; i++) {
			System.out.print(right[i]+" ");
			
		}
		System.out.println();
	}
	

}
