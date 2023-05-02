BFS implementation in Java using OOP.

Input example (can be modified in main):

        Graph g = new Graph(9);
        g.addEdge(0, 4);
        g.addEdge(0, 8);
        g.addEdge(0, 2);
        g.addEdge(2, 5);
        g.addEdge(2, 1);
        g.addEdge(2, 8);
        g.addEdge(3, 7);
        g.addEdge(8, 3);
        g.addEdge(8, 6);
        g.addEdge(8, 7);
  
        System.out.println("Breadth First Search (starting from vertex 0)");

        g.BFS(0);


 Output:

        0 4 8 2 3 6 7 5 1 
