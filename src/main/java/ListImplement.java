import java.util.*;

public class ListImplement {
    List<String> listExample = new ArrayList<>();


    public void populate() {
        listExample.add("James");
        listExample.add("Earl");
        listExample.add("Jones");


    }
    public void ui() {

        boolean cont = true;
        do {

            Scanner input = new Scanner(System.in);
            System.out.println("Choose a option");
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


    public void addValueInput() {
        System.out.println("Type the value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String addValue = keyb.next();
        addValue(addValue);
    }

    public void addValue(String addValue) {

            listExample.add(addValue);

    }
        public void removeValueInput(){
            System.out.println("Type the value you want to get rid of");
            Scanner keyb = new Scanner(System.in);
            String removeValue = keyb.next();
            removeValue(removeValue);

        }
    public void removeValue(String removeValue) {

        listExample.remove(removeValue);

    }
    public void findValueInput() {
        System.out.println("Type the keyof the value you want to find");
        Scanner keyb = new Scanner(System.in);
        String findValue = keyb.next();
        findValue(findValue);
    }

    public int findValue(String findValue) {
        System.out.println(listExample.indexOf(findValue));
        return listExample.indexOf(findValue);
    }
}

