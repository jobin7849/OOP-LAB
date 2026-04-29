import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileCopy {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// 1. Get file paths from the user
System.out.print("Enter source file name: ");
String sourceFile = sc.nextLine();

System.out.print("Enter destination file name: ");
String destFile = sc.nextLine();

// 2. Try-With-Resources (Auto-closes files to prevent memory leaks)
try (
FileInputStream inp = new FileInputStream(sourceFile);
FileOutputStream out = new FileOutputStream(destFile)
) {
// 3. The 1KB Buffer (Prevents reading 1 byte at a time)
byte[] buffer = new byte[1024];
int bytesRead;

// 4. Read blocks of data and write them immediately
while ((bytesRead = inp.read(buffer)) != -1) {
out.write(buffer, 0, bytesRead);
}

System.out.println("File copied successfully!");

} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
} finally {
sc.close();
}
}
}
