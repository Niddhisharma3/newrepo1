package Day3;

public class SwapExample {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp;
		System.out.println("before swap"+ a+ ""+ b);  // 10   20 
		
		temp =a;   //temp = 10  a =10  b= 20
		a=b;       //temp=10  a=20  b=20
		b= temp;   //temp= 10  a=20  b=10
		System.out.println("after swap"+ a+ ""+ b);  // 10   20 
		
	}

}
