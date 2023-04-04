public class Main {
    public static void main(String[] args) {

       //MEXICOS DISTANCES}
       System.out.println("MEXICOS DISTANCES \n");
       Graph mexicosDistances = new Graph(37);
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
       mexicosDistances.addNodeName("ES");
       mexicosDistances.addNodeName("GD");
       mexicosDistances.addNodeName("GT");
       mexicosDistances.addNodeName("HS");
       mexicosDistances.addNodeName("LC");
       mexicosDistances.addNodeName("LP");
       mexicosDistances.addNodeName("MA");
       mexicosDistances.addNodeName("MD");
       mexicosDistances.addNodeName("ML");
       mexicosDistances.addNodeName("MX");
       mexicosDistances.addNodeName("MY");
       mexicosDistances.addNodeName("MZ");
       mexicosDistances.addNodeName("OX");
       mexicosDistances.addNodeName("PB");
       mexicosDistances.addNodeName("QR");
       mexicosDistances.addNodeName("SP");
       mexicosDistances.addNodeName("ST");
       mexicosDistances.addNodeName("TC");
       mexicosDistances.addNodeName("TG");
       mexicosDistances.addNodeName("TP");
       mexicosDistances.addNodeName("TX");
       mexicosDistances.addNodeName("VH");
       mexicosDistances.addNodeName("VZ");
       mexicosDistances.addNodeName("XP");
       mexicosDistances.addNodeName("ZS");

       mexicosDistances.addEdgeByName("AC","ZS",118.0);
       mexicosDistances.addEdgeByName("AC","GD",221.0);

       mexicosDistances.addEdgeByName("AT","CA",215.0);
       mexicosDistances.addEdgeByName("AT","XP",489.0);
       mexicosDistances.addEdgeByName("AT","SP",462.0);

       mexicosDistances.addEdgeByName("CA","MY",284.0);
       mexicosDistances.addEdgeByName("CA","SP",337.0);

       mexicosDistances.addEdgeByName("CH","HS",689.0);
       mexicosDistances.addEdgeByName("CH","DG",630.0);
       mexicosDistances.addEdgeByName("CH","CN",750.0);

       mexicosDistances.addEdgeByName("CL","MD",383.0);
       mexicosDistances.addEdgeByName("CL","CP",418.0);

       mexicosDistances.addEdgeByName("CM","MZ",107.0);
       mexicosDistances.addEdgeByName("CM","GD",192.0);
       mexicosDistances.addEdgeByName("CM","MA",456.0);

       mexicosDistances.addEdgeByName("CN","TP",480.0);
       mexicosDistances.addEdgeByName("CN","DG",462.0);
       mexicosDistances.addEdgeByName("CN","HS",699.0);
       mexicosDistances.addEdgeByName("CN","CH",750.0);

       mexicosDistances.addEdgeByName("C0","CV",186.0);
       mexicosDistances.addEdgeByName("C0","PB",395.0);
       mexicosDistances.addEdgeByName("C0","OX",686.0);
       mexicosDistances.addEdgeByName("C0","TC",268.0);
       mexicosDistances.addEdgeByName("C0","MA",542.0);
       mexicosDistances.addEdgeByName("C0","LC",428.0);

       mexicosDistances.addEdgeByName("CP","MD",177.0);
       mexicosDistances.addEdgeByName("CP","CL",418.0);
       mexicosDistances.addEdgeByName("CP","VH",384.0);

       mexicosDistances.addEdgeByName("CV","MX",86.0);
       mexicosDistances.addEdgeByName("CV","PB",157.0);
       mexicosDistances.addEdgeByName("CV","CO",186.0);
       mexicosDistances.addEdgeByName("CV","TL",92.0);

       mexicosDistances.addEdgeByName("DG","ZS",291.0);
       mexicosDistances.addEdgeByName("DG","TP",504.0);
       mexicosDistances.addEdgeByName("DG","ST",513.0);

       mexicosDistances.addEdgeByName("ES","ML",241.0);
       mexicosDistances.addEdgeByName("ES","LP",1402.0);

       mexicosDistances.addEdgeByName("GD","TP",206.0);
       mexicosDistances.addEdgeByName("GD","MA",288.0);
       mexicosDistances.addEdgeByName("GD","GT",292.0);
       mexicosDistances.addEdgeByName("GD","ZS",321.0);





       mexicosDistances.showGraph();



       //MEXICOS TIMES
       System.out.println("\n\nMEXICOS TIMES \n");
       Graph mexicosTimes = new Graph(37);

       mexicosTimes.addNodeName("AC");
       mexicosTimes.addNodeName("AT");
       mexicosTimes.addNodeName("CA");
       mexicosTimes.addNodeName("CH");
       mexicosTimes.addNodeName("CL");
       mexicosTimes.addNodeName("CM");
       mexicosTimes.addNodeName("CN");
       mexicosTimes.addNodeName("CO");
       mexicosTimes.addNodeName("CP");
       mexicosTimes.addNodeName("CV");
       mexicosTimes.addNodeName("DG");
       mexicosTimes.addNodeName("ES");
       mexicosTimes.addNodeName("GD");
       mexicosTimes.addNodeName("GT");
       mexicosTimes.addNodeName("HS");
       mexicosTimes.addNodeName("LC");
       mexicosTimes.addNodeName("LP");
       mexicosTimes.addNodeName("MA");
       mexicosTimes.addNodeName("MD");
       mexicosTimes.addNodeName("ML");
       mexicosTimes.addNodeName("MX");
       mexicosTimes.addNodeName("MY");
       mexicosTimes.addNodeName("MZ");
       mexicosTimes.addNodeName("OX");
       mexicosTimes.addNodeName("PB");
       mexicosTimes.addNodeName("QR");
       mexicosTimes.addNodeName("SP");
       mexicosTimes.addNodeName("ST");
       mexicosTimes.addNodeName("TC");
       mexicosTimes.addNodeName("TG");
       mexicosTimes.addNodeName("TP");
       mexicosTimes.addNodeName("TX");
       mexicosTimes.addNodeName("VH");
       mexicosTimes.addNodeName("VZ");
       mexicosTimes.addNodeName("XP");
       mexicosTimes.addNodeName("ZS");



       mexicosTimes.showGraph();
    }
}
