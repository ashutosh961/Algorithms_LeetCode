
public class Floyd_Warshall_Algorithm {

	public static int V=4;
	public static int INF = 9999;
	
	public static void floyd_warshall(int graph[][]) {
		
	int dist[][] = new int[V][V];	
		
		
	for(int i=0;i<V;i++) {
		
		for(int j=0;j<V;j++) {
			
			dist[i][j] = graph[i][j];
			
		}
	}
	
	
	
	for(int k=0;k<V;k++) {
		
		for(int i=0;i<V;i++) {
			
			for(int j=0;j<V;j++) {
				
				if(dist[i][k] + dist[k][j] < dist[i][j]) {
					
					dist[i][j]  = dist[i][k] + dist[k][j];
					
				}
				
			}
			
		}
		
		
	}
		printSolution(dist);
	}
	
	
	  public static void printSolution(int dist[][]) 
	    { 
	        System.out.println("The following matrix shows the shortest "+ 
	                         "distances between every pair of vertices"); 
	        for (int i=0; i<V; ++i) 
	        { 
	            for (int j=0; j<V; ++j) 
	            { 
	                if (dist[i][j]== INF) 
	                    System.out.print("INF "); 
	                else
	                    System.out.print(dist[i][j]+"   "); 
	            } 
	            System.out.println(); 
	        } 
	    } 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int graph[][] = { {0,   5,  INF, 10}, 
                   {INF, 0,   3, INF}, 
                   {INF, INF, 0,   1}, 
                   {INF, INF, INF, 0} 
                 }; 
		
		   floyd_warshall(graph);
		   

	}

}
