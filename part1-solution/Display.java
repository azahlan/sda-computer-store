public class Display{

private String manufacturer;
private String type;
private int cost;
private int size;

public Display(String manufacturer,String type,int cost, int size){
  this.manufacturer= manufacturer;
  this.type= type;
  this.cost= cost;
  this.size= size;
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
  this.type=type;
}

public int getCost(){
  return cost;
}

public void setCost(int cost){
  this.cost= cost;
}

public int getSize(){
  return size;
}

public void setSize(int size){
  this.size= size;
}
}
