import java.util.Scanner;
import java.util.Arrays;


public class SearchAlgorithms {

static int linearSearch(int[] arr, int target) {
for (int i = 0; i < arr.length; i++) {
  if(arr[i] == target){

  return i;
}
}
return -1;
}

static int binarySearchSimple(int[] arr, int target) {
int low = 0;
int high = arr.length - 1;

while (low <= high) {
int mid = (low + high) / 2;

if(arr[mid]==target){
return mid;
}
else if (arr[mid]<target)
{
low=mid+1;
}else{
high=mid-1;
}

}
return -1;

}


static int binarySearchRecursive(int[] arr, int low, int high, int target) {

if (low > high) {
 return -1;
}

int mid = (low + high) / 2;
if(arr[mid] == target){
return mid;
}else if(arr[mid]<target){

return binarySearchRecursive(arr,mid+1,high,target);
}else{

return binarySearchRecursive(arr,low,mid-1,target);
}

}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt(); 
}

 System.out.println("Enter the element to search:");
int target = sc.nextInt();

System.out.println("\n--- Linear Search Result ---");
int IResult = linearSearch(arr,target);
if(IResult != -1){
System.out.println("Element found at index:"+IResult);
}else{
System.out.println("Element not found ");
}

System.out.println("\n(Array has been sorted for Binary Search)");
Arrays.sort(arr);
System.out.println("Sorted Array: " + Arrays.toString(arr));


System.out.println("\n--- Simple Binary Search Result ---");
int bResult=binarySearchSimple(arr,target);
if(bResult != -1)
{
System.out.println("Element found at index:"+bResult);
}else{
System.out.println("Element not found ");
}


System.out.println("\n--- Recursive Binary Search Result ---");
int rResult=binarySearchRecursive(arr,0,n-1,target);
if(rResult != -1)
{
System.out.println("Element found at index:"+rResult);
}else{
System.out.println("Element not found ");
}
sc.close();
}
}
