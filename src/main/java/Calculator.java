import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    public double addition(double a,double b)
    {
        double res;
        logger.info("Calculating sum of two number : "+a+" and "+b);
        res = a+b;
        logger.info("Sum is : "+res);
        return res;
    }

    public double subtraction(double a,double b)
    {
        double res;
        logger.info("Calculating difference of two number : "+a+" and "+b);
        res = a-b;
        logger.info("Difference is : "+res);
        return res;
    }

    public double multiplication(double a,double b)
    {
        double res;
        logger.info("Calculating product of two number : "+a+" and "+b);
        res = a*b;
        logger.info("Product is : "+res);
        return res;
    }

    public double division(double a,double b)
    {
        double res;
        logger.info("Calculating division of two number : "+a+" and "+b);
        res = a/b;
        logger.info("Quotient is : "+res);
        return res;
    }
    public double squareroot(double a) {
        double res=0;
        try {
            logger.info("Calculating squareroot of : " + a);
            if(a<0)
            {
                res=Double.NaN;
                throw new Exception("Number < 0");
            }
            else
                res = Math.sqrt(a);
        } catch (Exception e) {
            logger.error("Number cannot be negative "+e.getMessage());
        }
        finally {
            logger.info("Squareroot is : "+res);
        }
        return res;
    }

    public double logarithm(double a)
    {
        double res=0;
        try {
            logger.info("Calculating natural logarithm of : " + a);
            if(a<0)
            {
                res=Double.NaN;
                throw new Exception("Number < 0");
            }
            else
                res = Math.log(a);
        } catch (Exception e) {
            logger.error("Invalid Number "+e.getMessage());
        }
        finally {
            logger.info("log is : "+res);
        }
        return res;
    }

    public double power(double a,double b) {
        double res;
        logger.info("Calculating "+a+" to power "+b);
        res = Math.pow(a,b);
        logger.info("Result is : "+res);
        return res;
    }

    public double factorial(double a) {
        logger.info("Calculating factorial for "+a);
        double fact = 1;
        try
        {
            if(a<0)
            {
                fact=Double.NaN;
                throw new Exception("Number < 0");
            }
            if(a!=(int)a)
            {
                fact=Double.NaN;
                throw new Exception("Number is float");
            }
            int i = 1;
            while(i<=a) {
                fact = fact * i;
                i++;
            }
        }
        catch (Exception e)
        {
            logger.error("Invalid Number "+e.getMessage());
        }
        finally {
            logger.info("Result is : "+fact);
        }
        return fact;
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        System.out.println("Hello there this is calculator program");
        Scanner sc = new Scanner(System.in);

        double a,b;
        int opt;

        Calculator cal = new Calculator();
        System.out.println("--------------------Welcome--------------------\n");
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
            System.out.println("Enter 9 to Exit\n");
            System.out.println("Enter your choice : ");
            opt = sc.nextInt();


            switch (opt) {
                case 1:
                    System.out.println("Enter two number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + " + " + b + " = " + cal.addition(a, b)+"\n");
                    break;
                case 2:
                    System.out.println("Enter two number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + " - " + b + " = " + cal.subtraction(a, b)+"\n");
                    break;
                case 3:
                    System.out.println("Enter two number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + " * " + b + " = " + cal.multiplication(a, b)+"\n");
                    break;
                case 4:
                    System.out.println("Enter two number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + " / " + b + " = " + cal.division(a, b)+"\n");
                    break;
                case 5:
                    System.out.println("Enter a number : ");
                    a = sc.nextInt();
                    System.out.println("Square Root of " + a + " = " + cal.squareroot(a)+"\n");
                    break;
                case 6:
                    System.out.println("Enter a number : ");
                    a = sc.nextInt();
                    System.out.println("Factorial of " + a + " = " + cal.factorial(a)+"\n");
                    break;
                case 7:
                    System.out.println("Enter a number : ");
                    a = sc.nextInt();
                    System.out.println("Log of " + a + " = " + cal.logarithm(a)+"\n");
                    break;
                case 8:
                    System.out.println("Enter two number : ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(a + " to power " + b + " = " + cal.power(a, b)+"\n");
                    break;
                case 9:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice!\n");
                    break;
            }

        }while(opt!=9);
    }
}
