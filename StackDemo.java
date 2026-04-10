import java.util.Scanner;
class GenericStack<T>{
private T[] stackArray;
private int top;
private int capacity;

@SuppressWarnings("unchecked")
public GenericStack(int capacity){
this.capacity = capacity;
this.top = -1;
this.stackArray = (T[]) new Object[capacity];
}


public void push(T element){
if(top == capacity - 1){
System.out.println("Stack Overflow");
return;
}
stackArray[++top] = element;
System.out.println("Pushed: "+element);
}


public T pop(){
if(top == -1){
System.out.println("Stack undderflow .Stack is empty");
return null;
}
T poppedElement = stackArray[top--];
return poppedElement;

}
}


public class StackDemo{
public static void main(String[] args){
System.out.println("---Integer Stack Operations---");
GenericStack<Integer> intStack = new GenericStack<>(3);

intStack.push(101);
intStack.push(102);
intStack.push(103);
intStack.push(104);

System.out.println("Popped:"+ intStack.pop());
System.out.println("\n---String Stack Operations ---");
GenericStack<String> stringStack = new GenericStack<>(2);

stringStack.push("jobin");
stringStack.push("nihad");

System.out.println("Popped:"+ stringStack.pop());
System.out.println("Popped:"+ stringStack.pop());
stringStack.pop();
}
}
































