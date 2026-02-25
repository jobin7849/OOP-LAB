import java.util.Scanner;
class complex{
double real;
double img;
complex(){
real=0;
img=0;
}
complex(double r,double i){
real=r;
img=i;
}
complex add(complex n){
complex result=new complex();
result.real=real+n.real;
result.img=img+n.img;
return result;
}
complex sub(complex n){
complex result=new complex();
result.real=real-n.real;
result.img=img-n.img;
return result;

}
complex mult(complex n){
complex result=new complex();
result.real=(real * n.real) - (img * n.img);
result.img=(real * n.img) + (img * n.real);
return result;
}
void display(){
System.out.println(real+"+"+img+"i");
}

}
class complexnumber{
public static void main(String [] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter real and imaginary of first number :");
double r1=sc.nextDouble();
double i1=sc.nextDouble();

System.out.println("Enter real and imaginary of second number :");
double r2=sc.nextDouble();
double i2=sc.nextDouble();

complex c1=new complex(r1,i1);
complex c2=new complex(r2,i2);

System.out.println("---Results---");
complex add=c1.add(c2);
complex diff=c1.sub(c2);
complex prod=c1.mult(c2);
System.out.println("Sum:   ");
add.display();
System.out.println("Difference:   ");
diff.display();
System.out.println("Product:   ");
prod.display();
}
}
