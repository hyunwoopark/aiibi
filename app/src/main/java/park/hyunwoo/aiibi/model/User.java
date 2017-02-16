package park.hyunwoo.aiibi.model;

import com.google.auto.value.AutoValue;
/**
 * Created by Hyunwoo Park on 2/15/2017.
 */

@AutoValue
public abstract class User {
    abstract String id();
    abstract String username();
    abstract String email();
    abstract String profileUrl();
}
