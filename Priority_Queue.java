/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class Priority_Queue {

	/**
	 * @param args
    */
	public static int heap_size = 0;
	public static  int[] HeapArray=new int[100];
	//public static int i;
	
	
	public static int  parent(int i) {
		return (i-1)/2;	
	}
	
	public static int left(int i) {
		
		return 2*i+1;
	}
	
	public static void swap(int a,int b) {
		
		int temp =a ;
		a=b;
		b=temp;
	}
	
	
	
	public static int right(int i) {return 2*i+2;}
	
	public static void insert(int k) {
		
		
		heap_size++;
		int i = heap_size-1;
		try {
			HeapArray[i] = k;
			while(i!=0 && HeapArray[parent(i)]>HeapArray[i]) {
				swap(HeapArray[i],HeapArray[parent(i)]);
				i = parent(i);
			}
		}
		catch(Exception e) {}
		
		
		
	}
	
	public static int getMin()
	{
		try {
		return HeapArray[0];}
		catch(Exception e) {
			
		}return 0;
		}
	
	
	
	public static void  MinHeap(int i) {
		
		int l = left(i);
		int r = right(i);
		int smallest = i;
		if(l < heap_size && HeapArray[l] < HeapArray[smallest] ) {
			smallest =  l;
		}
		if(r < heap_size && HeapArray[r] < HeapArray[smallest]){
			
			smallest = r;
		}
		
		if(smallest != i ) {
			
			swap(HeapArray[i],HeapArray[smallest]);
			MinHeap(smallest);
		}
			
	}
	
	
	public static void ExtractMin(int i) {
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert(1);
		insert(2);
		insert(3);
		
		int min = getMin();
		System.out.println(min);
		
	}

}
