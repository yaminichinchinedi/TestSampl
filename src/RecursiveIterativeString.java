import java.io.BufferedWriter;
import java.io.FileWriter;

public class RecursiveIterativeString {


   static void reverserecursiive(String str){

        if(str==null||str.length()<=1){
            System.out.print(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverserecursiive(str.substring(0,str.length()-1));
        }

    }

    public static synchronized void main(String args[])
throws InterruptedException    {

       Thread f = new Thread();
       f.start();
        System.out.print("A");
        f.wait(1000);
        System.out.print("B");
String str="Hello world";
reverserecursiive(str);
        System.out.println();
        iterativestrrev(str);
       // System.out.println("recursive string reverse is " +reve);


    }

  static  void iterativestrrev(String str){

        for(int i=str.length()-1;i>=0;i--)
            System.out.print(str.charAt(i));

      System.out.println();
    }


    public void recursiveMethod(String s,int index){
        if(index<=0)
            index=0;
        System.out.println(s.charAt(index));
        while(index<s.length()){
            index=index+1;
            recursiveMethod(s,index);
        }
    }

}

