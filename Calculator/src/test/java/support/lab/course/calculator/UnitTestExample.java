package support.lab.course.calculator;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;


public class UnitTestExample {

    private static final String TEST_STRING = "Hello World";

    //We dont have access to Context in our Junit test classes, we need to mock it

    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext () {

        //Returns the TEST_STRING when getString(R.string.hello_world) is called
        when(mMockContext.getString(R.string.text_hello_world)).thenReturn(TEST_STRING);

        // Creates an object of ClassUnderTest with the mock context
        ClassUnderTest objectUnderTest = new ClassUnderTest(mMockContext);

        // Stores the return value of getHelloWorldString();
        String result = objectUnderTest.getHelloWorldString();

        // Asserts that result is the value of TEST_STRING
        assertThat (result, is(TEST_STRING));

    }
}
