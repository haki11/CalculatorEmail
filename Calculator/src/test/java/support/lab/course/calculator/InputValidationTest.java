package support.lab.course.calculator;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InputValidationTest {

    private InputValidation inputValidation;


    @Before
    public void beforeStart() {
        inputValidation = new InputValidation();
        System.out.println("My name is .....");
    }

    @After
    public void afterEach() {
        System.out.println("My student id is .....");
    }

    @Test
    public void testValidEmailInput() {
        assertTrue(inputValidation.isValidEmail("aaa@bbb.com"));
        System.out.println("My student id ....");
    }

    @Test
    public void testInvalidEmailInput() {

        assertFalse(inputValidation.isValidEmail("aaa@bbb"));

    }

    @Test
    public void testObjectNotNull() {
        assertNotNull(inputValidation);
    }
}
