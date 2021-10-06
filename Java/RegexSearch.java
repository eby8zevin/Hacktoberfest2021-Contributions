import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your regex pattern:");
        Pattern pattern = Pattern.compile(in.nextLine());
        System.out.println("\nEnter your text:");
        Matcher matcher = pattern.matcher(in.nextLine());
        in.close();
        for (int i = 1; matcher.find(); i++) {
            System.out.println("\nMatch " + i + ": " + matcher.group(0));

            for (int j = 1; j <= matcher.groupCount(); j++) {
                System.out.println("\tGroup " + j + ": " + matcher.group(j));
            }
        }

    }
}
