import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapImplement {
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


            switch (choice) {
                case 1:
                    System.out.println("Find");
                     findValueInput();
                    break;
                case 2:
                    System.out.println("Add");
                    addValueInput();
                    break;
                case 3:
                    System.out.println("Remove");
                    removeValueInput();
                    break;
                case 4:
                    System.out.println("Back");

                    cont = false;
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
    }

    public void addValue(String key,String value) {
        mapExample.put(key, value);

    }
    public void removeValueInput(){
        System.out.println("Type the keyof the value you want to get rid of");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        removeValue(key);

    }
    public void removeValue(String key) {

        mapExample.remove(key);

    }
    public void findValueInput(){
        System.out.println("Type the key of the value you want to find");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        findValue(key);

    }

    public String findValue(String key) {

        String keyVal = mapExample.get(key);
        System.out.println(keyVal);
        return keyVal;
    }

}
