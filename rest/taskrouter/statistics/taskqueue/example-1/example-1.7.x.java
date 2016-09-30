// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.workspace.taskqueue.TaskQueueStatistics;

public class Example {
  private static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String AUTH_TOKEN = "your_auth_token";
  private static final String WORKSPACE_SID = "WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  private static final String TASKQUEUE_SID = "WQXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    TaskQueueStatistics statistics =
        TaskQueueStatistics.fetch(WORKSPACE_SID, TASKQUEUE_SID).execute();

    System.out.println(
        "Reservations Accepted: " + statistics.getCumulative().get("reservations_accepted"));
  }
}
