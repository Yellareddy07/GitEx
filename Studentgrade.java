import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 75)
            System.out.println("Grade: B");
        else if (percentage >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}
