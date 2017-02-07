public class Processor extends Component{

private String architecture;
private int clockSpeed;

/**Constructor for Processor.
*
*/
public Processor(String manufacturer,int clockSpeed,int cost, String architecture){
  super(manufacturer,cost);
  this.clockSpeed=clockSpeed;
  this.architecture=architecture;
}

/**Getter method for clockspeed
*
*/
public int getclockSpeed(){
  return clockSpeed;
}

/**Setter method for clockspeed
*
*/
public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
}
/**Getter method for archeticture
*
*/
public String getArchitecture(){
  return architecture;
}
/**Setter Method for architecture
*
*/
public void setArchitecture(String architecture){
  this.architecture=architecture;
}

/**Getter method for getDescription
*
*/
public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nClockspeed:"+clockSpeed+"\nCost: "+getCost()+"\nArchitecture:"+architecture);
}

}
