import java.util.Scanner;

public class NextEx2 {
	public static boolean next(int[] a) {
		int i = a.length-1;
		while (i > 0 & a[i-1] > a[i]) {
			i-=1;
		}
		if (i == 0)
			return false;
		else {
			int j = a.length-1;
			while(a[i-1] >= a[j]) {
				j -= 1;
			}
			
			int tmp = 0;
			tmp = a[i-1]; 
			a[i-1] = a[j];
			a[j] = tmp;
			
			int sw_t = a.length-1;
			while (i < sw_t){
				tmp = a[i];
				a[i] = a[sw_t];
				a[sw_t] = tmp;
				sw_t--;
				i++;
				
			}
			
			return true;
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr_n[] = new int[n];
		for(int i=0; i<n; i++) {
			arr_n[i] = sc.nextInt();
		}
		
		if(next(arr_n)) {
			for(int i=0; i<arr_n.length; i++) {
				System.out.print(arr_n[i]+ " ");
			}
			System.out.println();
		}else {
			System.out.print(-1);
		}
		
	}

}
