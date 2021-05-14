import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CollectionImplement implements Collection{

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
            System.out.println("----------------------------------");
            int choice = input.nextInt();


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
                default:{
                    System.out.println("Error 404");

                }
            }
        } while (cont);
    }


    public void addValueInput() {
        System.out.println("Type the value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String addValue = keyb.next();
        addValue(addValue);
        System.out.println("value has bein added to the Collection");
        System.out.println("----------------------------------");
    }

    public String addValue(String value) {
        String addedValue=value;
       CollectionExample.add(addedValue);
       return addedValue;
    }

    public void removeValueInput(){
        System.out.println("Type the value you want to get rid of");
        Scanner keyb = new Scanner(System.in);
        String removeValue = keyb.next();
        removeValue(removeValue);
        System.out.println("Value has bein removed from the collection");
        System.out.println("----------------------------------");

    }



    public String  removeValue(String value) {

        CollectionExample.remove(value);
        return value;

    }

    public void findValueInput() {
        System.out.println("Type the value of the item you want to find");
        Scanner keyb = new Scanner(System.in);
        String findValue = keyb.next();
        findValue(findValue);
        System.out.println("----------------------------------");

    }

    public Boolean findValue(String findValue) {
       Boolean check = CollectionExample.contains(findValue);
       if (check){
           System.out.println("Value has bein found");
           }
       else{
           System.out.println("Value Not Found");

       }

       return check;

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
    public boolean contains(Object o) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }
}