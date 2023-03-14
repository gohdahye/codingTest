import java.util.*;

public class NextsunEX {
	public static boolean next_permutation(int[] a) {
		int i = a.length-1;
		while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }
		// i항은 a[0] ~ a[i-1]으로 시작하는 마지막 순열을 구하기 위한 시작하는 항
		
		if (i <= 0) {
			return false;
		}
		// i가 0이면 이미 내림차순 정렬이 되어 있는 상태
		
		int j = a.length-1;
		while(a[j] <= a[i-1]) {
			j -= 1;
		}
		// j항은 i-1항 보다는 같거나 크면서 가장 오른쪽에 있는 수(가장 작은 수)
		
		int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;
        //a[i-1] 항과 a[j] swap

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        //a[i] 항과 a[j] 는 swap 시키면 끝항과 첫항 swap
        //i를 증가, j를 감소시키면 오름차순으로 바뀜
		return true;
		// 다 구했으면true 반환시켜서 정렬을 했음을 알리
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		//next permutation class 가 true를 반환하면 정렬을 한 기록이 있다.
		if (next_permutation(a)) {
			for(int i=0; i<n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}else {
			System.out.println("-1");
		}
		
	}

}
