package junit4tutorial;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitCoreRunner {

    @Test
    public void runWithJunitCore(){
        Result result = JUnitCore.runClasses(sumintegernumberTest.class);

        for (Failure failure: result.getFailures()) {

//            System.out.println(failure.toString());
//            System.out.println(failure.getDescription());
//            System.out.println(failure.getException());
//            System.out.println(failure.getMessage());
//            System.out.println(failure.getTrace());
//            System.out.println(failure.getTestHeader());
              Assert.fail(failure.toString());
            //
            // .assertThat(false).as
        }
//        Assertions.assertThat(result.wasSuccessful()).isTrue();

//        result.
//        System.out.println(result.wasSuccessful());

    }
}
