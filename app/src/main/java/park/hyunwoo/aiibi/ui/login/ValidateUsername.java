package park.hyunwoo.aiibi.ui.login;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;

import park.hyunwoo.aiibi.common.UseCaseRx;
import rx.Observable;
import rx.Scheduler;
import rx.functions.Func0;

/**
 * Created by hyun.park on 2/19/17.
 */

public class ValidateUsername extends UseCaseRx<ValidateUsername.RequestValues, ValidateUsername.ResponseValues> {

    public ValidateUsername(Scheduler threadExecutor, Scheduler postExecutionThread) {
        super(threadExecutor, postExecutionThread);
    }

    @Override
    protected Observable<ResponseValues> buildUseCaseObservable(final RequestValues requestValues) {
        final String username = requestValues.getUsername();
        return Observable.defer(new Func0<Observable<ResponseValues>>() {
            @Override
            public Observable<ResponseValues> call() {
                try {
//                    ResponseValues.create(
//                    ValidationUtil.meetsMaxCharacters(username),
//                    ValidationUtil.meetsMinCharacters(username),
//                    ValidationUtil.containsNoIllegalCharacters(username));

                } catch (Throwable t) {
//                            Exceptions.propagate(t);
                }
                return null;
            }
        });
    }

    @AutoValue
    public static abstract class RequestValues extends UseCaseRx.RequestValues {
        public static RequestValues create(@NonNull String username) {
            return new AutoValue_ValidateUsername_RequestValues(username);
        }

        abstract String getUsername();
    }

    @AutoValue
    public static abstract class ResponseValues extends UseCaseRx.ResponseValues {
        public static ResponseValues create(@NonNull boolean meetsMinCharacters,
                                            @NonNull boolean meetsMaxCharacters,
                                            @NonNull boolean containsNoIllegalCharacters) {
            return new AutoValue_ValidateUsername_ResponseValues(meetsMinCharacters,
                    meetsMaxCharacters, containsNoIllegalCharacters);
        }

        abstract boolean meetsMaxCharacters();

        abstract boolean meetsMinCharacters();

        abstract boolean containsNoIllegalCharacters();
    }
}