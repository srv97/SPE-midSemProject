import java.math.BigInteger;
import java.util.Scanner;

public class Calculator {
    public double addition(double a,double b)
    {
        return a+b;
    }

    public double subtraction(double a,double b)
    {
        return a-b;
    }

    public double multiplication(double a,double b)
    {
        return a*b;
    }

    public double division(double a,double b)
    {
        return a/b;
    }

    public double squareroot(double a)
    {
        return Math.sqrt(a);
    }

    public BigInteger factorial(double a) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= a; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public double logarithm(double a)
    {
        return Math.log(a);
    }

    public double power(double a,double b)
    {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        System.out.println("Hello there this is calculator program");
        Scanner sc = new Scanner(System.in);

        double a,b;
        int opt;

        Calculator cal = new Calculator();
        System.out.println("-------------------Welcome-------------\n");
        do {
            System.out.println("Operations : ");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Square Root");
            System.out.println("Enter 6 for Factorial");
            System.out.println("Enter 7 for Natural logarithm");
            System.out.println("Enter 8 for Power Function");
            System.out.println("Enter 9 to exit\n");
            System.out.println("Enter your choice : ");
            opt = sc.nextInt();


                switch (opt) {
                    case 1:
                        System.out.println("Enter two number : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a + " + " + b + " = " + cal.addition(a, b));
                        break;
                    case 2:
                        System.out.println("Enter two number : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a + " - " + b + " = " + cal.subtraction(a, b));
                        break;
                    case 3:
                        System.out.println("Enter two number : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a + " * " + b + " = " + cal.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println("Enter two number : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a + " / " + b + " = " + cal.division(a, b));
                        break;
                    case 5:
                        System.out.println("Enter a number : ");
                        a = sc.nextInt();
                        System.out.println("Square Root of " + a + " = " + cal.squareroot(a));
                        break;
                    case 6:
                        System.out.println("Enter a number : ");
                        a = sc.nextInt();
                        System.out.println("Factorial of " + a + " = " + cal.factorial(a));
                        break;
                    case 7:
                        System.out.println("Enter a number : ");
                        a = sc.nextInt();
                        System.out.println("Log of " + a + " = " + cal.logarithm(a));
                        break;
                    case 8:
                        System.out.println("Enter two number : ");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a + " to power " + b + " = " + cal.power(a, b));
                        break;
                    case 9:
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

        }while(opt!=9);



    }

}
