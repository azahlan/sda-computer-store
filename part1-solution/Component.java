public class Component{

  private String manufacturer;
  private int cost;

  public Component(String manufacturer,int cost){
    this.manufacturer= manufacturer;
    this.cost= cost;
  }

  public int getCost(){
    return cost;
  }

  public void setCost(int cost){
    this.cost=cost;
  }

  public String getDescription(){
    return "";
  }

public String getManufacturer(){
  return manufacturer;
}

public void setManufacturer(String manufacturer){
  this.manufacturer= manufacturer;
}
}
