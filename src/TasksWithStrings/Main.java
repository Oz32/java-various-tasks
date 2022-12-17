package TasksWithStrings;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(26);
        user.setFriend("Damir");
        user.setName("Alexander");
        user.setWeight(90);

        System.out.println("User = {name: " + user.getName()
                + ", age: " + user.getAge() + " years,"
                + " friend: " + user.getFriend()
                + ", weight: " + user.getWeight() + " kg}");

        String text = String.format(
                "User = {name: %s, age: %d years, friend: %s, weight: %d kg}",
                user.getName(), user.getAge(), user.getFriend(), user.getWeight());

        System.out.println(text);

        String s3 = String.format("a = %d, b = %d, c = %d", 1 ,3 ,4);
        System.out.println(s3);

        int a = -1, b = 4, c = 3;
        String template;
        if (a < 0){
            template = "Warning! a = %d, b = %d, c = %d";
        } else {
            template = "a = %d, b = %d, c = %d";
        }

        System.out.println(String.format(template, a, b, c));
    }
}