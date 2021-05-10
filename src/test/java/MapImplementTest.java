import java.io.InputStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapImplementTest {

    @org.junit.jupiter.api.Test
    void populate() {

        MapImplement mapTestO =new MapImplement();
        mapTestO.populate();
        String Item=mapTestO.mapExample.get("Spot");
        assertEquals("GreatDane",Item);
        mapTestO=null;

    }


    @org.junit.jupiter.api.Test
    void addValue() {
        MapImplement mapTestO =new MapImplement();
        String key="KeyTest1";
        String value="ItemTest1";
        mapTestO.addValue(key,value);
        String mapValue=mapTestO.mapExample.get("KeyTest1");
        assertEquals("ItemTest1",mapValue);
        mapTestO=null;

    }

    @org.junit.jupiter.api.Test
    void removeValue() {
        MapImplement mapTestO =new MapImplement();
        String value = "ItemTest1";
        String key = "KeyTest1";
        mapTestO.mapExample.put(key, value);
        mapTestO.removeValue(key);
        String mapValue=mapTestO.mapExample.get("KeyTest1");
        assertEquals(null,mapValue);
        mapTestO=null;
    }

    @org.junit.jupiter.api.Test
    void findValue() {
        MapImplement mapTestO =new MapImplement();
        String key = "KeyTest1";
        String value = "ItemTest1";
        mapTestO.mapExample.put(key,value);
        String foundValue = mapTestO.findValue(key);

        assertEquals(value,foundValue);


    }
}