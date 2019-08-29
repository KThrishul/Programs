package Solution4;
import java.util.*;
public class Solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		Stack<Integer> st = new Stack<Integer>();
		st.push(new Integer(a[0]));
		int j=0;
		for(int i=1;i<n;)
		{
			if(!st.empty() && (int)st.peek()==j+1)
				while(!st.empty() && (int)st.peek()==j+1)
					j=(int)st.pop();
			else
				st.push(new Integer(a[i++]));
		}
		while(!st.empty() && (int)st.peek()==j+1)
			j=(int)st.pop();
		if(st.empty())
			System.out.println("Happy");
		else
			System.out.println("Sad");
		

	}

}
