package park.hyunwoo.aiibi.util;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Hyunwoo Park on 10/30/2016.
 */

public class RxUtil {

//    public static final int TIMEOUT = 500;

    public static <T> Observable.Transformer<T, T> ioThreadToMainThread() {
        return observable -> observable.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }

//    public static Subscription debouncedOnClick(View view, Action1<Void> action) {
//        return RxView.clicks(view)
//                .debounce(TIMEOUT, TimeUnit.MILLISECONDS)
//                .subscribe(action, error -> Timber.e(error, error.getMessage()));
//    }

//    public static <T> Observable.Transformer<T, T> retryWithBackOff(int maxRetries) {
//        return tObservable -> tObservable.retryWhen(errors -> errors
//                .zipWith(Observable.range(1, maxRetries), (n, i) -> i)
//                .flatMap(retryCount -> Observable.timer((long) Math.pow(4, retryCount), TimeUnit.SECONDS))
//        );
//    }
}