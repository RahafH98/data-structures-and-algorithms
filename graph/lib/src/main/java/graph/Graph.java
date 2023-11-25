package graph;

import java.util.*;

class Edge {
    public int source;
    public int destination;
    private double weight;

    public Edge(int source, int destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
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

    public List<Integer> getEdges(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            Set<Edge> edges = adjacencyList.get(vertex);
            List<Integer> destinationVertices = new ArrayList<>();

            for (Edge edge : edges) {
                destinationVertices.add(edge.getDestination());
            }

            return destinationVertices;
        } else {
            return Collections.emptyList();
        }
    }

    public void addEdge(int vertex1, int vertex2, double weight) {
        if (!adjacencyList.containsKey(vertex1) || !adjacencyList.containsKey(vertex2)) {
            throw new IllegalArgumentException("Both vertices must exist in the graph.");
        }

        adjacencyList.get(vertex1).add(new Edge(vertex1, vertex2, weight));
        adjacencyList.get(vertex2).add(new Edge(vertex2, vertex1, weight));
    }

    public void removeVertex(int vertex) {
        if (!vertices.contains(vertex)) {
            throw new IllegalArgumentException("Vertex does not exist.");
        }

        vertices.remove(vertex);
        adjacencyList.remove(vertex);

        for (Set<Edge> edges : adjacencyList.values()) {
            edges.removeIf(edge -> edge.source == vertex || edge.destination == vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (!vertices.contains(source) || !vertices.contains(destination)) {
            throw new IllegalArgumentException("Source or destination vertex does not exist.");
        }

        adjacencyList.get(source).removeIf(edge -> edge.destination == destination);
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

    public Collection<Integer> breadthFirst(int startNode) {
        if (!vertices.contains(startNode)) {
            throw new IllegalArgumentException("Start node does not exist.");
        }

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            result.add(currentVertex);

            for (Edge edge : adjacencyList.get(currentVertex)) {
                int neighbor = (edge.source == currentVertex) ? edge.destination : edge.source;
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return result;
    }

    public Integer businessTrip(String[] cities) {
        int cost = 0;

        for (int i = 0; i < cities.length - 1; i++) {
            int sourceVertex = findVertex(cities[i]);
            int targetVertex = findVertex(cities[i + 1]);

            if (sourceVertex == -1 || targetVertex == -1) {
                return null;
            }

            boolean directFlightExists = false;

            for (Edge edge : getNeighbors(sourceVertex)) {
                if (edge.getDestination() == targetVertex) {
                    directFlightExists = true;
                    cost += edge.getWeight();
                    break;
                }
            }

            if (!directFlightExists) {
                return null;
            }
        }

        return cost;
    }

    private int findVertex(String cityName) {
        for (int vertex : vertices) {
            if (Integer.toString(vertex).equals(cityName)) {
                return vertex;
            }
        }
        return -1;
    }
}
