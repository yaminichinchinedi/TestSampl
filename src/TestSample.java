// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class TestSample {
    public static int solution(int N) {
        // write your code in Java SE 8
        int x= N/10;
        System.out.println("x is "+x);

        int y= N-(10*x);
        //y=N%10;
        System.out.println("y is "+y);
        int z=10*(x+1)+(y-1);
        System.out.println("nnext digit is is "+z);
        return z;

    }

    public static void main(String args[]) throws Exception {

        int[] n= {28,30,301,3002};
        for(int i:n)
        {
            System.out.println("Given Number = "+i+", The next smallest number of its digit's sum is: "+solution(i));

        }

int i;
        for( i=5;i>=0;i--){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
