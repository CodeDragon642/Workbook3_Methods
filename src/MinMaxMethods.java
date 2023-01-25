import java.util.Scanner;

public class MinMaxMethods {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input a number.");
        double num1 = userInput.nextDouble();
        System.out.println("Please input another number.");
        double num2 = userInput.nextDouble();
        System.out.println("Please input another number.");
        double num3 = userInput.nextDouble();

        if ((num1 %1 == 0) && (num2 %1 == 0) && (num3 %1 == 0)) {
            System.out.println("The minimum of the three numbers is " + findTheMin((int)num1, (int)num2, (int)num3));
            System.out.println("The maximum of the three numbers is " + findTheMax((int)num1, (int)num2, (int)num3));
        }
        else{
            System.out.println("The minimum of the three numbers is " + findTheMin(num1, num2, num3));
            System.out.println("The maximum of the three numbers is " + findTheMax(num1, num2, num3));
        }

    }

    static int findTheMin(int a, int b, int c){
        int minimum = a;
        if (minimum > b){
            minimum = b;
        }
        if (minimum > c){
            minimum = c;
        }
        return (minimum);
    }

    static double findTheMin(double a, double b, double c){
        double minimum = a;
        if (minimum > b){
            minimum = b;
        }
        if (minimum > c){
            minimum = c;
        }
        return (minimum);
    }

    static int findTheMax(int a, int b, int c){
        int maximum = a;
        if (maximum < b){
            maximum = b;
        }
        if (maximum < c){
            maximum = c;
        }
        return (maximum);
    }

    static double findTheMax(double a, double b, double c){
        double maximum = a;
        if (maximum < b){
            maximum = b;
        }
        if (maximum < c){
            maximum = c;
        }
        return (maximum);
    }

}