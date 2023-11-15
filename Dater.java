//Aditya Das and Jonathan Adrian
import java.util.Calendar;

public class Dater {
    public static String getDate() {
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString();
        return dateTimeStr;
    }
}
