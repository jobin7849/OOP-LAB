import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class ArrayListDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Integer> list = new ArrayList<>();
	List<String> systemLog = new ArrayList<>();
	System.out.println("--- Adding Elements ---");
	systemLog.add("Kernel");
	systemLog.add("Bootloader");
	systemLog.add("Daemon");
	systemLog.add("Shell");
	System.out.println(systemLog);
	System.out.println("\n--- Searching for an Element ---");
	System.out.print("Enter element to search: ");
	String target = sc.nextLine();
	if (systemLog.contains(target)) {
	int position = systemLog.indexOf(target);
	System.out.println("Element found at position: " + position);
	} 
	else {
	System.out.println("Element not found in the list.");
	}
	System.out.println("\n--- Removing an Element ---");
	boolean isRemoved = systemLog.remove("Bootloader");
	if (isRemoved) {
	    System.out.println("Element 'Bootloader' removed successfully.");
	} 
	else {
	    System.out.println("Element 'Bootloader' not found.");
	}
	System.out.println(systemLog);
	System.out.println("\n--- Sorting the List ---");
	Collections.sort(systemLog);
	System.out.println(systemLog);
	}
}


