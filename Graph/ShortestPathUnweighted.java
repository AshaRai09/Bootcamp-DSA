import java.util.*;

public class ShortestPathUnweighted {

    static void shortestPath(ArrayList<ArrayList<Integer>> graph, int V, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, -1); // -1 means not visited

        Queue<Integer> queue = new LinkedList<>();

        dist[src] = 0;
        queue.offer(src);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph.get(node)) {
                if (dist[neighbor] == -1) {
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        System.out.println("Shortest distance from source " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + " -> " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        // Undirected Graph
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(4).add(5);
        graph.get(5).add(4);

        int source = 0;

        shortestPath(graph, V, source);
    }
}