import java.util.*;
public class ComputerStore{

private ArrayList<Computer> computers;
private ArrayList<Component> components;

public ComputerStore(){
computers = new ArrayList<>();
components = new ArrayList<>();
}

public boolean addComputer(Computer newComputer){
computers.add(newComputer);
return true;
}

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

public Computer findMostExpensiveComputerv1(){
Computer currentMostExpensive=computers.get(0);
for(int i=1;i<computers.size();i++){
  if(currentMostExpensive.totalCost()<computers.get(i).totalCost())
    currentMostExpensive=computers.get(i);
  }
  return currentMostExpensive;
}

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

public Computer findMostExpensiveComputerv3(){
Computer currentMostExpensive=computers.get(0);
  for(Computer c: computers){
    if(currentMostExpensive.totalCost()<c.totalCost())
      currentMostExpensive=c;
  }
  return currentMostExpensive;
}

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

  public void addComponent(Component c){
    components.add(c);
}
}
