package org.example.graphTravelers;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JGraphTAdapter implements GraphAPI {
    private final SimpleGraph<Integer, DefaultEdge> graph;

    public JGraphTAdapter() {
        this.graph = new SimpleGraph<>(DefaultEdge.class);
    }

    @Override
    public void addVertex(int v) {
        graph.addVertex(v);
    }

    @Override
    public void addEdge(String label, int from, int to) {
        graph.addEdge(from, to); // label در JGraphT کاربرد ندارد
    }

    @Override
    public List<Integer> getNeighbors(int vertex) {
        Set<DefaultEdge> edges = graph.edgesOf(vertex);
        List<Integer> neighbors = new ArrayList<>();
        for (DefaultEdge edge : edges) {
            Integer src = graph.getEdgeSource(edge);
            Integer tgt = graph.getEdgeTarget(edge);
            if (!src.equals(vertex)) {
                neighbors.add(src);
            } else {
                neighbors.add(tgt);
            }
        }
        return neighbors;
    }
}
