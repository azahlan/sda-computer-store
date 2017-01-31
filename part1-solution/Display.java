public class Display extends Component{

private String type;
private int size;

public Display(String manufacturer,String type,int cost, int size){
  super(manufacturer,cost);
  this.type= type;
  this.size= size;
}

public String getType(){
  return type;
}

public void setType(String type){
  this.type=type;
}

public int getSize(){
  return size;
}

public void setSize(int size){
  this.size= size;
}

public String getDescription(){
  return ("\nManufacturer:"+getManufacturer()+"\nType:"+type+"\nCost:"+getCost()+"\nSize:"+size);
}
}
