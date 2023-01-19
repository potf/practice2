import jdk.jshell.execution.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ua.edu.sumdu.EmailExeption;
import ua.edu.sumdu.Student;
import ua.edu.sumdu.Utils;

import java.util.LinkedList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class StatsCalculatorTest {
    static LinkedList<Student> studs;

    @BeforeAll
    public static void setupData() {
        studs = new LinkedList<>();
        studs.add(new Student("Test1", "Test1", "11", "test1@mail.ua", "test", "test"));
        studs.add(new Student("Test2", "Test2", "12", "test2@mail.ua", "test", "test"));
        studs.add(new Student("Test3", "Test3", "13", "test3@mail.ua", "test", "test"));
        studs.add(new Student("Test4", "Test4", "14", "test4@mail.ua", "test", "test"));
    }

    @Test
    public void getEmailDomainTest() {
        String result = Utils.getEmailDomain("test@mail.com");
        assertEquals(result, "mail.com");
    }
@Test
    public void whenExeptionThrow_thenExeptionSatisfied() throws EmailExeption {
        studs.add(new Student("Exeption", "Exeption", "-1", "email", "test", "test"));
        Assertions.assertThrows(EmailExeption.class, () -> {
            Utils.calculatePopularDomain(studs);
        });
        studs.remove(3);
    }

    @Test
    public void patternMatchesTest(){
        String emailAddress = "username@domain.com";
        assertTrue(Utils.patternMatches(emailAddress));
    }

    @Test
    public void calculatePopulatDomainTest() throws EmailExeption{
        String result = Utils.calculatePopularDomain(studs);
        assertEquals("test.ua", result);
    }

    @Test
    public void calculateMeanAgeTest() {
        double result = Utils.calculateMeanAge(studs);
        assertEquals(21, result);
    }

}
