public class Graph {

    private final int numberOfVertices;
    private final int numberOfEdges;
    private final Edge [] edgeList;

    public Graph(int numberOfVertices, int numberOfEdges, Edge [] edgeList) {
        this.numberOfVertices = numberOfVertices;
        this.numberOfEdges = numberOfEdges;
        this.edgeList = edgeList;
    }

    public void BellmanFord(int source) {
        int [] distance = new int[numberOfVertices];

        for(int i = 0; i < numberOfVertices; i++)
            distance[i] = Integer.MAX_VALUE;

        distance[source] = 0;

        for(int i = 1; i < numberOfVertices; i++) {
            for(int j = 0; j < numberOfEdges; j++) {
                int first = edgeList[j].getSource();
                int second = edgeList[j].getDestination();
                int weight = edgeList[j].getWeight();

                distance[second] = Integer.min(distance[second], (distance[first] + weight));
            }
        }

        for(int i = 0; i < numberOfEdges; i++) {
            int first = edgeList[i].getSource();
            int second = edgeList[i].getDestination();
            int weight = edgeList[i].getWeight();

            if(distance[second] > distance[first] + weight) {
                System.out.println("Negative weight cycle detected!");
                return;
            }
        }

        System.out.println("Result:");
        for(int i = 0; i < numberOfVertices; i++) {
            System.out.println(i + "   " + distance[i]);
        }
    }
}
