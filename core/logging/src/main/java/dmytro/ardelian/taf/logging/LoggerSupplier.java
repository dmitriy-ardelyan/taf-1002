package dmytro.ardelian.taf.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerSupplier {

    public static Logger getLogger() {
        final int stackThread = 2;
        return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[stackThread].getClassName());
    }

}
