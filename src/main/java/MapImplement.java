import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Array;
import java.util.*;

public class MapImplement implements Map{
    Map<String, String> mapExample = new HashMap();

    public void populate() {
        mapExample.put("Spot", "GreatDane");
        mapExample.put("lexi", "DutchHund");
        mapExample.put("Evee", "Pokemon");
        mapExample.put("Butch", "Bulldog");
    }
    public void ui() {

        boolean cont = true;
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("What option do you want to see");
            System.out.println("1:find Value");
            System.out.println("2:Add Value");
            System.out.println("3:Remove Value");
            System.out.println("4:back");
            System.out.println("Type in the number you want");

            int choice = input.nextInt();
            System.out.println("----------------------------------");

            switch (choice) {
                case 1:
                   findValueInput();
                    break;
                case 2:
                    addValueInput();
                    break;
                case 3:
                   removeValueInput();
                    break;
                case 4:
                    cont = false;
                    break;
                default:
                    System.out.println("Error 404");
            }
        } while (cont);
    }
    public void addValueInput(){
        System.out.println("Type the key value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        System.out.println("Type in the name Value");
        String value = keyb.next();
        addValue(key,value);
        System.out.println("Value has bein added");
        System.out.println("----------------------------------");
    }

    public void addValue(String key,String value) {
        mapExample.put(key, value);

    }
    public void removeValueInput(){
        System.out.println("Type the key of the value you want to get rid of");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        removeValue(key);
        System.out.println("Value has bein removed");
        System.out.println("----------------------------------");

    }
    public void removeValue(String key) {

        mapExample.remove(key);

    }
    public void findValueInput(){
        System.out.println("Type the key of the value you want to find");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        findValue(key);
        System.out.println("----------------------------------");
    }

    public String findValue(String key) {

        String keyVal = mapExample.get(key);
        System.out.println("The value is"+keyVal);
        return keyVal;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Nullable
    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map m) {

    }

    @Override
    public void clear() {

    }

    @NotNull
    @Override
    public Set keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection values() {
        return null;
    }

    @NotNull
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
