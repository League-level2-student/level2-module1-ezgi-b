package intro_to_array_lists;

import java.util.ArrayList;
import java.util.Random;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> listlistlist = new ArrayList<String>();
		Random r = new Random();
		
		for(int i = 0; i<10; i++) {
			String s = "";
			for(int j = 0; j<(r.nextInt(5)+2); j++) {
				s = s + (char)(r.nextInt(26) + 'a');
				if(j%(r.nextInt(4)+1)==0) {
					s = s + "a";
				}
			}
			listlistlist.add(s);
		}
		
		
		System.out.println("Words printed with for-loop:");
		
		for(int i = 0; i<listlistlist.size(); i++) {
			System.out.println(listlistlist.get(i));
		}
		
		System.out.println("");
		System.out.println("Words printed with for-each loop:");
		
		for(String bob: listlistlist) {
			System.out.println(bob);
		}
		
		System.out.println("");
		System.out.println("Words in list that are even numbered elements:");
		
		for(int i = 0; i<listlistlist.size(); i++) {
			if(i%2==0) {
			System.out.println(listlistlist.get(i));
			}
		}
		
		System.out.println("");
		System.out.println("Words in reverse order:");
		
		
		for(int i = listlistlist.size(); i>0; i--) {
			System.out.println(listlistlist.get(i-1));
		}
		
		System.out.println("");
		System.out.println("Words which contain the letter e:");
		
		boolean e = false;
		for(int i = 0; i<listlistlist.size(); i++) {
			e = false;
			for(int j = 0; j<listlistlist.get(i).length(); j++) {
				
				if(listlistlist.get(i).charAt(j)=='e') {
					e = true;
				}
				
			}
			if(e==true) {
				System.out.println(listlistlist.get(i));
			}
				
		}
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
