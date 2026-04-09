package Pekan3_2511532012;

public class stackArrayDriver_2511532012 {
	
	public static void main(String[] args) {
		
		stackArray_2511532012 s = new stackArray_2511532012();
		s.push_2012(10);
		s.push_2012(20);
		s.push_2012(30);
		System.out.println(s.pop_2012 () + " di keluarkan dari stack");
		System.out.println("element teratas adalah : " + s.peek_2012());
		System.out.println("Element pada stack : ");
		s.print ();
	}

}
