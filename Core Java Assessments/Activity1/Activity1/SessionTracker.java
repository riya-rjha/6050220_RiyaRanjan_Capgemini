// package Activity1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SessionTracker {

    public static void main(String[] args) {

        // Creating sessions list
        List<String[]> sessions = new ArrayList<>();

        sessions.add(new String[]{"2024-01-01 09:00:00", "2024-01-01 10:00:00"});
        sessions.add(new String[]{"2024-01-01 09:30:00", "2024-01-01 11:00:00"});
        sessions.add(new String[]{"2024-01-01 10:00:00", "2024-01-01 12:00:00"});

        // Query time
        String queryTime = "2024-01-01 09:45:00";

        // Calling function
        SessionTracker tracker = new SessionTracker();
        int result = tracker.countActiveSessions(sessions, queryTime);

        // Printing result
        System.out.println("Active Sessions: " + result);
    }

    public int countActiveSessions(List<String[]> sessions, String queryTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime query = LocalDateTime.parse(queryTime, formatter);

        int count = 0;

        for (String[] session : sessions) {

            LocalDateTime start = LocalDateTime.parse(session[0], formatter);
            LocalDateTime end = LocalDateTime.parse(session[1], formatter);

            boolean started = !start.isAfter(query);
            boolean notEnded = query.isBefore(end);

            if (started && notEnded) {
                count++;
            }
        }

        return count;
    }
}