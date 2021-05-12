import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetImplementTest {

    @Test
    void addValue() {
        SetImplement setTestO =new SetImplement();

        String value="ItemTest1";
        setTestO.addValue(value);

        Boolean contain= setTestO.setExample.contains(value);

        assertTrue(contain);
        setTestO=null;
    }

    @Test
    void removeValue() {
       SetImplement setTestO =new SetImplement();

        String value="ItemTest1";
        setTestO.setExample.add(value);

        setTestO.removeValue(value);
        Boolean contain= setTestO.setExample.contains(value);

        assertFalse(contain);
        setTestO=null;
    }

    @Test
    void findValue() {


    }
}