import java.util.Scanner;
class Publisher
{
String publishername;
public Publisher(String p)
{
publishername=p;
}
public void display()
{
System.out.println("publisher name:" +publishername);
}
}
class BOOK extends Publisher
{
String Bookname;
String author;
double price;

public BOOK(String p,String Book,String a,double pri){
super(p);
Bookname=Book;
author=a;
price=pri;
}
public void display(){
super.display();
System.out.println("BOOK NAME : "+Bookname);
System.out.println("AUTHOR : "+author);
System.out.println("PRICE : "+price);
}
}

class Literature extends BOOK{
String type;
public Literature(String p,String Book,String a,double pri,String type){
super(p,Book,a,pri);
this.type=type;
}
public void display(){
super.display();
System.out.println("TYPE : "+type);
System.out.println("-------------------------------------------------");

}
}
class Fiction extends BOOK{
String genre;
public Fiction(String p,String Book,String a,double pri,String g){
super(p,Book,a,pri);
genre=g;
}
public void display(){
super.display();
System.out.println("genre : "+genre);
System.out.println("-------------------------------------------------");

}
}
public class Hierarchical{
public static void main (String[] args){
Scanner input= new Scanner(System.in);
System.out.print("Enter total no.of books:");
int n=input.nextInt();
BOOK[] BOOK=new BOOK[n];
for(int i=0;i<n;i++){
System.out.println("---Enter details for Book "+(i+1)+"---");
System.out.println("Select Category (1 for Literature, 2 for Fiction): ");
int choice = input.nextInt();
input.nextLine();
System.out.print("Publisher Name: ");
String pubName = input.nextLine();
System.out.print("Book Name: ");
String bName = input.nextLine();
System.out.print("Author: ");
 String author = input.nextLine();
System.out.print("Price: ");
double price = input.nextDouble();
input.nextLine();
if (choice == 1) {
System.out.print("Literature Type: ");
String type = input.nextLine();
BOOK[i] = new Literature(pubName, bName, author, price, type);
} else if (choice == 2) {
System.out.print("Fiction Genre: ");
String genre = input.nextLine();
BOOK[i] = new Fiction(pubName, bName, author, price, genre);
} else {
System.out.println("Invalid choice.");
}
}
System.out.println("\n--- Display Books by Category ---");
System.out.print("Enter category to display (1 for Literature, 2for Fiction): ");
int searchChoice = input.nextInt();
boolean found = false;
for(int i = 0; i < n; i++) {

if (searchChoice == 1 && BOOK[i] instanceof Literature) {
BOOK[i].display();
found = true;
} else if (searchChoice == 2 && BOOK[i] instanceof Fiction) {
BOOK[i].display();
found = true;
}}

if (!found) {
System.out.println("\nno book found in the selection category");
}}}
