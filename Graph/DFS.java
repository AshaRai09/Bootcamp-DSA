import java.util.*;

public class DFS {

    // Add Edge
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);      // Remove for directed graph
    }

    // Recursive DFS
    static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {

        visited[s] = true;
        System.out.print(s + " ");

        for (int u : adj.get(s)) {

            if (!visited[u]) {
                DFSRec(adj, u, visited);
            }
        }
    }

    // DFS Function
    static void DFSG(ArrayList<ArrayList<Integer>> adj, int V, int s) {

        boolean[] visited = new boolean[V];

        DFSRec(adj, s, visited);
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);

        DFSG(adj, V, 0);
    }

}
