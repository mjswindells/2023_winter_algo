import java.util.*;

public class boj11729 {
	public int [] arr1;
	public int [] arr2;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		int ans=hanoi(n);
		System.out.println(ans);
	}
	public static int hanoi(int n) {
		if(n==1) {
			
			return 1;
		}
		else if(n==2) {
			return 3;
		}
		
		
		return 2*hanoi(n-1)+1;
	}

}
