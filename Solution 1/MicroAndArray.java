package microandarray;
import java.util.Scanner;
public class MicroAndArray {

	public static void main(String[] args) {
		MinAmount M = new MinAmount();
		int T,N,K,z=0;
		int A[],count[];
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		count = new int[T];  
		for(int i=0;i<T;i++)
		{
			N = sc.nextInt();
			K = sc.nextInt();
			A = new int[N];
			for(int j=0;j<N;j++)
			{
				A[j] = sc.nextInt();
			}
			count[z] = M.MinAmo(A,N,K);
			z++;
		}
		for(int j=0;j<T;j++)
			System.out.println(count[j]);
		sc.close();
	}
	
}

class MinAmount {
	public int MinAmo(int[] A,int N,int K)
	{
		int c=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(A[j]<K)
				{
					for(int k=0;k<N;k++)
					{
						A[k]+=1;
					}
					c++;
				}
			}
		}
		return c;
	}
}
