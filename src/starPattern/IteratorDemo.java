package starPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	//create object for arrarList
	  
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		//add elements or objects
		alist.add(5);   //  to retrieve  this objects
		alist.add(8);
		alist.add(9);
		alist.add(10);
		
//		 to retrieve the objects we can use for loop
//		                                    for each
//		                                    iterator() and Iterator interface also 
Iterator<Integer> itr = alist.iterator(); //using this single line,we are converting arraylist into iterator
		
		while(itr.hasNext())  //how many objects are there,4 objects has
		{
			System.out.print("  "+ itr.next());
		}
		
		
		
		
	
	}

}
