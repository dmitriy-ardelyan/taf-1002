package dmytro.ardelian.taf.assertions;

import dmytro.ardelian.taf.logging.LoggerSupplier;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Verify {

    public static void equals(Object expected, Object actual, String message) {
        logMessage(expected, actual, message);
        assertThat(actual, equalTo(expected));
    }

    public static void isTrue(Object actual, String message) {
        logMessage(true, actual, message);
        assertThat(actual, is(true));
    }

    private static void logMessage(Object expected, Object actual, String message) {
        LoggerSupplier.getLogger().info(String.join("\n", "Verifying {}", "Expected : {}", "Actual : {}")
                , message, expected, actual);
    }

}
