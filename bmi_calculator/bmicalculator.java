import java.util.Scanner;
public class bmicalculator{
    public static void main(String[] args){
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sb.nextLine();

        System.out.println("Enter weight in kg: ");
        double weight = sb.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = sb.nextDouble();
        final double meter_per_inch = 0.0254;

        double height_in_meters = height * meter_per_inch;
        double bmi = weight /(height_in_meters * height_in_meters);
    
        System.out.println("Calculated BMI: "+ bmi);
        if (bmi< 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 24.9){
            System.out.println("Healthy weight");
        }
        else if (bmi < 29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }
    }
}