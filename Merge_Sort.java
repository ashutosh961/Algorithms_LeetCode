/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Merge_Sort {

	/**
	 * @param args
	 */
	
	void  Merge(int Array[],int left,int middle,int right)
	{  
	   

		int n1 = middle-left+1;
		int n2 = right-middle;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;++i) {
			
			L[i] = Array[left+i];
			
		}
	
	   for(int j=0;j<n2;++j) {

			R[j] = Array[middle+1+j];
		}

	   int i=0;
	   int j=0;
		int k=left;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j])
			{
				Array[k] = L[i];
				i++;
			}
			else {
			
				Array[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
		Array[k] = L[i];
		i++;
		k++;
			
		}
		
	while(j<n2) {
			Array[k]=R[j];
			j++;
			k++;
			
		}	
	}
	
	
	/*(void sort(int Array[],int left ,int right)
	{
		if(left<right) {
		try {	
		int middle = (left +right)/2;
		
		sort(Array,left,middle);
		sort(Array,middle+1,right);
		Merge(Array,left,middle,right);
		}catch(Exception e) {
			
		}
			
	}}*/
	
	void sort(int Array[], int left, int right)
	{
		if (left < right)
		{try {
			// Find the middle point
			int middle = (left+right)/2;

			// Sort first and second halves
			sort(Array, left, middle);
			sort(Array , middle+1, right);

			// Merge the sorted halves
			Merge(Array, left, middle, right);
		}catch(Exception e) {
			
		}
	}
	}
	
	static void printArray(int Array[])
	{
		int n = Array.length;
		for (int i=0; i<n; ++i)
			System.out.print(Array[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = {12, 11, 13, 5, 6, 7};

		System.out.println("Given Array");
		printArray(Array);

		Merge_Sort ob = new Merge_Sort();
		ob.sort(Array, 0, Array.length-1);

		System.out.println("\nSorted array");
		printArray(Array);
			
		
	}

}
