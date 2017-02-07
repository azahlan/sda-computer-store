public class HardDisk extends Component{

private String type;
/**Constructor for HardDisk
*
*/
public HardDisk(String manufacturer,String type,int cost){
super(manufacturer,cost);
this.type= type;
}
/**Getter method for type
*
*/
public String getType(){
return type;
}
/**Setter method for type
*
*/
public void setType(String type){
  this.type= type;
}
/**getter method for desription
*
*/
public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nType:"+type+"\nCost:"+getCost());
}
}
