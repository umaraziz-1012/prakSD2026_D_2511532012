package Pekan2_2511532012;
import java.util.*;
public class ArrayList1_2511532012 {
	public static void main(String[] args) {
		// Size of the array list
		int n = 5;
		// Declaring the ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		//Appending new elements at the end of the list 
		for (int i = 1; i <= n ; i++)
			arrli.add(i);
		//printing elements
		System.out.println(arrli);
		//remove elements att index 3
		arrli.remove(3);
		//displaying the array list
		//after deletion
		System.out.println(arrli);
		//printing element one bye one
		for (int i = 0; i < arrli.size(); i++)
			System.out.println(arrli.get(i) + " ");
	}

}
