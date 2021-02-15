package calculator;

public class Operations {

    public double addition(double a, double b) {//take to parameters and make and addition
        return a + b;
    }

    public double subtraction(double a, double b) {//take to parameters and make and subtraction
        return a - b;
    }

    public double multiplication(double a, double b) {//take to parameters and make and multiplication
        return a * b;
    }

    public double division(double a, double b) {//take to parameters and make and division
        return a / b;
    }

    public double nthRoot(double a) {//Square Root
        return Math.sqrt(a);
    }

    public double exponentiation(double a, double b) {//pow
        return Math.pow(a, b);
    }

    public String isInt(double n) {//evaluate is a number is pair and return it

        if (n % 1 == 0) {
            return Integer.toString((int) n);
        } else {
            return Double.toString(n);
        }
    }

    public static String isPrime(double num) {//Evaluate a number to verify if it is a prime number
        double vector = num - 1;

        if (num <= 0) {
            return "This number canot be evaluate";
        } 
           
         else {

            while (num != 1 && vector != 1) {
                if (num % vector == 0) {
                    num = 1;

                } else {
                    vector--;
                }
            }//end wild
        } //end else
        if (vector == 1) {
            return "This is a prime number";
        } else if (0 > num) {
            return "Negative number can not be proccess";
        } else {
            return "This is not a prime number";
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
