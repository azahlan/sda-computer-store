import java.util.*;
import java.util.HashMap;
public class Computer {


private HashMap<String,Component> configuration;
//private Processor theProcessor;
//private HardDisk theHardDisk;
//private Display theDisplay;

/**Constructor for Computer
*
*/
public Computer(){
configuration = new HashMap<String,Component>();
//theProcessor= new Processor("INTEL",3000,5000,"x64");
//theHardDisk= new HardDisk("WD","SSD",8000);
//theDisplay= new Display("LG","LCD",10000,22);
}
/**Getter method for Configuration
*
*/
public HashMap<String,Component> getConfiguration(){

return this.configuration;
}
/**Setter method for Configuration
*
*/
public void setConfiguration(String name,Component c){
this.configuration.put(name,c);
}
/**Method for adding components that takes a string and a component object.
*
*/
public void addComponent(String name,Component c){
configuration.put(name,c);
}

/**Method for removing component based on the a String value
*
*/
public void removeComponent(String name){
configuration.remove(name);
}
/*public void printComputerSummary(){
System.out.println("\nProcessor_Manufacturer:" +theProcessor.getManufacturer()+"\nProcessor architecture:"+theProcessor.getArchitecture()+"\nProcessor clock speed:"+theProcessor.getclockSpeed()+"\nProcessor cost:"+theProcessor.getCost());
System.out.println("\nHardDisk_Manufacturer:"+theHardDisk.getManufacturer()+"\nHardDisk type:"+theHardDisk.getType()+"\nHardDisk cost:"+theHardDisk.getCost());
System.out.println("\nDisplay_Manufacturer:"+theDisplay.getManufacturer()+"\nDisplay type:"+ theDisplay.getType()+"\nDisplay size:"+ theDisplay.getSize()+"\nDisplay cost:"+theDisplay.getCost());
}
*/
// public int totalCost(){
//   int sum = theProcessor.getCost()+theHardDisk.getCost()+theDisplay.getCost();
//   return sum;
// }

// public int totalCost(){
//   int sum=0;
//   Iterator it = configuration.entrySet().iterator();
//       while (it.hasNext()) {
//           Map.Entry pair = (Map.Entry)it.next();
//           sum= sum + .getValue().getCost();
// }
// return sum;
// }

/**Method that returns the total cost of the configuration build
*
*/
public int totalCost(){
  int sum=0;
    for (Map.Entry<String,Component> hm : configuration.entrySet())
    sum= sum + hm.getValue().getCost();
    return sum;
}
}
