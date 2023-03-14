import java.util.*;

public class AllEx {
	public static boolean next(int[] a) {
		int i = a.length-1;
		while (i > 0 && a[i-1] >= a[i]) {
			i-=1;
		}
		if (i <= 0) {
			return false;
		}
		
		int j = a.length-1;
		while(a[i-1] >= a[j]) {
			j -= 1;
		}
			
		int tmp = a[i-1]; 
		a[i-1] = a[j];
		a[j] = tmp;
		
		j = a.length-1;
		while (i < j){
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			j--;
			i++;
				
			}	
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}
		do {
			for(int i=0; i<n; i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println();
			
		}while(next(a));
		
	}
}
