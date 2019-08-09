package hamiltonian;
import java.util.Scanner;
public class HamiltonianAndLagrangian {

	public static void main(String[] args) {
		int n,a[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		int i;
		for(i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
				System.out.print(a[i+1]+" ");
		}
		System.out.print(a[i]);
		sc.close();
	}

}
