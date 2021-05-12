import java.util.*;

public class CollectionImplement {

    Collection<String> CollectionExample = new ArrayList<>();

    public void populate() {
        CollectionExample.add("Spot");
        CollectionExample.add("lexi");
        CollectionExample.add("Evee");
        CollectionExample.add("Butch");
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
//                    findValue();
                    break;
                case 2:
                    System.out.println("Add");
                    addValue();
                    break;
                case 3:
                    System.out.println("Remove");
                    removeValue();
                    break;
                case 4:
                    System.out.println("Back");

                    cont = false;
            }
        } while (cont);
    }

    public void addValue() {
        System.out.println("Type the value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        CollectionExample.add(key);

    }

    public void removeValue() {
        System.out.println("Type the keyof the value you want to get rid of");
        Scanner keyb = new Scanner(System.in);
        String key = keyb.next();
        CollectionExample.remove(key);

    }

    public void findValueInput() {
        System.out.println("Type the value of the item you want to find");
        Scanner keyb = new Scanner(System.in);
        String findValue = keyb.next();
        findValue(findValue);
    }

    public void findValue(String findValue) {

    }
}