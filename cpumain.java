import java.util.Scanner;
class cpu{
double price;
cpu(double p){
price = p;
}
class Processor{
int no_of_cores;
String manufacturer;

Processor(int n,String m){
no_of_cores=n;
manufacturer=m;
}

}
static class RAM{
int memory;
String manufactur;

RAM(int mem,String ma){
memory=mem;
manufactur=ma;
}
}
}

public class cpumain{
public static void main(String[] args){


Scanner sc=new Scanner(System.in);
System.out.println("CPU price");
double pr=sc.nextDouble();
sc.nextLine();
cpu c= new cpu(pr);


System.out.println("Enter number of cores:");
int cr=sc.nextInt();
sc.nextLine();
System.out.println("Enter manufacturer :");
String man=sc.nextLine();
cpu.Processor p=c.new Processor(cr,man);


System.out.println("Enter memory:");
int mem=sc.nextInt();
sc.nextLine();
System.out.println("Enter manufacturer :");
String manu=sc.nextLine();
cpu.RAM r= new cpu.RAM(mem,manu);

System.out.println("---DETAILS OF CPU---");
System.out.println("Price = "+c.price);
System.out.println("No of cores ="+p.no_of_cores);
System.out.println("Manufacturer of processor ="+p.manufacturer);
System.out.println("Memory ="+r.memory);
System.out.println("Manufacturer of RAM ="+r.manufactur);

}
}
