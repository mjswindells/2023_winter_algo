package DP;

public class boj4673 {
	static void selfNumber() {
		int [] cand=new int [10500];
		int [] exist=new int [10599];
		int cons=0;
		for(int i=0;i<10500;i++) {
			cand[i]=i;
			int copy=cand[i];
			cons=copy;
			while(copy>0) {
				cons=cons+copy%10;
				copy=copy/10;
			}
			exist[cons]=1;
			
		}
		for(int i=1;i<10001;i++) {
			if(exist[i]!=1) {
				System.out.println(i);
			}
		}
        
	}
	public static void main(String[] args)  {
		selfNumber();
	}
}
