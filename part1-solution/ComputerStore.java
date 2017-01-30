import java.util.*;
public class ComputerStore{

private ArrayList<Computer> computers;

public ComputerStore(){
computers = new ArrayList<>();
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

public void printAllComputers(){
  for(Computer c : computers)
    c.printComputerSummary();
}

public void printTotalValue(){
  int sum=0;
  for(Computer c: computers)
  {
    System.out.println(c.totalCost());
  }
}

//public int getTotalPrice(){
//return computers.totalCost();
//}

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
  if(currentMostExpensive.totalCost()<itr.next().totalCost())
    currentMostExpensive=itr.next();
}
return currentMostExpensive;
}
}
