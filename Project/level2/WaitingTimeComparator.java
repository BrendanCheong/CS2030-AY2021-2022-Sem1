import java.util.Comparator;

public class WaitingTimeComparator implements Comparator<Server> {

    public int compare(Server server1, Server server2) {
        // compare lowest server id or lowest next available time???
        double difference = server1.getServerId() - server2.getServerId();

        if (difference < 0) {
            return -1;
        } else if (difference > 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
