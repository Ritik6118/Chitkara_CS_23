package Backtracking;

import java.util.Scanner;

public class rat_chase_cheese {

	public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        char[][] arr=new char[row][];
        for(int i=0;i<row;i++){
            arr[i]=sc.next().toCharArray();
        }
        
        int[][] ans=new int[row][col];
        solve(arr,0,0,ans);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
    }
    
	static boolean flag=false;
    public static void solve(char[][] arr,int cr,int cc,int[][]ans){
    	if(cr>=arr.length||cc>=arr[0].length||cr<0||cc<0||arr[cr][cc]=='X'){
    		return;
    	}
        if(cr==arr.length-1 && cc==arr[0].length-1){
            flag=true;
            ans[cr][cc]=1;
            display(ans);
            ans[cr][cc]=0;
            return;
        }
        arr[cr][cc]='X';
        ans[cr][cc]=1;
        solve(arr,cr+1,cc,ans);
        solve(arr,cr,cc+1,ans);
        solve(arr,cr-1,cc,ans);
        solve(arr,cr,cc-1,ans);
        ans[cr][cc]=0;
        arr[cr][cc]='O';
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
