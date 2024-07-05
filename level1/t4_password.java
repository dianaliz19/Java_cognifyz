//random password generator
import java.util.*;
import java.security.*;
public class t4_password {
    private static final String number = "1234567890";
    private static final String lowercase = "qwertyuiopasdfghjklzxcvbnm";
    private static final String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String special = "!@#$%^&*()_+-=<>?";
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the password: ");
        int n = sc.nextInt();
        System.out.print("Specify requirements for your password:\nNumbers(y/n)");
        boolean choice = sc.next().equalsIgnoreCase("y");
        if(choice)
            sb.append(number);
        System.out.print("Lowercase letters(y/n)");
        choice = sc.next().equalsIgnoreCase("y");
        if(choice)
            sb.append(lowercase);
        System.out.print("Uppercase letters(y/n)");
        choice = sc.next().equalsIgnoreCase("y");
        if(choice)
            sb.append(uppercase);
        System.out.print("Special characters(y/n)");
        choice = sc.next().equalsIgnoreCase("y");
        if(choice)
            sb.append(special);
        SecureRandom sr = new SecureRandom();
        StringBuilder password =new StringBuilder(n);
        for(int i=0;i<n;i++) {
            int random = sr.nextInt(sb.length());
            password.append(sb.charAt(random));
        }
        System.out.println("\nPassword generated: "+password.toString());
        sc.close();
    }
}