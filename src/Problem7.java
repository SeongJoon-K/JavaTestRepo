import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem7 {

    static List<List<String>> friendRelelation = new ArrayList<>();
    static List<String> friendList = new ArrayList<>();
    public static void main(String[] args) {

        AddFriendList("test1","test2");
        AddFriendList("test2","test3");
        AddFriendList("test3","test6");
        AddFriendList("test4","test1");
        addAllUsers(); // 나의
        System.out.println(myFriendList("test1"));
        Stream<List<String>> name = friendRelelation.stream()
                .filter(friend -> friend.get(1).isEmpty());
        System.out.println("여기서 뭐 나오려나 : "+ name);
    }



    static Set<String> myFriendList (String myName) {
        Set<String> myFriends = new HashSet<>();
        for (List<String> strings : friendRelelation) {
            for (int j = 0; j < 2; j++) {
                System.out.println("이름 : " + strings.get(j));
                if (strings.get(j).equals(myName)) {
                    myFriends.add(strings.get(0));
                    myFriends.add(strings.get(1));
                }
            }
        }
        myFriends.remove(myName);
        return myFriends;
    }
    static void addAllUsers () {
        Set<String> allFriendsList = new HashSet<>();
        for (List<String> strings : friendRelelation) {
            allFriendsList.add((strings.get(0)));
            allFriendsList.add((strings.get(1)));

        }
    }
    static List<List<String>> AddFriendList (String friend1, String friend2) {
        List<String> friends = new ArrayList<>();
        friends.add(friend1);
        friends.add(friend2);
        friendRelelation.add(friends);
        return friendRelelation;
    }
}
