package graph;



import java.util.*;

class Edge {
    int source;
    int destination;
    double weight;

    public Edge(int source, int destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class Graph {
    private Map<Integer, Set<Edge>> adjacencyList;
    private Set<Integer> vertices;

    public Graph() {
        this.adjacencyList = new HashMap<>();
        this.vertices = new HashSet<>();
    }

    public int addVertex(int value) {
        vertices.add(value);
        adjacencyList.put(value, new HashSet<>());
        return value;
    }

    public void addEdge(int source, int destination, double weight) {
        if (!vertices.contains(source) || !vertices.contains(destination)) {
            throw new IllegalArgumentException("Source or destination vertex does not exist.");
        }

        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);
        adjacencyList.get(destination).add(edge);
    }

    public void removeVertex(int vertex) {
        if (!vertices.contains(vertex)) {
            throw new IllegalArgumentException("Vertex does not exist.");
        }

        vertices.remove(vertex);
        adjacencyList.remove(vertex);

        // Remove edges containing the vertex
        for (Set<Edge> edges : adjacencyList.values()) {
            edges.removeIf(edge -> edge.source == vertex || edge.destination == vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (!vertices.contains(source) || !vertices.contains(destination)) {
            throw new IllegalArgumentException("Source or destination vertex does not exist.");
        }

        adjacencyList.get(source).removeIf(edge -> edge.destination == destination);
        adjacencyList.get(destination).removeIf(edge -> edge.source == source);
    }

    public Collection<Integer> getVertices() {
        return vertices;
    }

    public Collection<Edge> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, Collections.emptySet());
    }

    public int size() {
        return vertices.size();
    }
}
