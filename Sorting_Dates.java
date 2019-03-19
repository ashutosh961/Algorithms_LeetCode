import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Sorting_Dates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String dates[] = {"05-11-2014", "23-08-2014","05-02-2013"};
		  
		  Arrays.sort(dates,new Comparator<String>() {
			  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			  int result = -1;
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				
				try {result = sdf.parse(arg0).compareTo(sdf.parse(arg1));}catch(Exception e) {}
				return result;
			}
			  
			  
		  });
		
		  
		  for(int i=0;i<dates.length;i++) {
			  
			  System.out.println(dates[i]);
			  
			  
		  }
		
	}

}
