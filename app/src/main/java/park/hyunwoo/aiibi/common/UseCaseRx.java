package park.hyunwoo.aiibi.common;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

/**
 * Created by hyun.park on 2/19/17.
 */

public abstract class UseCaseRx<R extends UseCaseRx.RequestValues, T> {

    private final Scheduler threadExecutor;
    private final Scheduler postExecutionThread;

    private Subscription subscription = Subscriptions.empty();

    protected UseCaseRx(Scheduler threadExecutor,
                        Scheduler postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    /**
     * Builds an {@link rx.Observable} which will be used when executing the current {@link UseCaseRx}.
     */
    protected abstract Observable<T> buildUseCaseObservable(R requestValues);

    /**
     * Executes the current use case.
     *
     * @param useCaseSubscriber The guy who will be listen to the observable build
     * with {@link #buildUseCaseObservable(R requestValues)}.
     */
    @SuppressWarnings("unchecked")
    public void execute(R requestValues, Subscriber<T> useCaseSubscriber) {
        this.subscription = this.buildUseCaseObservable(requestValues)
                .subscribeOn(threadExecutor)
                .observeOn(postExecutionThread)
                .subscribe(useCaseSubscriber);
    }

    /**
     * Used to create an the observable which can be combined with other
     * observables before it is started, e.g. RX Zip operator
     */
    public Observable<T> defer(R requestValues) {
        return this.buildUseCaseObservable(requestValues)
                .subscribeOn(threadExecutor)
                .observeOn(postExecutionThread);
    }

    /**
     * Unsubscribes from current {@link rx.Subscription}.
     */
    public void unsubscribe() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    /**
     * Data passed to a request.
     */
    public static abstract class RequestValues {
    }

    /**
     * Data returned from a request.
     */
    public static abstract class ResponseValues {
    }
}