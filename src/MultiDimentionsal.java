public class MultiDimentionsal {

    public static void main(String args[]) throws Exception {

        char[][] abcd = {{'A', 'B'}, {'C', 'D'}};

        char[][] efgh = {{'E', 'F'}, {'G', 'H'}};

        char[][] ABCD = {{'A', 'B'}, {'C', 'D'}};

        if(abcd.length == ABCD.length || abcd.length ==efgh.length) {
            int n1 = 0, n2 = 0;
           int abcdlength = abcd.length;
           int ABCDLength = ABCD.length;
           int efghLength = efgh.length;
System.out.println(abcdlength);
            for (int i = 0; i < abcdlength; i++)
                for (int j = 0; j < abcdlength; j++) {
                    if (ABCD[i][j] == abcd[i][j]) ;
                    n1++;
                    if (ABCD[i][j] == efgh[i][j]) ;
                    n2++;
                }
            if (n1 == 4)
                System.out.println("abcd is equal to ABCD");
            else if (n2 == 4)
                System.out.println("abcd is equal to ABCD");
            else
                System.out.println("None are equal");
        }

    }

    
}
