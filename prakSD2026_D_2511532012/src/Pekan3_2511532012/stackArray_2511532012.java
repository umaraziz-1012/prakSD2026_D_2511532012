package Pekan3_2511532012;

public class stackArray_2511532012 {
	static final int MAX_2012 = 1000;
	int top_2012;
	int a[] = new int [MAX_2012];
	boolean isEmpty()
	{
		return (top_2012 < 0) ;
	}
	stackArray_2511532012()
	{
		top_2012 = -1;
	}
	boolean push_2012(int x)
	{
		if (top_2012 >= (MAX_2012 -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_2012] = x;
			System.out.println(x + "dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2012 ()
	{
		if (top_2012 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_2012--];
			return x;
		}
	}
	int peek_2012()
	{if (top_2012 < 0) {
		System.out.println("stack underflow");
		return 0;
	}
	else {
		int x = a[top_2012];
		return x;
	}
}
	void print () {
		for(int i = top_2012; i>-1 ; i--) {
			System.out.print(" " + a[i]);
		}
	}
}