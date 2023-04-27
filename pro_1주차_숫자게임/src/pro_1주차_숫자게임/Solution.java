package pro_1주차_숫자게임;

import java.util.*;

import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		int answer = 0;
		int[] A = {5,1,3,7};
		int[] B = {2,2,6,8};
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<A.length; i++){
            int tmp=0;
            int j=0;
            while(tmp == 0){
                if(A[i] < B[j]){
                	if(st.contains(B[j]) == false) {
                		tmp++;
                        answer++;
                        st.push(B[j]);
                	} 
                    
                }else{
                    j++;
                }
            }
        }
        System.out.println(answer);

	}

}
