import java.util.*;
import java.util.stream.Collectors;

public class reverseonlywordsinString {

    public static void main(String[] args){
        String str1="My name is Yamini";
        String rev = "";
        String arr[] = str1.split("\\s+");
       for(int i =arr.length-1; i>=0;i--){
           System.out.print(arr[i]+" ");
       }
       System.out.println();


    }
}
