import java.util.*;

public class FriendsList {

    static Map<String, List<String>> map = new HashMap<>();


    public static void main(String args[]) throws Exception {

        makeFriend("B", "C");
        makeFriend("B", "D");

      makeFriend("A", "B");
        makeFriend("A", "C");
      System.out.println(map);

    }
    public static void makeFriend(String nameKey, String friendName) {
        if (!nameKey.isEmpty() && !friendName.isEmpty() && nameKey.trim() != "" && friendName.trim() != "" && nameKey != null && friendName != null &&
                !(nameKey.equalsIgnoreCase(friendName))) {
            if (!map.isEmpty()) {
                for (Map.Entry m1 : map.entrySet()) {


                    if (!m1.getKey().toString().equals(nameKey)) {
                        List<String> liss = new ArrayList<>();
                        liss.add(friendName);
                        map.put(nameKey, liss);
                    } else if(m1.getKey().toString().equals(nameKey)) {

                        Iterator it = map.get(nameKey).listIterator();
while(it.hasNext())
{
    List<String> l = new ArrayList<>();
    String st=it.next().toString();
    l.add(st);
if(!st.equals(friendName))
      l.add(friendName);
map.put(nameKey,l);

}


                    }



                }
            }
             else {
                List<String> lis = new ArrayList<>();
                lis.add(friendName);
                map.put(nameKey, lis);
            }
        }
    }
}
