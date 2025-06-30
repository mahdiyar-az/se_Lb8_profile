package org.example;

import org.example.graphTravelers.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GraphAPI graph = new JGraphTAdapter();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge("E1", 1, 2);
        graph.addEdge("E2", 1, 3);
        graph.addEdge("E3", 2, 4);
        graph.addEdge("E4", 3, 5);
        graph.addEdge("E5", 4, 5);

        Traverser dfs = new DfsGraphTraverser(graph);
        Traverser bfs = new BfsGraphTraverser(graph);

        List<Integer> dfsResult = dfs.traverse(1);
        List<Integer> bfsResult = bfs.traverse(1);

        System.out.println("Graph-DFS From node 1 is : " + dfsResult);
        System.out.println("Graph-BFS From node 1 is : " + bfsResult);
    }
}
