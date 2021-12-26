import java.util.HashMap;
import java.util.Map;

public class DuplicateCharinString {

public static void main(String args[]) {
     String s = "Hello World";
    findDuplicateCharacter(s);

}


    public static void findDuplicateCharacter(String input){
        char[]  arr = input.toCharArray();
        
        Map<Character,Integer> map = new HashMap<>();
        for(char c:  arr){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);


        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue() > 1)
                System.out.println(entry.getKey()+" : "+entry.getValue());
          //  entry.stream().forEach(System.out::println);
        }



    }
}

