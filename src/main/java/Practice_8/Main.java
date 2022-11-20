package Practice_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User testUser = new User("Nike");
        users.add(testUser);
        users.add(new User("Helena"));
        users.add(new User("Alex"));
        users.add(new User("Elizabeth"));
        users.add(new User("Missy"));

        WaitList<User> waitList= new WaitList<>(users);
        System.out.println(waitList);

        BoundedWaitList<User> boundedWaitList = new BoundedWaitList<User>(users, users.size());
//        boundedWaitList.add(testUser);

        UnfairWaitList<User> unfairWaitList = new UnfairWaitList<User>(users);
        unfairWaitList.moveToBack(testUser);
        System.out.println(unfairWaitList);
    }
}