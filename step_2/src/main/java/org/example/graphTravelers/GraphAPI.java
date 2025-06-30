package org.example.graphTravelers;

import java.util.List;

public interface GraphAPI {
    void addVertex(int v);
    void addEdge(String label, int from, int to);
    List<Integer> getNeighbors(int vertex);
}
