import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) throws Exception {
        char[] chars = new char[] {'\u0097'};
        String str = new String(chars);
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        LinkedList<String> list = new LinkedList<>();
        Collections.addAll(list,"abc","def","ghi","123","aaa","abc");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Sorting " +list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorting reverse order " +list);
        LinkedList<String> noDupllist = new LinkedList<>();
        LinkedList<String> dupllist = new LinkedList<>();
        for(String s:list)
            if(!noDupllist.contains(s))
                noDupllist.add(s);
            else if(noDupllist.contains(s))
                dupllist.add(s);


        System.out.println("without duplicates " +noDupllist);
        System.out.println("duplicates are " +dupllist);


    }
}