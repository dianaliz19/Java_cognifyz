//palindrome checker
import java.util.*;
public class t2_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine().trim();
        input = input.replaceAll("[\\s\\p{Punct}]","");
        int n = input.length();
        int flag = 0;
        for(int i=0;i<n/2;i++){
            if(input.charAt(n-i-1)!=input.charAt(i)){
                System.out.println("Not a palindrome");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Palindrome");
        sc.close();
    }
}
