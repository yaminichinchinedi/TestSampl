import java.util.*;
import java.util.stream.Collectors;

public class DuplicateRemoveArrayList {

    public static void main(String args[]) {

                ArrayList<String> list= new ArrayList<>(Arrays.asList
                        ("Hello", "World", "Hello", "Welcome"));
        System.out.println(list);
        System.out.println(list.stream().distinct().collect(Collectors.toList())); //simple single line of code

                List<String> noDup = list.stream().distinct().collect(Collectors.toList());

               System.out.println(noDup);
                Set<String> set = new HashSet<>();
                for(String s:list)
                    set.add(s);

        System.out.println(set);

String str ="hELLO";
char[] ch = str.toCharArray();

        ArrayList<Character> list1= new ArrayList<>();
        for(char c: ch)
            list1.add(c);

    //    System.out.println(list1.stream().filter(lis->lis.size()>1));
            }
        }

