import java.util.Arrays;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Rotate_array_right {

	/**
	 * @param args
	 */
	
	
	public static void rotate_right(int[] arr,int k) 
	{
		int count = 0;
		while(count < k) {
			
			count++;
			int temp = 0;
			temp = arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
		
				arr[i] = arr[i-1];
						
			}
//			for(int i=0;i<arr.length-1;i++) {
//				
//				arr[i+1] = arr[i];
//						
//			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	} 

	public static void rotate_left(int[] arr,int k) 
	{
		int count = 0;
		while(count < k) {
			
			count++;
			int temp = 0;
			temp = arr[0];
			for(int i=0;i<arr.length-1;i++) {
		
				arr[i] = arr[i+1];
						
			}
			arr[arr.length-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {1,2,3,4,5,6};
		int[] array1 = new int[] {1,2,3,4,5,6};
		
		rotate_right(array,2);
		rotate_left(array1,2);
		
		
	}

}
