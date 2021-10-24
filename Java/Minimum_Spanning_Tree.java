import java.util.*;
import java.lang.*;
import java.io.*;
 
class Minimum_Spanning_Tree {
    
    private static final int V = 5; // Number of vertices in the graph
 
    int minKey(int key[], Boolean mstSet[]){    //    function to find the vertex with minimum key value, from the set of vertices not yet included in MST

        int min = Integer.MAX_VALUE, min_index = -1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
    void printMST(int parent[], int graph[][]){   //function to print the constructed MST stored in parent[]
   
        System.out.println("\n\nEdge \t Weight");
        for (int i = 1; i < V; i++)
            System.out.println("\n"+ parent[i] + " - " + i + "\t   " + graph[i][parent[i]]);
    }
 

    void primMST(int graph[][]) {  //Function to construct and print MST for a graph represented using adjacency matrix representation
      
        int parent[] = new int[V];         // to store constructed MST
 
        int key[] = new int[V];
 
        Boolean mstSet[] = new Boolean[V];    // To represent set of vertices included in MST
 
        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
       
        key[0] = 0;           // this vertex is picked as first vertex

        parent[0] = -1;      // First node is always root of MST
 
 
        for (int count = 0; count < V - 1; count++) {
           
            int u = minKey(key, mstSet);
 
            mstSet[u] = true;       // Add  picked vertex to the MST 
 
             for(int v = 0; v < V; v++)
                  if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }
 
        printMST(parent, graph);
    }
 
    public static void main(String[] args)
    {
        
        Minimum_Spanning_Tree t = new Minimum_Spanning_Tree();
        int graph[][] = new int[][] { { 0, 1, 0, 10, 3, 0 },
                                      { 1,0,2,3,0,0 },
                                      { 0, 2,0,4,0,5 },
                                      { 10,3,4,0,4,1 },
                                      { 3,0,0,4,0,0},
                                      { 0,0,5,1,0,0 }};
 
    
        t.primMST(graph);
    }
}