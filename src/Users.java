import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.stream.Collectors;

public class Users {



        static List<Person> persons = new ArrayList<>();
      public static Person savePerson(String name){
        //  persons.stream().collect(Collectors.toList())
          Person p = new Person();
          for(Person pe:persons.stream().filter(pe->pe!=null).collect(Collectors.toList())) {
              if(pe.getNameKey().equalsIgnoreCase(name)) {
                  p = pe;

              }

          }
           if(p==null){
                p=new Person();
                p.setNameKey(name);
                 persons.add(p);

           }
           return p;
      }

        public static void makeFriend(String nameKey, String friendName) throws ConcurrentModificationException, Exception {

            try {
                if (!nameKey.isEmpty() && !friendName.isEmpty() && nameKey.trim() != "" && friendName.trim() != "" && nameKey != null && friendName != null &&
                        !(nameKey.equalsIgnoreCase(friendName))) {

                    if (!persons.isEmpty()) {

                       for(Person p: persons.stream().filter(p->p!=null).collect(Collectors.toList()))
                            if (!p.getNameKey().equalsIgnoreCase(nameKey)) {
                              Person per =savePerson(nameKey);
                                List<Person> se = new ArrayList<>();

                                se.add(savePerson(friendName));
                                per.setFriendNames(se);


                                persons.add(per);

                            } else {
                                if (!p.getFriendNames().isEmpty()) {

                                    for (int i = 0; i < p.getFriendNames().size(); i++) {
                                        Person po = p.getFriendNames().get(i);
                                        if (!po.getNameKey().equalsIgnoreCase(friendName)) {
                                            Person pe1 = new Person();
                                            pe1.setNameKey(friendName);
                                            p.addFriend(pe1);
                                        } else {
                                            break;
                                        }

                                    }

                                }
                                persons.add(p);
                            }

                        }

                    } else {

                        Person p1 = new Person();
                        Person p2 = new Person();
                        p1.setNameKey(nameKey);
                        p2.setNameKey(friendName);
                        List<Person> pel = new ArrayList<>();
                        pel.add(p2);
                        p1.setFriendNames(pel);
                        //    p1.addFriend(p2);
                        persons.add(p1);
                        persons.add(p2);
                    }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        public static void main(String args[]) throws Exception {

            makeFriend("B", "C");
            makeFriend("B", "D");

            makeFriend("A", "B");
            makeFriend("A", "C");

            for (int j = 0; j < persons.size(); j++) {
                System.out.println("Person Name is: " + persons.get(j).getNameKey());
                System.out.println("Friends are: ");
                if (persons.get(j).getFriendNames() != null && persons.get(j).getFriendNames().isEmpty()) {
                    for (Person p1 : persons.get(j).getFriendNames())
                        System.out.print(" , " + p1.getNameKey());
                    System.out.println();
                } else
                    System.out.println("No Friends  ");

            }
        }
    }






