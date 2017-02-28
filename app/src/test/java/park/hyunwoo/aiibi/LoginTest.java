package park.hyunwoo.aiibi;

//import android.support.annotation.Nullable;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import rx.Observable;
//import rx.Subscriber;
//
//import static org.mockito.Mockito.when;

/**
 * Created by hyun.park on 2/19/17.
 */

public class LoginTest {
//
//    @Mock
//    private RegistrationService registrationService;
//
//    @Before
//    public void setup() {
//        // Mockito has a very convenient way to inject mocks by using the @Mock annotation. To
//        // inject the mocks in the test the initMocks method needs to be called.
//        MockitoAnnotations.initMocks(this);
//    }
//
//    private Subscriber getSubscriber(@Nullable final Class expectedThrowable,
//                                     final int status) {
//        return new Subscriber<UsernameStatus>() {
//            @Override
//            public void onCompleted() {
//                if (expectedThrowable != null) Assert.fail("expected throwable was non-null");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                if (expectedThrowable == null) Assert.fail("expected throwable is null");
//                Assert.assertTrue("got wrong throwable",
//                        e.getCause().getClass().isAssignableFrom(expectedThrowable));
//            }
//
//            @Override
//            public void onNext(UsernameStatus usernameStatus) {
//                if (expectedThrowable != null) Assert.fail("expected throwable was non-null");
//                else {
//                    Assert.assertEquals("incorrect status", status, usernameStatus.status());
//                }
//            }
//        };
//    }
//
//    @Test
//    public void testUsernameTooShort() {
//        when(registrationService.checkUsername(anyString()))
//                .thenReturn(Observable.just(new UsernameStatus(500, false, false, false)));
//        ValidateUsername request = new ValidateUsername(Schedulers.immediate(),
//                Schedulers.immediate(), registrationService);
//        request.execute(ValidateUsername.RequestValues.create("abc"),
//                getSubscriber(InvalidUsernameException.class, 0));
//    }
//
//    @Test
//    public void testUsernameTooLong() {
//        when(registrationService.checkUsername(anyString()))
//                .thenReturn(Observable.just(new UsernameStatus(500, false, false, false)));
//        ValidateUsername request = new ValidateUsername(Schedulers.immediate(),
//                Schedulers.immediate(), registrationService);
//        request.execute(ValidateUsername.RequestValues.create("a123456789012345678901"),
//                getSubscriber(InvalidUsernameException.class, 0));
//    }
//
//    @Test
//    public void testValidUsername() {
//        when(registrationService.checkUsername(anyString()))
//                .thenReturn(Observable.just(new UsernameStatus(200, true, true, true)));
//        ValidateUsername request = new ValidateUsername(Schedulers.immediate(),
//                Schedulers.immediate(), registrationService);
//        request.execute(ValidateUsername.RequestValues.create("user.01"),
//                getSubscriber(null, 200));
//    }
}
