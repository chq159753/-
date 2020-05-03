package Text;
import java.util.Scanner;
public class TEXT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int i,x,y=100,sum=1,j,n=0;
		x=s.nextInt();
		for(i=1;i<=x;i++) {
			sum=sum*i;
			
	}
		sum=sum+1;
		for(j=2;j<sum;j++) {
			if(sum%j==0);
			System.out.println("是素数");
			n=n+1;
			break;
		
		}
		if(n==0)
		System.out.println("是合数");

	}
}
