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
       mexicosDistances.addNodeName("PC");
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

       mexicosDistances.addEdgeByName("CO","CV",186.0);
       mexicosDistances.addEdgeByName("CO","PB",395.0);
       mexicosDistances.addEdgeByName("CO","OX",686.0);
       mexicosDistances.addEdgeByName("CO","TC",268.0);
       mexicosDistances.addEdgeByName("CO","MA",542.0);
       mexicosDistances.addEdgeByName("CO","LC",428.0);

       mexicosDistances.addEdgeByName("CP","MD",177.0);
       mexicosDistances.addEdgeByName("CP","CL",418.0);
       mexicosDistances.addEdgeByName("CP","VH",384.0);

       mexicosDistances.addEdgeByName("CV","MX",86.0);
       mexicosDistances.addEdgeByName("CV","PB",157.0);
       mexicosDistances.addEdgeByName("CV","CO",186.0);
       mexicosDistances.addEdgeByName("CV","TC",92.0);

       mexicosDistances.addEdgeByName("DG","ZS",291.0);
       mexicosDistances.addEdgeByName("DG","TP",504.0);
       mexicosDistances.addEdgeByName("DG","ST",513.0);

       mexicosDistances.addEdgeByName("ES","ML",241.0);
       mexicosDistances.addEdgeByName("ES","LP",1402.0);

       mexicosDistances.addEdgeByName("GD","TP",206.0);
       mexicosDistances.addEdgeByName("GD","MA",288.0);
       mexicosDistances.addEdgeByName("GD","GT",292.0);
       mexicosDistances.addEdgeByName("GD","ZS",321.0);

       mexicosDistances.addEdgeByName("GT","QR",129.0);
       mexicosDistances.addEdgeByName("GT","SP",207.0);
       mexicosDistances.addEdgeByName("GT","ZS",357.0);
       mexicosDistances.addEdgeByName("GT","MA",177.0);

       mexicosDistances.addEdgeByName("HS","ML",695.0);

       mexicosDistances.addEdgeByName("LC","MA",314.0);

       mexicosDistances.addEdgeByName("LP","ML",1350.0);
       mexicosDistances.addEdgeByName("LP","ES",1402.0);

       mexicosDistances.addEdgeByName("MA","TC",236.0);

       mexicosDistances.addEdgeByName("MX","QR",250.0);
       mexicosDistances.addEdgeByName("MX","PB",135.0);
       mexicosDistances.addEdgeByName("MX","PC",116.0);
       mexicosDistances.addEdgeByName("MX","TC",63.0);
       mexicosDistances.addEdgeByName("MX","TX",137.0);

       mexicosDistances.addEdgeByName("MY","ST",87.0);
       mexicosDistances.addEdgeByName("MY","SP",565.0);

       mexicosDistances.addEdgeByName("OX","PB",340.0);
       mexicosDistances.addEdgeByName("OX","TG",545.0);
       mexicosDistances.addEdgeByName("OX","VZ",372.0);

       mexicosDistances.addEdgeByName("PB","PC",389.0);
       mexicosDistances.addEdgeByName("PB","TX",39.0);
       mexicosDistances.addEdgeByName("PB","XP",190.0);
       mexicosDistances.addEdgeByName("PB","VZ",274.0);

       mexicosDistances.addEdgeByName("PC","QR",228.0);
       mexicosDistances.addEdgeByName("PC","TX",129.0);
       mexicosDistances.addEdgeByName("PC","XP",618.0);
       mexicosDistances.addEdgeByName("PC","SP",618.0);

       mexicosDistances.addEdgeByName("QR","SP",465.0);
       mexicosDistances.addEdgeByName("QR","TC",196.0);

       mexicosDistances.addEdgeByName("SP","ZS",194.0);
       mexicosDistances.addEdgeByName("SP","XP",911.0);

       mexicosDistances.addEdgeByName("ST","ZS",385.0);

       mexicosDistances.addEdgeByName("TG","VH",246.0);
       mexicosDistances.addEdgeByName("TG","VZ",553.0);

       mexicosDistances.addEdgeByName("VH","VZ",467.0);

       mexicosDistances.addEdgeByName("VZ","XP",107.0);


       mexicosDistances.showGraph();

      //hermano esta es una prueba con lo que ya llevas, ya vi que si funciona:)
       mexicosDistances.findMinimumPaths("CA");

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
       mexicosTimes.addNodeName("PC");
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

       mexicosTimes.addEdgeByName("AC","ZS",85.0);
       mexicosTimes.addEdgeByName("AC","GD",153.0);

       mexicosTimes.addEdgeByName("AT","CA",141.0);
       mexicosTimes.addEdgeByName("AT","XP",351.0);
       mexicosTimes.addEdgeByName("AT","SP",385.0);

       mexicosTimes.addEdgeByName("CA","MY",213.0);
       mexicosTimes.addEdgeByName("CA","SP",239.0);

       mexicosTimes.addEdgeByName("CH","HS",720.0);
       mexicosTimes.addEdgeByName("CH","DG",437.0);
       mexicosTimes.addEdgeByName("CH","CN",872.0);

       mexicosTimes.addEdgeByName("CL","MD",301.0);
       mexicosTimes.addEdgeByName("CL","CP",353.0);

       mexicosTimes.addEdgeByName("CM","MZ",80.0);
       mexicosTimes.addEdgeByName("CM","GD",143.0);
       mexicosTimes.addEdgeByName("CM","MA",460.0);

       mexicosTimes.addEdgeByName("CN","TP",318.0);
       mexicosTimes.addEdgeByName("CN","DG",342.0);
       mexicosTimes.addEdgeByName("CN","HS",487.0);
       mexicosTimes.addEdgeByName("CN","CH",872.0);

       mexicosTimes.addEdgeByName("CO","CV",122.0);
       mexicosTimes.addEdgeByName("CO","PB",529.0);
       mexicosTimes.addEdgeByName("CO","OX",817.0);
       mexicosTimes.addEdgeByName("CO","TC",281.0);
       mexicosTimes.addEdgeByName("CO","MA",589.0);
       mexicosTimes.addEdgeByName("CO","LC",370.0);

       mexicosTimes.addEdgeByName("CP","MD",139.0);
       mexicosTimes.addEdgeByName("CP","VH",339.0);

       mexicosTimes.addEdgeByName("CV","MX",80.0);
       mexicosTimes.addEdgeByName("CV","PB",125.0);
       mexicosTimes.addEdgeByName("CV","CO",122.0);
       mexicosTimes.addEdgeByName("CV","TC",128.0);

       mexicosTimes.addEdgeByName("DG","ZS",199.0);
       mexicosTimes.addEdgeByName("DG","TP",638.0);
       mexicosTimes.addEdgeByName("DG","ST",320.0);

       mexicosTimes.addEdgeByName("ES","ML",191.0);
       mexicosTimes.addEdgeByName("ES","LP",1009.0);

       mexicosTimes.addEdgeByName("GD","TP",156.0);
       mexicosTimes.addEdgeByName("GD","MA",184.0);
       mexicosTimes.addEdgeByName("GD","GT",205.0);
       mexicosTimes.addEdgeByName("GD","ZS",294.0);

       mexicosTimes.addEdgeByName("GT","QR",106.0);
       mexicosTimes.addEdgeByName("GT","SP",150.0);
       mexicosTimes.addEdgeByName("GT","ZS",282.0);
       mexicosTimes.addEdgeByName("GT","MA",138.0);

       mexicosTimes.addEdgeByName("HS","ML",492.0);

       mexicosTimes.addEdgeByName("LC","MA",234.0);

       mexicosTimes.addEdgeByName("LP","ML",961.0);
       mexicosTimes.addEdgeByName("LP","ES",1009.0);

       mexicosTimes.addEdgeByName("MA","TC",171.0);

       mexicosTimes.addEdgeByName("MX","QR",293.0);
       mexicosTimes.addEdgeByName("MX","PB",127.0);
       mexicosTimes.addEdgeByName("MX","PC",128.0);
       mexicosTimes.addEdgeByName("MX","TC",73.0);
       mexicosTimes.addEdgeByName("MX","TX",141.0);

       mexicosTimes.addEdgeByName("MY","ST",70.0);
       mexicosTimes.addEdgeByName("MY","SP",429.0);

       mexicosTimes.addEdgeByName("OX","PB",258.0);
       mexicosTimes.addEdgeByName("OX","TG",507.0);
       mexicosTimes.addEdgeByName("OX","VZ",478.0);

       mexicosTimes.addEdgeByName("PB","PC",469.0);
       mexicosTimes.addEdgeByName("PB","TX",54.0);
       mexicosTimes.addEdgeByName("PB","XP",174.0);
       mexicosTimes.addEdgeByName("PB","VZ",210.0);

       mexicosTimes.addEdgeByName("PC","QR",212.0);
       mexicosTimes.addEdgeByName("PC","TX",122.0);
       mexicosTimes.addEdgeByName("PC","XP",661.0);
       mexicosTimes.addEdgeByName("PC","SP",649.0);

       mexicosTimes.addEdgeByName("QR","SP",416.0);
       mexicosTimes.addEdgeByName("QR","TC",156.0);

       mexicosTimes.addEdgeByName("SP","ZS",131.0);
       mexicosTimes.addEdgeByName("SP","XP",727.0);

       mexicosTimes.addEdgeByName("ST","ZS",244.0);

       mexicosTimes.addEdgeByName("TG","VH",222.0);
       mexicosTimes.addEdgeByName("TG","VZ",430.0);

       mexicosTimes.addEdgeByName("VH","VZ",356.0);

       mexicosTimes.addEdgeByName("VZ","XP",89.0);


       mexicosTimes.showGraph();
    }
}
