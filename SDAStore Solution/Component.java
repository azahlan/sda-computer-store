public class Component{

  private String manufacturer;
  private int cost;

  /**Constructor for component
  *
  */
  public Component(String manufacturer,int cost){
    this.manufacturer= manufacturer;
    this.cost= cost;
  }
  /**Getter method for cost
  *
  */
  public int getCost(){
    return cost;
  }
  /**Setter method for cost
  *
  */
  public void setCost(int cost){
    this.cost=cost;
  }
  /** Getter method for description
  *
  */
  public String getDescription(){
    return "";
  }
  /** Getter method for manufacturer
  *
  */
public String getManufacturer(){
  return manufacturer;
}
/** Setter method for manufacturer
*
*/
public void setManufacturer(String manufacturer){
  this.manufacturer= manufacturer;
}
}
