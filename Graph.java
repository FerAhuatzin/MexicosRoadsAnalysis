public class Graph {

    private String[] nodes;
    private double[][] adjacencyMatrix;
    private int numberOfNodes;
    int filledNodes;

    public Graph (int n) {
        numberOfNodes = n;
        filledNodes = 0;
        nodes = new String[n];
        adjacencyMatrix =  new double[n][n];
        cleanMatrix();
    } //end constructor

    public void cleanMatrix() {
        for (int i = 0; i<numberOfNodes; i++) {
            for (int j = 0; j<numberOfNodes; j++) {
                if (i==j) {
                    adjacencyMatrix[i][j] = 0;
                } //end if
                else {
                    adjacencyMatrix[i][j] = Double.POSITIVE_INFINITY;
                } //end else
            } //end for
        } //end for
    } //end cleanMatrix




    public void addNodeName (String name) {

        if (filledNodes!=(numberOfNodes)){
            nodes[filledNodes] = name;
            filledNodes++;
        } //end if
        else {
            System.out.println("You don't have more preassigned nodes.");
        } //end else

    } //end addNodeName

    public void addEdge(int initialNode, int connectedTo, double weight) {
        adjacencyMatrix[initialNode][connectedTo] = weight;
    } //end addEdge


    public void addEdgeByName(String initialNode, String connectedTo, double weight) {
        int x = 0;
        int y = 0;
        boolean found1 = false;
        boolean found2 = false;
        for (int i = 0; i<numberOfNodes && (!found1 || !found2);i++) {
            if (nodes[i].equals(initialNode)) {
                x = i;
                found1 = true;
            } //end if
            if (nodes[i].equals(connectedTo)) {
                y = i;
                found2 = true;
            } //end if
        } //end for
        if (x==y) {
            System.out.println("Unable to add edge from " + initialNode + " to " + connectedTo);
        } //end if
        else {
            adjacencyMatrix[x][y]=weight;
            adjacencyMatrix[y][x]=weight;
        } //end else

    } //end addEdgeByName


    public void deleteEdge(int initialNode, int disconnectedTo) {
        adjacencyMatrix[initialNode][disconnectedTo] = Double.POSITIVE_INFINITY;
    } //end deleteEdge

    public void showGraph() {
        for (int i = 0; i<numberOfNodes;i++) {
            System.out.printf("Connections for %-4s ", nodes[i]);
            for (int j = 0; j<numberOfNodes;j++) {
                System.out.printf("%4s:%-10f    ",nodes[j],adjacencyMatrix[i][j]);
            } //end for
            System.out.println();
        } //end for
    } //end showGraph

} //end class
