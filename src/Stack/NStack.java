package Stack;

import java.util.* ;
import java.io.*; 
public class NStack {
    // Initialize your data structure.
    int [] arr;
    int [] next;
    int [] top;
    int free;
    
    public NStack(int N, int S) {
        // Write your code here.
        arr=new int[S];
        next=new int[S];
        top=new int[N];
        free=0;
        Arrays.fill(top,-1);
        for(int i=0;i<next.length;i++){
            next[i]=i+1;
        }
        next[next.length-1]=-1;
    }   

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        // Write your code here.
        if(free==-1){
            return false;
        }
        int idx=free;
        free=next[idx];
        next[idx]=top[m-1];
        top[m-1]=idx;
        arr[idx]=x;
        return true;
        
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.
        if(top[m-1]==-1){
            return -1;
        }
        int idx=top[m-1];
        top[m-1]=next[idx];
        next[idx]=free;
        free=idx;
        return arr[idx];
    }
}
