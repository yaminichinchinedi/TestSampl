import java.util.*;
import java.util.stream.Collectors;

public class Friends {

   static List<Person> persons =new ArrayList<>();;

    public static void makeFriend(String nameKey, String friendName) {

        try {
            if (!nameKey.isEmpty() && !friendName.isEmpty() && nameKey.trim() != "" && friendName.trim() != "" && nameKey != null && friendName != null &&
                    !(nameKey.equalsIgnoreCase(friendName))) {
                if (!persons.isEmpty()) {

                    for (Person p : persons.stream().filter(p->p!=null).collect(Collectors.toList())) {

                        if (p.getNameKey().equalsIgnoreCase(nameKey)) {


                                for (Person s1 : p.getFriendNames().stream().filter(s1->s1!=null).collect(Collectors.toList())) {
                                    if (s1.getNameKey().equalsIgnoreCase(friendName)) {
                                       return;
                                    }
                                   // else
                                    //    p.addFriend(friendName);
                                }




                            }


                    else {
                            Person p2 = new Person();
                            p2.setNameKey(nameKey);

                         List<String> friends2 = new ArrayList<>();
                          friends2.add(friendName);

                      //    p2.setFriendNames(friends2);
                          // p2.addFriend(friendName);
                            persons.add(p2);
                        }
                    }
                }
                else {
                        Person person = new Person();
                        person.setNameKey(nameKey);
                        List<String> friends = new ArrayList<>();
                        friends.add(friendName);
                   //   person.setFriendNames(friends);
                   // person.addFriend(friendName);
                        persons.add(person);

                    }






            }
        }catch(Exception e){
           e.printStackTrace();
            }
            }


    public static void main(String args[]) throws Exception{

        makeFriend("B","C");
        makeFriend("B","D");

        makeFriend("A","B");
        makeFriend("A","C");

      for(Person p: persons){
          System.out.println("Person is: "+p.getNameKey());
          System.out.println("hiS FRIENDS ARE ");
          for(Person p1:p.getFriendNames())
              System.out.println("friedns are  firend "+p1.toString());

      }




    }
}
