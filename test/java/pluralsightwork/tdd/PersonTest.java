package pluralsightwork.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setName() {
        Person person = new Person();
        String name = null;
        String expected = name;
        String actual = name;
        Assertions.assertNull(actual);
    }

    @Test
    void setAge() {
        Person person = new Person();
        int expected = 0;
        int actual = 0  ;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getName() {
        Person person = new Person();
        String expected = " ";
        String actual = " ";
        Assertions.assertEquals( actual, expected);
    }

    @Test
    void getAge() {
        Person person = new Person();
        int expected = 0;
        int actual = 0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void addName() {
        Person person = new Person();
        String expected = " ";
        String actual = null;
        Assertions.assertNull(actual);

    }

    @Test
    void removeName() {
        Person person = new Person();

    }

    @Test
    void getSizeOfList() {
        Person person = new Person();
    }
}