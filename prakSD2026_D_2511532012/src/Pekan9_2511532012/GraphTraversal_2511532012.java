package Pekan9_2511532012;
import java.util.*;

public class GraphTraversal_2511532012 {
    private Map<String, List<String>> graph_2012 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_2012, String node2_2012) {
        graph_2012.putIfAbsent(node1_2012, new ArrayList<>());
        graph_2012.putIfAbsent(node2_2012, new ArrayList<>());
        graph_2012.get(node1_2012).add(node2_2012);
        graph_2012.get(node2_2012).add(node1_2012);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_2012 : graph_2012.keySet()) {
            System.out.print(node_2012 + " -> ");
            List<String> neighbors_2012 = graph_2012.get(node_2012);
            System.out.println(String.join(", ", neighbors_2012));
        }
    }

    // DFS rekursif
    public void dfs(String start_2012) {
        Set<String> visited_2012 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_2012(start_2012, visited_2012);
        System.out.println();
    }

    private void dfsHelper_2012(String current_2012, Set<String> visited_2012) {
        if (visited_2012.contains(current_2012)) return;
        visited_2012.add(current_2012);
        System.out.print(current_2012 + " ");
        for (String neighbor_2012 : graph_2012.getOrDefault(current_2012, new ArrayList<>())) {
            dfsHelper_2012(neighbor_2012, visited_2012);
        }
    }

    // BFS iteratif
    public void bfs(String start_2012) {
        Set<String> visited_2012 = new HashSet<>();
        Queue<String> queue_2012 = new LinkedList<>();
        queue_2012.add(start_2012);
        visited_2012.add(start_2012);
        System.out.println("Penelusuran BFS:");
        while (!queue_2012.isEmpty()) {
            String current_2012 = queue_2012.poll();
            System.out.print(current_2012 + " ");
            for (String neighbor_2012 : graph_2012.getOrDefault(current_2012, new ArrayList<>())) {
                if (!visited_2012.contains(neighbor_2012)) {
                    queue_2012.add(neighbor_2012);
                    visited_2012.add(neighbor_2012);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args_2012) {
        GraphTraversal_2511532012 graph_2012 = new GraphTraversal_2511532012();
        // Contoh graf: A-B, A-C, B-D, B-E
        graph_2012.addEdge("A", "B");
        graph_2012.addEdge("A", "C");
        graph_2012.addEdge("B", "D");
        graph_2012.addEdge("B", "E");
        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_2012.printGraph();
        // Lakukan penelusuran
        graph_2012.dfs("A");
        graph_2012.bfs("A");
    }
}