public class HardDisk extends Component{

private String type;

public HardDisk(String manufacturer,String type,int cost){
super(manufacturer,cost);
this.type= type;
}

public String getType(){
return type;
}

public void setType(String type){
  this.type= type;
}
public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nType:"+type+"\nCost:"+getCost());
}
}
