package park.hyunwoo.aiibi.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Hyunwoo Park on 10/31/2016.
 */
public class TimeUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz", Locale.getDefault());

    public static String getCurrentFormattedTime(String time) {
        try {
            Date date = sdf.parse(time);
            return date.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
