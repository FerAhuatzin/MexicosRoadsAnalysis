public class Main {
    public static void main(String[] args) {
       Graph mexicosDistances = new Graph(37);
       Graph mexicosTimes = new Graph(37);
       mexicosDistances.addNodeName("AC");
       mexicosDistances.addNodeName("AT");
       mexicosDistances.addNodeName("CA");
       mexicosDistances.addNodeName("CH");
       mexicosDistances.addNodeName("CL");
       mexicosDistances.addNodeName("CM");
       mexicosDistances.addNodeName("CN");
       mexicosDistances.addNodeName("CO");
       mexicosDistances.addNodeName("CP");
       mexicosDistances.addNodeName("CV");
       mexicosDistances.addNodeName("DG");
       mexicosDistances.showGraph();
    }
}