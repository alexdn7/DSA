import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private final int numberOfVertices;
    private final List<List<Integer>> adjacency_list;

    public Graph(int numberOfVertices) {

        this.numberOfVertices = numberOfVertices;
        adjacency_list = new ArrayList<>(numberOfVertices);
        for (int i = 0; i < numberOfVertices; i++) {
            adjacency_list.add(new ArrayList<>());
        }
    }

    public void addEdge(int firstNode, int secondNode) {
        adjacency_list.get(firstNode).add(secondNode);
    }

    public void BFS(int source) {

        boolean [] visited = new boolean[numberOfVertices];
        visited[source] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        while(!queue.isEmpty()) {

            int i = queue.poll();
            System.out.print(i + " ");

            for(int j: adjacency_list.get(i)) {
                if(!visited[j]) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }
}
