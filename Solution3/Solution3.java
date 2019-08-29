package Solution3;
import java.util.Scanner;
import java.util.Arrays;
public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] f = new int[n];
		Arrays.fill(f, 0);
		for(int i=0;i<n;i++)
			s[i] = sc.nextInt();
		Arrays.sort(s);
		int i=0,j=1,sum=0;
		while(j!=n)
		{
			if(s[i]<s[j])
			{
				f[i]=1;
				i++;j++;
				continue;
			}
			j++;
		}
		for(int k=0;k<n;k++)
			if(f[k]==0)
				sum+=s[k];
		System.out.println(sum);	

	}

}
