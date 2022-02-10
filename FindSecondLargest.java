package Week3Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {


		
		public static void main(String[] args) {
			Integer[] data = {3,2,11,4,6,7};
			
		int len = data.length;
			List<Integer> list=Arrays.asList(data); 
			
		
			Collections.sort(list);  
			int SecondLN=list.get(len-2);  
			
			System.out.println("Second Largest Number is"+"  "+SecondLN);
			
			
		}
	

}
