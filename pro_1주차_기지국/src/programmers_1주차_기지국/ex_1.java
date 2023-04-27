package programmers_1주차_기지국;

import java.util.*;


public class ex_1 {

	public static void main(String[] args) {
		int n = 16;
		int[] stations = {9};
		int w = 2;
		
		int answer = 0;	
    	int st = 0;
        int i=1;
        //기지국 순
        while(i<=n) {
        	if(st < stations.length && stations[st] - w <= i) {
        		i = stations[st] + w + 1;
        		st++;
        	}else {
        		//기지국 세우기
        		answer++;
        		//전파 만큼 증가
        		i += w * 2 + 1;
        	}
 
        }
        
        System.out.println(answer);
	}

}
