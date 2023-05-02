import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph {
    int V, E;
    List<Edge> edges;

    public Graph(int v, int e) {
        V = v;
        E = e;
        edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    public void kruskalMST() {
        // Sort edges in ascending order of weight
        Collections.sort(edges, Comparator.comparingInt(o -> o.weight));
        
        // Create a new disjoint set for each vertex
        int[] parent = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }

        int mstWeight = 0;
        List<Edge> mst = new ArrayList<>();

        for (Edge edge : edges) {
            int srcParent = findParent(parent, edge.src);
            int destParent = findParent(parent, edge.dest);

            if (srcParent != destParent) {
                mst.add(edge);
                mstWeight += edge.weight;
                parent[srcParent] = destParent;
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
        System.out.println("Total weight: " + mstWeight);
    }

    private int findParent(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = findParent(parent, parent[vertex]);
        }
        return parent[vertex];
    }

}


public class kruskal {
    public static void main(String[] args) {
        Graph graph = new Graph(9, 12);
        graph.addEdge(0, 1, 4);
        graph.addEdge(1, 2, 8);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 9);
        graph.addEdge(4, 5, 10);
        graph.addEdge(5, 6, 2);
        graph.addEdge(6, 7, 1);
        graph.addEdge(7, 8, 7);
        graph.addEdge(0, 7, 8);
        graph.addEdge(7, 1, 11);
        graph.addEdge(7, 8, 7);
        graph.addEdge(6, 8, 6);
        graph.addEdge(2, 5, 4);
        graph.addEdge(2, 8, 2);
        graph.kruskalMST();
    }    
}
