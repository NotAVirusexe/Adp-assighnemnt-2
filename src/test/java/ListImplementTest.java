import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListImplementTest {

    @Test
    void addValue() {
        ListImplement listTestO =new ListImplement();

        String value="ItemTest1";
        listTestO.addValue(value);

       int valIndex= listTestO.listExample.indexOf(value);
       int result =listTestO.listExample.size()-1;
       assertEquals(result,valIndex);
        listTestO=null;
    }

    @Test
    void removeValue() {
        ListImplement listTestO =new ListImplement();

        String value="ItemTest1";
        listTestO.listExample.add(value);

        listTestO.removeValue(value);


        int valIndex= listTestO.listExample.indexOf(value);

        assertEquals(-1,valIndex);
        listTestO=null;
    }

    @Test
    void findValue() {
        SetImplement setTestO =new SetImplement();

        String value="ItemTest1";
        setTestO.addValue(value);

        String foundValue = setTestO.findValue(value);

        assertEquals(value,foundValue);
        setTestO=null;
    }
}