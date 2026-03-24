import java.util.Scanner;
class AuthException extends Exception {
public AuthException(String message) {
super(message);
}
}
public class authentication {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final String VALID_USER = "jobinjobin";
final String VALID_PASS = "333Aj@bin";
System.out.print("enter username: ");
String inputUser = sc.nextLine();
System.out.print("enter password: ");
String inputPass = sc.nextLine();
System.out.println("verifying credentials...");
try {
if (!(inputUser.equals(VALID_USER) && inputPass.equals(VALID_PASS))) {
throw new AuthException("invalid username or password!");
} else {
System.out.println("access Granted. Welcome to the system.");
}
} catch (AuthException e) {  
System.out.println("security alert: " + e.getMessage());
}}}
