package pro_1주차_엘베;
import java.util.*;
public class Solution {
	  
	public static void main(String[] args) {
		int n = 2554;
		
        System.out.println(elevator(n));
	}
	private static int elevator(int floor) {
	    if(floor <= 1) return floor;
	    
	    int under10 = floor % 10;
	    int rest = floor / 10;
	    
	    //c1은 층수만큼 누른 경우
	    int c1 = under10 + elevator(rest);
	    //c2는 10의 보수만큼 누른 경우
	    int c2 = (10 - under10) + elevator(rest + 1);
	    return Math.min(c1, c2);
	  }

}
