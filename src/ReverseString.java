
//Using Iterator Method

public class ReverseString
{
    public static void stringReverse(){
        String str="madam";
        int length = str.length();
        StringBuffer revString=new StringBuffer();
        for(int i =length-1; i>=0; i--){
            revString.append(str.charAt(i));
        }
        System.out.println(revString);

    }

//Recursive Method

    public static void recursiveRev(char[] str, int i)
    {
        int n=str.length;
        if(i==n/2)
            return;
        swap(str,i,n-i-1);
        recursiveRev(str,i+1);
    }
    static void swap(char[]arr, int i, int j)
    {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
        char[] str="madam".toCharArray();
        recursiveRev(str,0);
        System.out.println(String.valueOf(str));
        stringReverse();

    }
}