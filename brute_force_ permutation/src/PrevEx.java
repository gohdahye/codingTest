import java.util.Scanner;

public class PrevEx {
	public static boolean prev(int[] a) {
		int i = a.length-1;
		while (i > 0 && a[i-1] <= a[i]) {
			i-=1;
		}
		if (i <= 0)
			return false;
		else {
			int j = a.length-1;
			while(a[i-1] <= a[j]) {
				j -= 1;
			}
			
			int tmp = 0;
			tmp = a[i-1]; 
			a[i-1] = a[j];
			a[j] = tmp;
			
			j = a.length-1;
			
			while(i < j) {
				tmp = a[i];
				a[i]= a[j];
				a[j] = tmp;
				i++;
				j--;
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
		
		if(prev(arr_n)) {
			for(int i=0; i<arr_n.length; i++) {
				System.out.print(arr_n[i]+ " ");
			}
			System.out.println();
		}else {
			System.out.print("-1");
		}
		
	}

}
