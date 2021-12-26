public class PermutationString {

public static void main(String[] args){
    printPermutations("123",0,2);
}
    private static void printPermutations(String input, int left, int right){
        if(null == input || input.isEmpty())
            return;
        if( left == right)
            System.out.println(input);
        else{
            for(int i=left; i<= right;i++){
                input = swapCharacter(input,left,i);
                printPermutations(input,left+1,right);
                input = swapCharacter(input,left,i);
            }
        }
    }
    private static String swapCharacter(String input, int left,int right){
        char[] arr = input.toCharArray();
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        String s= String.valueOf(arr);
        return s;
       // return String.valueOf(arr);
    }
}
