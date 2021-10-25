import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.TwitterException;
import twitter4j.Twitter;
import java.util.Scanner;
public class MyTweetClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be posted : ");
        String str = sc.nextLine();
        Twitter twit = TwitterFactory.getSingleton();
        try{
            Status status =twit.updateStatus(str);
            System.out.println("Successfully updated");
        } catch (TwitterException te){
            te.printStackTrace();
        }
    }
}