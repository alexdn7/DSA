import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        int numberOfVertices = scanner.nextInt();
        Graph graph = new Graph(numberOfVertices);

        System.out.println("Enter the number of edges");
        int numberOfEdges = scanner.nextInt();

        for(int i = 0; i < numberOfEdges; i++) {
            System.out.println("Enter the first node:");
            int firstNode = scanner.nextInt();

            System.out.println("Enter the second node: ");
            int secondNode = scanner.nextInt();

            graph.addEdge(firstNode, secondNode);
            System.out.println();
        }

        System.out.println("Enter the source for BFS: ");
        int source = scanner.nextInt();

        System.out.println("\nThe result of BFS for your graph is:");
        graph.BFS(source);

    }
}