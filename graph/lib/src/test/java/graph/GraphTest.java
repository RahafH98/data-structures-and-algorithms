package graph;

import graph.Graph;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testAddVertex() {
        Graph graph = new Graph();
        assertEquals(1, graph.addVertex(1));
        assertEquals(2, graph.addVertex(2));
        assertEquals(3, graph.addVertex(3));
    }

    @Test
    void testAddEdge() {
        Graph graph = new Graph();
        int vertex1 = graph.addVertex(1);
        int vertex2 = graph.addVertex(2);

        graph.addEdge(vertex1, vertex2, 2.0);

        assertEquals(2.0, graph.getNeighbors(vertex1).iterator().next().weight);
        assertEquals(2.0, graph.getNeighbors(vertex2).iterator().next().weight);
    }

    @Test
    void testRemoveEdge() {
        Graph graph = new Graph();
        int vertex1 = graph.addVertex(1);
        int vertex2 = graph.addVertex(2);

        graph.addEdge(vertex1, vertex2, 2.0);
        graph.removeEdge(vertex1, vertex2);

        assertTrue(graph.getNeighbors(vertex1).isEmpty());
        assertTrue(graph.getNeighbors(vertex2).isEmpty());
    }

    @Test
    void testRemoveVertex() {
        Graph graph = new Graph();
        int vertex1 = graph.addVertex(1);
        int vertex2 = graph.addVertex(2);

        graph.addEdge(vertex1, vertex2, 2.0);
        graph.removeVertex(vertex1);

        assertFalse(graph.getVertices().contains(vertex1));
        assertTrue(graph.getNeighbors(vertex2).isEmpty());
    }

}
