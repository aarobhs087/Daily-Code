// User function Template for Java

class Solution {
   
    static final int CHARS = 26;

    // Function to check if the array of strings can form a circle
    public int isCircle(String arr[]) {
        // Create a graph with 26 vertices (for each letter 'a' to 'z')
        Graph g = new Graph(CHARS);

        // Create an edge from first character to last character of every string
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            g.addEdge(s.charAt(0) - 'a', s.charAt(s.length() - 1) - 'a');
        }

        // The given array of strings can be chained if there is an Eulerian cycle in the graph
        return g.isEulerianCycle() ? 1 : 0;
    }

    // Graph class for handling the directed graph
    class Graph {
        int V;
        List<List<Integer>> adj;
        int[] in;

        // Constructor
        Graph(int V) {
            this.V = V;
            in = new int[V];
            adj = new ArrayList<>(V);

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Function to add an edge to the graph
        void addEdge(int v, int w) {
            adj.get(v).add(w);
            in[w]++;
        }

        // Function to check if there is an Eulerian Cycle in the graph
        boolean isEulerianCycle() {
            // Check if all non-zero degree vertices are strongly connected
            if (!isSC()) {
                return false;
            }

            // Check if in-degree and out-degree of every vertex are the same
            for (int i = 0; i < V; i++) {
                if (adj.get(i).size() != in[i]) {
                    return false;
                }
            }

            return true;
        }

        // Function to check if all non-zero degree vertices are strongly connected
        boolean isSC() {
            boolean[] visited = new boolean[V];

            // Find the first vertex with a non-zero degree
            int n;
            for (n = 0; n < V; n++) {
                if (adj.get(n).size() > 0) {
                    break;
                }
            }

            // Do DFS traversal starting from first non-zero degree vertex
            DFSUtil(n, visited);

            // If DFS traversal doesn't visit all vertices, return false
            for (int i = 0; i < V; i++) {
                if (adj.get(i).size() > 0 && !visited[i]) {
                    return false;
                }
            }

            // Create a reversed graph and check again with DFS
            Graph gr = getTranspose();

            visited = new boolean[V];
            gr.DFSUtil(n, visited);

            // If all vertices are not visited in the second DFS, return false
            for (int i = 0; i < V; i++) {
                if (adj.get(i).size() > 0 && !visited[i]) {
                    return false;
                }
            }

            return true;
        }

        // DFS function for graph traversal
        void DFSUtil(int v, boolean[] visited) {
            visited[v] = true;

            for (int i : adj.get(v)) {
                if (!visited[i]) {
                    DFSUtil(i, visited);
                }
            }
        }

        // Function to get the transpose of the graph
        Graph getTranspose() {
            Graph g = new Graph(V);
            for (int v = 0; v < V; v++) {
                for (int i : adj.get(v)) {
                    g.addEdge(i, v);
                    g.in[v]++;
                }
            }
            return g;
        }
    }
}
