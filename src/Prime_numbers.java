import java.util.Scanner;

public class Prime_numbers{


    public static void main (String args[]){

        int n =20;

        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
    }
 /*   public static void main (String args[]){
        int status=1, n=3;
        Scanner in=new Scanner(System.in);
        System.out.println("enter numbers");
        n=in.nextInt();

        if (n>=1){
            System.out.println("the below are result prime numbers");
            System.out.println(2);
        }
        for (int count =2 ; count <=n; ){
            for (int j=2; j <= Math.sqrt(n) ; j++ ){
                if(n%j ==0 ){
                    status=0;
                    break;
                }
            }

            if(status !=0){
                System.out.println(n);
                count++;
            }

            status=1;
            n++;

        }
    }*/
}