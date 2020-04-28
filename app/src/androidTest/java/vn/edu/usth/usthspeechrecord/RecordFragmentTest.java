    package vn.edu.usth.usthspeechrecord;

    import android.content.Context;
    import android.support.test.InstrumentationRegistry;
    import android.support.test.runner.AndroidJUnit4;

    import org.junit.Test;
    import org.junit.runner.RunWith;

    import static android.support.test.espresso.Espresso.onView;
    import static android.support.test.espresso.action.ViewActions.click;
    import static android.support.test.espresso.assertion.ViewAssertions.matches;
    import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
    import static android.support.test.espresso.matcher.ViewMatchers.withId;
    import static android.support.test.espresso.matcher.ViewMatchers.withText;
    import static org.hamcrest.Matchers.allOf;
    import static org.hamcrest.Matchers.not;
    import static org.junit.Assert.*;

    /**
     * Instrumented test, which will execute on an Android device.
     *
     * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
     */
    @RunWith(AndroidJUnit4.class)
    public class RecordFragmentTest {
        @Test
        public void useAppContext() {
            // Context of the app under test.

            Context appContext = InstrumentationRegistry.getTargetContext();

            assertEquals("vn.edu.usth.usthspeechrecord", appContext.getPackageName());

            onView(withId(R.id.btn_get_text)).perform(click()).check(matches(isDisplayed()));
            onView(withId(R.id.btn_retry)).perform(click()).check(matches(isDisplayed()));
            onView(withId(R.id.btnStartRecord)).perform(click()).check(matches(isDisplayed()));
            onView(withId(R.id.btnPlayRecord)).perform(click()).check(matches(isDisplayed()));
            onView(withId(R.id.btn_dialog)).perform(click()).check(matches(isDisplayed()));
            onView(withId(R.id.get_text)).check(matches(isDisplayed()));

        }
    }
