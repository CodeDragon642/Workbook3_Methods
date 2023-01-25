import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args){
        //read in two user inputs
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter two different numbers");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();


        System.out.println(num1 + " add " + num2 + " = " + Addition(num1, num2));
        System.out.println(num1 + " take away " + num2 + " = " +Subtract(num1, num2));
        System.out.println(num1 + " times " + num2 + " = " +Multiply(num1, num2));
        System.out.println(num1 + " divided by " + num2 + " = " + Divide( num1, num2));

    }
    static int Addition(int a, int b){
        return (a + b);
    }

    static int Subtract(int a, int b){
        return (a-b);
    }
    static int Multiply(int a, int b){
        return (a*b);
    }
    static int Divide(int a, int b){
        return (a/b);
    }

}