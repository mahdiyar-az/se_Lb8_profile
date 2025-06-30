package org.example.graphTravelers;

import edu.uci.ics.jung.graph.SparseMultigraph;

import java.util.ArrayList;
import java.util.List;

public class JungGraphAdapter implements GraphAPI {
    private final SparseMultigraph<Integer, String> graph;

    public JungGraphAdapter() {
        this.graph = new SparseMultigraph<>();
    }

    @Override
    public void addVertex(int v) {
        graph.addVertex(v);
    }

    @Override
    public void addEdge(String label, int from, int to) {
        graph.addEdge(label, from, to);
    }

    @Override
    public List<Integer> getNeighbors(int vertex) {
        return new ArrayList<>(graph.getNeighbors(vertex));
    }

    public SparseMultigraph<Integer, String> getGraph() {
        return graph;
    }
}
