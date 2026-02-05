import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair {
    int distance;
    int node;
    
    Pair(int _distance, int _node) {
        this.distance = _distance;
        this.node = _node;
    }
}

public class GDijkstra {
    public int[] dijkstra(int V, int[][] edges, int S) {
        // code here
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int d = e[2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v, d)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u, d)));
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance - y.distance);
        
        int[] dist = new int[V];
        for(int i = 0; i < V; i++) dist[i] = (int)(1e9);
        
        dist[S] = 0;
        pq.add(new Pair(0, S));
        
        while(pq.size() != 0) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            for(int i = 0; i < adj.get(node).size(); i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                
                if(dis + edgeWeight < dist[adjNode]) {
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }
}
