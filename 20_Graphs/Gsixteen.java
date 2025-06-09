// detect cycle in direct graph using dfs

import java.util.ArrayList;

public class Gsixteen {
    private boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int pathVis[]){
        vis[node] = 1;
        pathVis[node] = 1;

        // traverse for adjacent nodes
        for (int it : adj.get(node)) {
            if (dfsCheck(it, adj, vis, pathVis) == true) {
                return true;
            }
            //if node has been previously visited
            //but it has to be visited on same path
            else if (pathVis[it] == 1) {
                return true;
            }
        }
        pathVis[node] = 0;
        return false; 
    }

    //function to detect cycle in directed graph
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        int vis[] = new int[V];
        int pathVis[] = new int[V];
        
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfsCheck(i, adj, vis, pathVis) == true) {
                    return true;
                }
            }
        }
        return false;
    }
}
