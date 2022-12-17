package TasksWithStrings;

public class Test {
    public static void main(String[] args) {
    String str = "Good news everyone!";
    int index = str.indexOf("ne");
        System.out.println(index);

        int last = str.lastIndexOf("ne");
        System.out.println(last);
        String s2 = str.replace('o', 'a');
        System.out.println(s2);

        String str2 = "Runtime";
        StringBuilder str3 = new StringBuilder(str2);
        str3.append("the best");
        str2 = str3.toString();
        System.out.println(str2);


        String str4 = "Runtime";
        StringBuilder str5 = new StringBuilder(str4);



    }
}