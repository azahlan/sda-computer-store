import java.util.*;
public class ComputerStore{

private ArrayList<Computer> computers;
private ArrayList<Component> components;
/**Constructor for computer store
*
*/
public ComputerStore(){
computers = new ArrayList<>();
components = new ArrayList<>();
}
/**Method that adds a computer to the computer arraylist
*
*/
public boolean addComputer(Computer newComputer){
computers.add(newComputer);
return true;
}

/**Method that removes a computer based on an index
*and checks range
*/
public boolean removeComputer(int index){
  if(index<computers.size()){
  computers.remove(index);
}
return true;
}

// public void printAllComputers(){
//   for(Computer c : computers)
//     c.printComputerSummary();
// }
/** Method that prints the total value of computers in the arraylist
*
*/
public void printTotalValue(){
  int sum=0;
  for(Computer c: computers)
  {
    sum=sum+c.totalCost();
    System.out.println(sum);
  }
}

// public int getTotalPrice(){
//   return computers.totalCost();
// }
/** Method that find the most expensive computer using
*a for iteration
*/
public Computer findMostExpensiveComputerv1(){
Computer currentMostExpensive=computers.get(0);
for(int i=1;i<computers.size();i++){
  if(currentMostExpensive.totalCost()<computers.get(i).totalCost())
    currentMostExpensive=computers.get(i);
  }
  return currentMostExpensive;
}
/** Method that find the most expensive computer using
*a while iteration
*/
public Computer findMostExpensiveComputerv2(){
Computer currentMostExpensive=computers.get(0);
int index = 1;
while(index<computers.size()){
  if(currentMostExpensive.totalCost()<computers.get(index).totalCost())
    currentMostExpensive=computers.get(index);
    index++;
  }
  return currentMostExpensive;
}
/** Method that find the most expensive computer using
*for-each iteration
*/
public Computer findMostExpensiveComputerv3(){
Computer currentMostExpensive=computers.get(0);
  for(Computer c: computers){
    if(currentMostExpensive.totalCost()<c.totalCost())
      currentMostExpensive=c;
  }
  return currentMostExpensive;
}
/** Method that find the most expensive computer using
*an iterator
*/
public Computer findMostExpensiveComputerv4(){
Computer currentMostExpensive=computers.get(0);
Iterator<Computer> itr= computers.iterator();
while(itr.hasNext()){
  Computer tempMostExpensive=itr.next();
  if(currentMostExpensive.totalCost()<tempMostExpensive.totalCost()){
    currentMostExpensive = tempMostExpensive;
  }
}
return currentMostExpensive;
}
/**Method that finds the total cost of components in the
*components arraylist
*/
public int totalCostOfComponents(){
  int totalCost=0;
  for(Component c : components)
  totalCost=totalCost+c.getCost();

  return totalCost;
}

/*
*
*@throws ClassNotFoundException
*/
/**Method that finds the total cost of components in the
*components arraylist based on a string criteria for the type e.g. "Processor"
*/
public void totalCostOfComponents(String component_type) throws ClassNotFoundException
{

  int totalCost=0;
  try {
    for(Component c : components)
    {

      if(Class.forName(component_type).isInstance(c))
      totalCost=totalCost+c.getCost();
    }
    System.out.println("The total cost of components of type "+component_type+":"+totalCost);
  }
  catch (Exception e)
  {
    System.out.println("Invalid type"+e.getMessage());
  }
}

/** Method that adds a components to the components arraylist.
*
*/
  public void addComponent(Component c){
    components.add(c);
}
}
