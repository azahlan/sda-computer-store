public class HardDisk{

private String manufacturer;
private String type;
private int cost;

public HardDisk(String manufacturer,String type,int cost){
this.manufacturer= manufacturer;
this.type= type;
this.cost= cost;
}

public String getManufacturer(){
  return manufacturer;
}

public void setManufacturer(String manufacturer){
  this.manufacturer= manufacturer;
}

public String getType(){
return type;
}

public void setType(String type){
  this.type= type;
}

public void setCost(String cost){
  this.cost= cost;
}

public int getCost(){
return cost;
}
}
