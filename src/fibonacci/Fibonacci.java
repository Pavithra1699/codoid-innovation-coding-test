package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n=10, n1=0,n2=1,n3=0;
		
		System.out.println("The initial numbers are:" + " "+ n1 + " " + n2);
		
		for (int i=1;i<=n;i++) {
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.println("The Fibonacci series:" +n3);
		}
	}

}
