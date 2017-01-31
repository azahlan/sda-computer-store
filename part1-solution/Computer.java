public class Computer {

private Processor theProcessor;
private HardDisk theHardDisk;
private Display theDisplay;

public Computer(){
theProcessor= new Processor("INTEL",3000,5000,"x64");
theHardDisk= new HardDisk("WD","SSD",8000);
theDisplay= new Display("LG","LCD",10000,22);
}

public Computer(Processor theProcessor,HardDisk theHardDisk,Display theDisplay){
  this.theProcessor = theProcessor;
  this.theHardDisk = theHardDisk;
  this.theDisplay = theDisplay;
}
public void printComputerSummary(){
System.out.println("\nProcessor_Manufacturer:" +theProcessor.getManufacturer()+"\nProcessor architecture:"+theProcessor.getArchitecture()+"\nProcessor clock speed:"+theProcessor.getclockSpeed()+"\nProcessor cost:"+theProcessor.getCost());
System.out.println("\nHardDisk_Manufacturer:"+theHardDisk.getManufacturer()+"\nHardDisk type:"+theHardDisk.getType()+"\nHardDisk cost:"+theHardDisk.getCost());
System.out.println("\nDisplay_Manufacturer:"+theDisplay.getManufacturer()+"\nDisplay type:"+ theDisplay.getType()+"\nDisplay size:"+ theDisplay.getSize()+"\nDisplay cost:"+theDisplay.getCost());
}

public int totalCost(){
  int sum = theProcessor.getCost()+theHardDisk.getCost()+theDisplay.getCost();
  return sum;
}
}
