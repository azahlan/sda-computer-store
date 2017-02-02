public class Computer {

private HashMap<String,Component> configuration;

public Computer(){
configuration = new HashMap<>();
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
