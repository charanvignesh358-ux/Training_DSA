import java.util.Scanner;

public class wei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        double heightInMeters = height / 100.0;
        double bmi = weight / (heightInMeters * heightInMeters);

        if (bmi < 18.5) {
            System.out.println("You are underweight. Have an apple daily.");
        } else if (bmi < 25) {
            System.out.println("You are normal. Go walking daily and maintain it.");
        } else if (bmi < 30) {
            System.out.println("You are overweight. Go to the gym daily.");
        } else {
            System.out.println("You are obese. You need to see a doctor.");
        }
    }
}