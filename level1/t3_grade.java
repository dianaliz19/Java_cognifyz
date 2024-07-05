//student grade calculator
import java.util.*;
public class t3_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of grades to be entered: ");
        int n = sc.nextInt();
        double sum=0;
        double grades[] = new double[n];
        for(int i=0;i<n;i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }
        System.out.printf("Average grade: %.2f",sum/n);
        sc.close();
    }
}
