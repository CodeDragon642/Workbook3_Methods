import java.math.BigInteger;

public class FibonacciCalc {
    public static void main (String[] args){
        Fibonacci(100);
    }

    public static void Fibonacci(int counter){
        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;

        BigInteger nextNum = BigInteger.ONE;

        System.out.println(num1);
        System.out.println(num2);

        while (0 < counter-2){
            System.out.println(nextNum);
            num1=num2;
            num2 = nextNum;
            nextNum = num1.add(num2);
            counter--;
        }
    }
}