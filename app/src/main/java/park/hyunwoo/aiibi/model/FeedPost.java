package park.hyunwoo.aiibi.model;

import com.google.auto.value.AutoValue;

/**
 * Created by hyun.park on 2/25/17.
 */
@AutoValue
public abstract class FeedPost {
    public abstract String brand();
    public abstract String model();
    public abstract String url();
    public static FeedPost create(String brand, String model, String url) {
        return new AutoValue_FeedPost(brand, model, url);
    }

//    public String displayString() {
//        return currency().symbol() + amount();
//    }
}