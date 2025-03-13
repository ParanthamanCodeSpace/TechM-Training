public class Main {
    public static void main(String[] args) {
        // User class with overridden methods
        User user1 = new User("Alice", 25);
        User user2 = new User("Alice", 25);
        System.out.println("User toString: " + user1);
        System.out.println("User equality: " + user1.equals(user2));
        System.out.println("User hashCode: " + user1.hashCode() + ", " + user2.hashCode());

        // SecondUser class without overridden methods
        SecondUser secondUser1 = new SecondUser("Alice", 25);
        SecondUser secondUser2 = new SecondUser("Alice", 25);
        System.out.println("SecondUser toString: " + secondUser1);
        System.out.println("SecondUser equality: " + secondUser1.equals(secondUser2));
    }
}
