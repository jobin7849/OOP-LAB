import java.util.Scanner;
class Geometry{

 double area(double r){
 return Math.PI*r*r;
 }
 double area(double l,double b){
 return l * b;
 }
 
 double area(double a,double b,double c){
 if((a+b<=c)||(a+c<=b)||(b+c<=a)){
 System.out.println("Invallid triangle");
 return 0.0;
 }
 double s=(a+b+c)/2;
 return Math.sqrt(s * (s - a) * (s - b) * (s - c));
 }
}

public class MethodOverload{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Geometry geo=new Geometry();
System.out.println("---Method Overloading area calculation ---\n");

System.out.println("Enter radius of circle:");
double r = sc.nextDouble();
double areacir=geo.area(r);
System.out.print("Area of circle:"+areacir);

System.out.print("\nEnter length and breadth of the Rectangle: ");
double l = sc.nextDouble();
double b = sc.nextDouble();

double arearect=geo.area(l,b);
System.out.print("Area of rectangle:"+arearect);

System.out.print("\nEnter three sides of the Triangle (a, b, c): ");

double sideA = sc.nextDouble();
double sideB = sc.nextDouble();
double sideC = sc.nextDouble();
double areatri=geo.area(sideA,sideB,sideC);
System.out.print("Area of triangle:"+areatri);
}
}
