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

      //BUSQUEDA

      //SURESTE
      //CAMPECHE
      System.out.println("\nSURESTE \n");
      System.out.println("\nCAMPECHE \n");
      double[][] minimumPath = mexicosDistances.findMinimumPaths("CP");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "CP", "CA");
      //CHIAPAS
      System.out.println("\nCHIAPAS \n");
      minimumPath = mexicosDistances.findMinimumPaths("TG");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "TG", "CA");
      //GUERRERO
      System.out.println("\nGUERRERO \n");
      minimumPath = mexicosDistances.findMinimumPaths("CO");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "CO", "CA");
      //OAXACA
      System.out.println("\nOAXACA \n");
      minimumPath = mexicosDistances.findMinimumPaths("OX");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "OX", "CA");
      //QUINTANA ROO
      System.out.println("\nQUINTANA ROO \n");
      minimumPath = mexicosDistances.findMinimumPaths("CL");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "CL", "CA");
      //TABASCO
      System.out.println("\nTABASCO \n");
      minimumPath = mexicosDistances.findMinimumPaths("VH");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "VH", "CA");
      //YUCATAN
      System.out.println("\nYUCATAN \n");
      minimumPath = mexicosDistances.findMinimumPaths("MD");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "MD", "CA");

      //5 MAYOR IDH
      System.out.println("\n5 MAYOR IDH \n");
      //CDMX
      System.out.println("\nCDMX \n");
      minimumPath = mexicosDistances.findMinimumPaths("MX");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "MX", "CA");
      //NUEVO LEON
      System.out.println("\nNUEVO LEON \n");
      minimumPath = mexicosDistances.findMinimumPaths("MY");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "MY", "MY");
      //BAJA CALIFORNIA
      System.out.println("\nBAJA CALIFORNIA \n");
      minimumPath = mexicosDistances.findMinimumPaths("ML");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "ML", "ML");
      //AGUSCALIENTES
      System.out.println("\nAGUASCALIENTES \n");
      minimumPath = mexicosDistances.findMinimumPaths("AC");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "AC", "ST");
      //BAJA CALIFORNIA SUR
      System.out.println("\nBAJA CALIFORNIA SUR \n");
      minimumPath = mexicosDistances.findMinimumPaths("LP");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "TC");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "MX");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "GD");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "MZ");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "VZ");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "LC");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "AT");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosDistances.showMinimumPath(minimumPath, "LP", "ML");

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

      //BUSQUEDA
      //CAMPECHE
      System.out.println("\nCAMPECHE \n");
      minimumPath = mexicosTimes.findMinimumPaths("CP");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "CP", "CA");
      //CHIAPAS
      System.out.println("\nCHIAPAS \n");
      minimumPath = mexicosTimes.findMinimumPaths("TG");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "TG", "CA");
      //GUERRERO
      System.out.println("\nGUERRERO \n");
      minimumPath = mexicosTimes.findMinimumPaths("CO");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "CO", "CA");
      //OAXACA
      System.out.println("\nOAXACA \n");
      minimumPath = mexicosTimes.findMinimumPaths("OX");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "OX", "CA");
      //QUINTANA ROO
      System.out.println("\nQUINTANA ROO \n");
      minimumPath = mexicosTimes.findMinimumPaths("CL");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "CL", "CA");
      //TABASCO
      System.out.println("\nTABASCO \n");
      minimumPath = mexicosTimes.findMinimumPaths("VH");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "VH", "CA");
      //YUCATAN
      System.out.println("\nYUCATAN \n");
      minimumPath = mexicosTimes.findMinimumPaths("MD");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "MD", "CA");

      //5 MAYOR IDH
      System.out.println("\n5 MAYOR IDH \n");
      //CDMX
      System.out.println("\nCDMX \n");
      minimumPath = mexicosTimes.findMinimumPaths("MX");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "MX", "CA");
      //NUEVO LEON
      System.out.println("\nNUEVO LEON \n");
      minimumPath = mexicosTimes.findMinimumPaths("MY");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "MY", "MY");
      //BAJA CALIFORNIA
      System.out.println("\nBAJA CALIFORNIA \n");
      minimumPath = mexicosTimes.findMinimumPaths("ML");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "ML", "ML");
      //AGUSCALIENTES
      System.out.println("\nAGUASCALIENTES \n");
      minimumPath = mexicosTimes.findMinimumPaths("AC");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "AC", "ST");
      //BAJA CALIFORNIA SUR
      System.out.println("\nBAJA CALIFORNIA SUR \n");
      minimumPath = mexicosTimes.findMinimumPaths("LP");
      System.out.println("\n4 ESTADOS MAS POBLADOS \n");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "TC");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "MX");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "GD");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "XP");
      System.out.println("\n5 PUERTOS MAS IMPORTANTES \n");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "MZ");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "VZ");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "LC");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "AT");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "ES");
      System.out.println("\nFRONTERA CON ESTADOS UNIDOS MAS CERCANA \n");
      mexicosTimes.showMinimumPath(minimumPath, "LP", "ML");
   }
}
