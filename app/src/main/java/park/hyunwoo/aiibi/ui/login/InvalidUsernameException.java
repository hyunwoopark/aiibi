package park.hyunwoo.aiibi.ui.login;

/**
 * Created by hyun.park on 2/19/17.
 */

public class InvalidUsernameException extends Throwable {

    public InvalidUsernameException() {
        super();
    }

    public InvalidUsernameException(String message) {
        super(message);
    }
}