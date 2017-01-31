public class Processor extends Component{

private String architecture;
private int clockSpeed;


public Processor(String manufacturer,int clockSpeed,int cost, String architecture){
  super(manufacturer,cost);
  this.clockSpeed=clockSpeed;
  this.architecture=architecture;
}


public int getclockSpeed(){
  return clockSpeed;
}

public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
}

public String getArchitecture(){
  return architecture;
}

public void setArchitecture(String architecture){
  this.architecture=architecture;
}

public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nClockspeed:"+clockSpeed+"\nCost: "+getCost()+"\nArchitecture:"+architecture);
}

}
