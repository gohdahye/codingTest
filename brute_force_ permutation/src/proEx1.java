import java.util.*;


public class proEx1 {

	public static void main(String[] args) {
		int array[] = {0,0,1,0};
		int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        	    
        System.out.println(answer);
	}

}
