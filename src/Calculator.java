import java.util.Random;
import java.util.Scanner;

public class Calculator {
    int x;
    int y;

    //5 void methods that will display the result of calculations
    // + - / *

    public Calculator(int x, int y){
        //global scope variables, can be accessed within anything in this class.
        this.x = x;
        this.y = y;
    }
    public Calculator(){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * calculates the sum of x and y
     */
    public void printSum() {
        int sum = x + y; //sum is a local variable, can only be used in this method.
        System.out.println(sum);
    }
    public void printSum(int a, int b){
        System.out.println(a + b);
    }
    public void printSum(int z){
        int sum = x + y + z;
        System.out.println(sum);
    }
    //method overloading: method names are the same but different parameters, similar to constructor overloading

    public void printDifference(){
        System.out.println(x - y);
    }
    public void printQuotient(){
        System.out.println((double) x / y);
    }
    public void printProduct(){
        System.out.println(x * y);
    }

    /**
     * calculates the sum of x and y
     * @return returns sum of x and y
     */
    public int getSum(){
        int sum = x+y;
        return sum;
    }

    /**
     * calculate the product of x and y plus num
     * @param num any integer value
     * @return product of x and y plus num
     */
    public int getProductPlusNum(int num){
        int p = x * y + num;
        return p;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class TestCalculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator(4, 8);
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int w = r.nextInt();
        double g = Math.random();
        calc.setX(5);
        //calc.setY(5);
        //System.out.println("Enter x : ");
        //int x = input.nextInt();
        //calc.setX(x);

        //System.out.println("Enter y : ");
        //int y = input.nextInt();
        //calc.setY(y);


        calc.printSum();
        calc.printSum(10); //adds 14 to the sum
        System.out.println("calling non void method...");
        System.out.println(calc.getSum());

        int num = calc.getSum() * 10;
        System.out.println(num);
        int p = calc.getProductPlusNum(2);
        System.out.println(p);
        System.out.println(calc.toString());
    }
}
