package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testAddVertex() {
        Graph graph = new Graph();
        int vertex = graph.addVertex(1);
        assertTrue(graph.getVertices().contains(vertex));
    }

    @Test
    void testAddEdge() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2, 1.0);
        assertTrue(graph.getNeighbors(1).size() == 1);
        assertTrue(graph.getNeighbors(2).size() == 1);
    }

    @Test
    void testRemoveVertex() {
        Graph graph = new Graph();
        int vertex = graph.addVertex(1);
        graph.removeVertex(vertex);
        assertFalse(graph.getVertices().contains(vertex));
    }

    @Test
    void testBreadthFirst() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2, 1.0);
        graph.addVertex(3);
        graph.addEdge(2, 3, 1.0);
        graph.addVertex(4);

        assertEquals("[1, 2, 3]", graph.breadthFirst(1).toString());
    }

    @Test
    void testDepthFirst() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2, 1.0);
        graph.addVertex(3);
        graph.addEdge(2, 3, 1.0);
        graph.addVertex(4);

        assertEquals("[1, 2, 3]", graph.depthFirst(1).toString());
    }

    @Test
    void testBusinessTripValidRoute() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 8);
        graph.addEdge(2, 3, 15);

        String[] validRoute = {"1", "2", "3"};
        Integer cost = graph.businessTrip(validRoute);

        assertNotNull(cost);
        assertEquals(23, cost);
    }

    @Test
    void testBusinessTripInvalidRoute() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 8);
        graph.addEdge(2, 3, 15);

        String[] invalidRoute = {"1", "3", "2"};
        Integer cost = graph.businessTrip(invalidRoute);

        assertNull(cost);
    }

    @Test
    void testBusinessTripNonExistentCity() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 8);
        graph.addEdge(2, 3, 15);

        String[] nonExistentCityRoute = {"1", "4", "3"};
        Integer cost = graph.businessTrip(nonExistentCityRoute);

        assertNull(cost);
    }
}
