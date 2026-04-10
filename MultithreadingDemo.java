import java.util.Scanner;

class MultiplicationThread extends Thread{

@Override
public void run(){
System.out.println("->Multipication Thread started.");
try{
for (int i = 1; i <= 10; i++) {
System.out.println("5 x " + i + " = " + (5 * i));
Thread.sleep(200);
}
}catch(InterruptedException e){
System.out.println("Multiplication Thread interrupted");
}
}
}

class PrimeThread extends Thread{
private int limit ;
public PrimeThread ( int n) { this . limit = n; }

@Override
public void run (){
System.out.println("->Prime Thread Started.");
try{
int count = 0;
int num = 2;

while (count < limit) {
boolean isPrime = true;

for (int i = 2; i <= num / 2; i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}

if (isPrime) {
System.out.println(num);
count++;
Thread.sleep(250);
}

num++;
}


Thread.sleep(250);
}catch(InterruptedException e){

System.out.println("Prime Thread interrupted");
}
}
private boolean isPrime(int num) {
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0)
return false;
}
return true;
}
}

public class MultithreadingDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
int n = sc.nextInt();


MultiplicationThread t1 = new MultiplicationThread();
PrimeThread t2 = new PrimeThread(n);

t1.start();
t2.start();
}
}

