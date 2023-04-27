package pro_1주차_가장큰수;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Solution {

	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		/* stream 사용 
		IntStream .of(numbers).mapToObj(n -> String.valueOf(n));
		*/
		
		String answer = IntStream.of(numbers).mapToObj(String::valueOf)
		.sorted((s1, s2) -> (s2+s1).compareTo(s1+s2))
		.collect(Collectors.joining());

		/* 기존 버전
		String[] strNums = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			strNums[i] = ""+ numbers[i];
		} */
		/*내장 함수 lamda
		Arrays.sort(strNums, (s1, s2) -> 
		(s2+s1).compareTo(s1+s2));
		*/
		
		/*bubble sort
		for(int i=0; i<strNums.length-1; i++) {
			for(int j=0; j<strNums.length; j++) {
				String s1 = strNums[i];
				String s2 = strNums[j];
				if((s1+s2).compareTo(s2+s1) < 0) {
					strNums[i] = strNums[j];
					strNums[j] = s1;
				}
			} */
		
		
		if(answer.startsWith("0")) System.out.println("0");
		else
			System.out.println(answer);

	}

}
