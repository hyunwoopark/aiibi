package park.hyunwoo.aiibi.model;

import com.google.auto.value.AutoValue;

/**
 * Created by Hyunwoo Park on 3/14/2017.
 */

@AutoValue
public abstract class Artifact {
    public abstract String brand();
    public abstract String model();
    public abstract String url();
    public static Artifact create(String brand, String model, String url) {
        return new AutoValue_Artifact(brand, model, url);
    }

//    public String displayString() {
//        return currency().symbol() + amount();
//    }
}