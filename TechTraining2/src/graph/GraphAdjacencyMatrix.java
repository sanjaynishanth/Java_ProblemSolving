package graph;
class GraphAdjacencyMatrix {
    private int[][] adjacencyMatrix; // 2D array to store graph edges
    private int vertices;           // Number of vertices

    // Constructor to initialize the graph
    public GraphAdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    // Method to add an edge
    public void addEdge(int source, int destination) {
        if (source >= vertices || destination >= vertices) {
            System.out.println("Invalid vertices!");
            return;
        }
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // For undirected graph
    }

    // Method to display the adjacency matrix
    public void displayMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int[] row : adjacencyMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

 public static void main(String[] args) {
        GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5); // Graph with 5 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayMatrix();
    }
}