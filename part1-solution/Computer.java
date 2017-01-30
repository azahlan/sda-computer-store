public class Computer {

private Processor theProcessor;
private HardDisk theHardDisk;
private Display theDisplay;

public Computer(){
theProcessor= new Processor("INTEL",3000,5000,"x64");
theHardDisk= new HardDisk("WD","SSD",8000);
theDisplay= new Display("LG","LCD",10000,22);
}

public void summary(){
System.out.println("");
}


}
