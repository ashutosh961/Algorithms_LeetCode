/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	 int partition(int Array[],int low,int high) {
		int i,j;
		int temp,temp1;
		int pivot=Array[high];
		i=low-1;
		
		for(j=low;j<high;j++) {
			
			if(Array[j]<=pivot) {
				i++;
				temp = Array[i];
				Array[i]=Array[j];
				Array[j]=temp;
				
			}
		}
		
		temp1 = Array[i+1];
		Array[i+1] =  Array[high];
		Array[high]=temp1;
		
	 return i+1; 	
	}
	
	
	 void quicksort(int Array[],int low,int high) {
		
		if(low<high) {
			
			int pi = partition(Array,low,high);
			quicksort(Array,low,pi-1);
			quicksort(Array,pi+1,high);
			
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Array[]= {4,3,6,2,1};
		
        QuickSort ob = new QuickSort();
        
        ob.quicksort(Array,0,Array.length-1);
        
        for(int i=0;i<=Array.length-1;i++) {
        
        System.out.println(Array[i]+"");	
        }
        
		
		
	}

}
