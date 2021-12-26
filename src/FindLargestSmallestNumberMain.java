

    public class FindLargestSmallestNumberMain {

        public static void main(String[] args) {

            //array of 10 numbers
            int arr[] = new int[]{12, 56, 76, 89, 100, 343, 21, 234};
            int largest = arr[0];
            int smallest = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest)
                    largest = arr[i];
                if (arr[i] < smallest)
                    smallest = arr[i];
            }


            System.out.println("Largest is: " + largest + ", smallest is: " + smallest);

String str = "abc";
int left =0;
int right = str.length()-1;
            printPermutations(str,left,right);
          
        }
public static void printPermutations(String input, int left, int right){
if(null==input||input.isEmpty())
    return;
if(left==right) {
    System.out.println(input);

}
else {
    for(int i =left;i<=right;i++)
    {

              input=  SwapCharacter(input,left,i);
        printPermutations(input,left+1,right);
        input=  SwapCharacter(input,left,i);
    }
}
}

        public static String SwapCharacter(String input, int left, int right) {
char[] arr = input.toCharArray();
            char temp ;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            return String.valueOf(arr);
        }
    }
