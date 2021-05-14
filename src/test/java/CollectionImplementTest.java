import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionImplementTest {

    @Test
    void addValue() {
        CollectionImplement collectionTestO =new CollectionImplement();

        String value="ItemTest1";
        collectionTestO.addValue(value);

       Boolean val=collectionTestO.CollectionExample.contains(value);

        assertTrue(val);
        collectionTestO=null;
    }

    @Test
    void removeValue() {
        CollectionImplement collectionTestO =new CollectionImplement();

        String value="ItemTest1";
        collectionTestO.CollectionExample.add(value);

        collectionTestO.removeValue(value);


        Boolean val= collectionTestO.CollectionExample.contains(value);

        assertFalse(val);

    }

    @Test
    void findValue() {

        CollectionImplement collectionTestO =new CollectionImplement();

            String value="ItemTest1";
        collectionTestO.addValue(value);

            Boolean foundValue = collectionTestO.findValue(value);

            assertTrue(foundValue);


    }
}