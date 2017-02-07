public class Display extends Component{
private String type;
private int size;

/**Constructor for Display
*
*/
public Display(String manufacturer,String type,int cost, int size){
  super(manufacturer,cost);
  this.type= type;
  this.size= size;
}
/**Getter Method for type
*
*/
public String getType(){
  return type;
}
/**Setter method for type
*
*/
public void setType(String type){
  this.type=type;
}
/**Getter Method for size
*
*/
public int getSize(){
  return size;
}
/**Setter method for size
*
*/
public void setSize(int size){
  this.size= size;
}
/**Getter method for description
*
*/
public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nType:"+type+"\nCost:"+getCost()+"\nSize:"+size);
}
}
