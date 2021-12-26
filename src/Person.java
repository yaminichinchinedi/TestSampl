import java.util.*;

public class Person {
    String nameKey;
    List<Person> friendNames;
//getter & setter methods

    public List<Person> getFriendNames() {
        return friendNames;
    }

    public void setFriendNames(List<Person> friendNames) {
        this.friendNames = friendNames;
    }




    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

public void addFriend(Person p){

        if(this.friendNames.isEmpty())
        {
            this.friendNames = new ArrayList<>();
        }

        this.friendNames.add(p);

        }



    public void removeFriend(String friendName) throws ConcurrentModificationException {
        if(friendName != null && friendName.trim() !="" && !friendName.isEmpty())
     if(!this.friendNames.isEmpty())
         for(Person p:this.friendNames){
             if(p.getFriendNames().contains(friendName) )
                 this.friendNames.remove(p);
         }
    }




    @Override
    public String toString()
    {
        return String.format( "Person Name: %s\n", nameKey);
    }//end toString()


}
