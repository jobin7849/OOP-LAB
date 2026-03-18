import java.util.Scanner;
import mathutils.Calculator;

public class PackageDemo{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
Calculator calc=new Calculator();

System.out.println("Enter first number:");
double a=sc.nextDouble();

System.out.println("Enter second number:");
double b=sc.nextDouble();

System.out.println("Addition :"+calc.add(a,b));
System.out.println("Subtrcat :"+calc.sub(a,b));
System.out.println("Multiplication :"+calc.mult(a,b));
if(b==0){
System.out.println("invalid");
}
else{
System.out.println("Division :"+calc.div(a,b));
}
}
}

