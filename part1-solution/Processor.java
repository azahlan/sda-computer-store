public class Processor{

private String manufacturer;
private String architecture;
private int clockSpeed;
private int cost;


public Processor(String manufacturer,int clockSpeed,int cost, String architecture){
  this.manufacturer=manufacturer;
  this.clockSpeed=clockSpeed;
  this.cost=cost;
  this.architecture=architecture;
}

public String getManufacturer(){
  return manufacturer;
}

public void setManufacturer(String manufacturer){
  this.manufacturer= manufacturer;
}

public int getclockSpeed(){
  return clockSpeed;
}

public void setClockSpeed(int clockSpeed){
  this.clockSpeed=clockSpeed;
}

public int getCost(){
  return cost;
}

public void setCost(int cost){
  this.cost=cost;
}

public String getArchitecture(){
  return architecture;
}

public void setArchitecture(String architecture){
  this.architecture=architecture;
}

}
