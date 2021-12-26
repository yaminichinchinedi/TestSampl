import java.util.Locale;

public class Qualibar {

    public static void main(String args[]) {

        //expected output should be
        //0 1 1 2 3 5 8 13 21 34
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;
        System.out.print("Fibonnaci series of first 10 numbers: " + n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();

        //Output - remove white spaces and tabs newlines

        String str= "Hello India Have\n a\tGoodDay ";
        System.out.println(str);
        //str=str.toLowerCase(Locale.ROOT);
        //str=str.replaceAll("\\n\\t\\W", "");
       str=str.replaceAll("\\n","");
        str=str.replaceAll("\\t","");
        str=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(str);

    }

}
