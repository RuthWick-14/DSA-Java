import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Gtwo {

    public static ArrayList<Integer> bfsGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        Boolean vis[] = new Boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);

            for (int it: adj.get(node)) {
                if (vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        
    }
}
