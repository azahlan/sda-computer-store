public class Main{


public static void main(String[] args) throws ClassNotFoundException{
/*
System.out.println(c.totalCost( ));

Processor p = new Processor("AMD",2000,6000,"x86");
System.out.println(p.getDescription());

HardDisk h = new HardDisk("Toshiba","SSD",7000);
System.out.println(h.getDescription());

Display d = new Display("ASUS","IPS",9000,17);
System.out.println(d.getDescription());
*/
Computer c1 = new Computer();
ComputerStore cs = new ComputerStore();
cs.addComputer(c1);
//cs.printAllComputers();
//cs.printTotalValue();
//Computer c2 = new Computer();
Processor p = new Processor("AMD",3000,6000,"x64");
HardDisk h = new HardDisk("WD","SSD",4500);
Display d= new Display("BENQ","LCD",9000,24);

Computer c3 = new Computer();
cs.addComputer(c3);
//Computer com = new Computer();
//com =cs.findMostExpensiveComputerv1();
//cs.findMostExpensiveComputerv1().printComputerSummary();
//cs.findMostExpensiveComputerv2().printComputerSummary();
//cs.findMostExpensiveComputerv3().printComputerSummary();
//cs.findMostExpensiveComputerv4().printComputerSummary();
cs.addComponent(p);
cs.addComponent(h);
cs.addComponent(p);
// c3.totalCost();
System.out.println(cs.totalCostOfComponents());
cs.totalCostOfComponents("Processor");
c3.addComponent("HDD",h);
System.out.println(c3.totalCost());


// c3.addComponent("HDD",h);
// System.out.println(c3.totalCost());

}

}
