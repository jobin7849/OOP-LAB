import java.util.Scanner;

class string{
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter String 1:");
String s1 = new String(sc.nextLine());

System.out.println("Enter String 2:");
String s2 = new String(sc.nextLine());

System.out.println("Length of s1: " + s1.length());
System.out.println("Length of s2: " + s2.length());

String s3 = s1 + " " + s2;
System.out.println("Concatenated String: " + s3);


char ch=s2.charAt(3);
System.out.println("character at position 3rd in string 2: " + ch);

System.out.println("String comparison using compareTo():"+s1.compareTo(s2));
System.out.println("String comparison using equals():"+s1.equals(s2));


System.out.println("enter the sub name from string 1:");
int index = s1.indexOf(sc.nextLine());

System.out.println("index found at: " + index);


System.out.println("String 1 after replace('a','x'): " + s1.replace('a', 'x'));
System.out.println("String 1 in uppercase: " + s1.toUpperCase());

System.out.println("Integer value: ");
int num=sc.nextInt();
String numStr = String.valueOf(num);
System.out.println("Integer value: " + num);
System.out.println("Converted to String: " + numStr);

System.out.println("Enter a sentence:");
sc.nextLine();
String sentence = sc.nextLine();

String[] words = sentence.split(" "); 

System.out.println("Splitted words:");
for (String word : words) {
    System.out.println(word);
}

System.out.println("Enter a string for String Buffer:");
String sbInput = sc.nextLine();
StringBuffer sb = new StringBuffer(sbInput);

System.out.println("Enter text to append:");
String text = sc.nextLine();
sb.append(" ").append(text);

System.out.println("StringBuffer result: " + sb);


}
}

