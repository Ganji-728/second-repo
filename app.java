import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Alarm {
    String name;
    String severity;
    String time;

    public Alarm(String name, String severity, String time) {
        this.name = name;
        this.severity = severity;
        this.time = time;
    }
}

public class AlarmReport {

    public static void main(String[] args) {
        List<Alarm> alarms = new ArrayList<>();

        // Sample data (replace with email parsing later)
        alarms.add(new Alarm("DB Down", "High", "10:00 AM"));
        alarms.add(new Alarm("CPU Spike", "Medium", "11:30 AM"));
        alarms.add(new Alarm("Memory Leak", "High", "01:15 PM"));

        String fileName = "Daily_Report_" + LocalDate.now() + ".csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("Alarm Name,Severity,Time\n");

            for (Alarm alarm : alarms) {
                writer.append(alarm.name)
                      .append(",")
                      .append(alarm.severity)
                      .append(",")
                      .append(alarm.time)
                      .append("\n");
            }

            System.out.println("Report generated: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// dev-2 code.
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
