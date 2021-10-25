import twitter4j.*;
import twitter4j.TwitterException;
import java.util.List;

public class MyTimelineClass {
    public static void main(String[] args) {

        Twitter twit = TwitterFactory.getSingleton();
        List<Status> status;
        {
            try {
                status = twit.getHomeTimeline(); //gets latest timeline
                for (Status st : status) {
                    System.out.println(st.getUser().getName() + "----------------" + st.getText());
                }
            } catch (TwitterException e) {
                e.printStackTrace();
            }
        }
    }
}
