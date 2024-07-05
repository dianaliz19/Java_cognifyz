//temperature converter
import java.util.*;
public class t1_temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        Double t = sc.nextDouble();
        System.out.print("Enter the unit of measurement(Press c for celcius and f for farenheit): ");
        String choice = sc.next();
        switch (choice) {
            case "c": System.out.println("Converted temperature: "+((t*9/5)+32)+" Farenheit");
                break;
            case "f": System.out.println("Converted temperature: "+((t-32)*9/5)+" Celcius");
                break;
            default:System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
