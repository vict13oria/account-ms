package account.account;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;


class AccountApplicationTests {

    @BeforeAll
    static void printBeforeAll() {
        System.out.println("Before all methods execution");
    }

    @BeforeEach
    void printMsgBefore() {
        System.out.println("Message before");
    }


    @AfterEach
    void printMsgAfter() {
        System.out.println("Message after");
    }

    @AfterAll
    static void printAfterAll() {
        System.out.println("Message after all");
    }

//    @Test
//    @Disabled("Not yet implemented")
//    void checkTestFail() {
//        fail("Not yet implemented!!");
//    }

    @Test
    void testStringComparison() {
        System.out.println("This is the test case");
        String str1 = "This is the test case";
        assertEquals("This is the test case", str1);
    }

    @Test
    void testStringNotComparison() {
        System.out.println("This is not the test case");
        String str1 = "This is the test case";
        assertNotEquals("This is the test casse", str1);
    }

    @Test
    @DisplayName("Este par")
    void testEvenNumber() {
        int n = 2;
        boolean isEven = n % 2 == 0;
        assertTrue(isEven);
    }

    @RepeatedTest(3)
    void repeatedTest() {
        System.out.println("Repeated");
        assertEquals(1,1);
    }

    @Test
    void checkTimeout() {
        assertTimeout(Duration.ofSeconds(2),()->{
            Thread.sleep(1000);
        });
    }

    @Test
    void checkException() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });
    }

    @Test
    void testNull() {
        assertNull(Utils.getPropValue("key4"));
    }

    @Test
    void testNotNull() {
        assertNotNull(Utils.getPropValue("key3"));
    }

    @Test
    void isSameRefference() {
        assertSame(Utils.getPropValue("key1"), Utils.getPropValue("key1"));
    }
    @Test
    void isNotSameRefference() {
        assertNotSame(Utils.getPropValue("key1"), Utils.getPropValue("key2"));
    }

    @Test
    public void evenNumberTest() {
        assertFalse(Utils.isEvenNumber(3));
    }
    @Test
    public void oddNumberTest() {
        Utils utils1 = new Utils();
        assertTrue(Utils.isEvenNumber(4));
    }

    @Test
    public void testPalindrome() {
        assertTrue(Utils.isPalindrome(""));
    }

}
