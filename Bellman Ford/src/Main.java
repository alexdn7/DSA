import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfVertices = scanner.nextInt();
        int numberOfEdges = scanner.nextInt();

        Edge [] edgeList = new Edge[numberOfEdges];
        for(int i = 0; i < numberOfEdges; i++) {
            edgeList[i] = new Edge();
            System.out.println("Enter source:");
            edgeList[i].setSource(scanner.nextInt());
            System.out.println("Enter destination:");
            edgeList[i].setDestination(scanner.nextInt());
            System.out.println("Enter weight:");
            edgeList[i].setWeight(scanner.nextInt());
            System.out.println();
        }

        Graph graph = new Graph(numberOfVertices, numberOfEdges, edgeList);
        System.out.println("Enter the souce for Bellman Ford algorithm:");
        int source = scanner.nextInt();
        graph.BellmanFord(source);
    }
}