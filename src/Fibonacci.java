public class Fibonacci {

    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;
        while (counter < N) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    static void FibonacciUpto(int N)
    {
        int num1 = 0, num2 = 1;
int num3 =0;
        int counter = 0;
        while (num3 < N) {
            System.out.print(num1 + " ");
             num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }


    public static void main(String args[])
    {
        System.out.println("Print count of Fibonacci no ");
        Fibonacci(20);
System.out.println();
        System.out.println("Print upto Fibonacci no ");
        FibonacciUpto(20);
    }


}
