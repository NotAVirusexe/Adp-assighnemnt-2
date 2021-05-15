import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SetImplement implements Set{

    Set<String> setExample = new HashSet<>(); 
    

    public void populate() {
        setExample.add("Spot");
        setExample.add("lexi");
        setExample.add("Evee");
        setExample.add("Butch");
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
        System.out.println("Type the value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String addValue = keyb.next();
        addValue(addValue);
        System.out.println("the value has bein added");
        System.out.println("----------------------------------");

    }

    public void addValue(String addValue) {

        setExample.add(addValue);

    }
    public void removeValueInput(){
        System.out.println("Type the value you want to get rid of");
        Scanner keyb = new Scanner(System.in);
        String removeValue = keyb.next();
        removeValue(removeValue);
        System.out.println("the value has bein removed");
        System.out.println("----------------------------------");

    }
    public void removeValue(String removeValue) {

        setExample.remove(removeValue);

    }
    public void findValueInput(){
        System.out.println("Type the keyof the value you want to find");
        Scanner keyb = new Scanner(System.in);
        String findValue = keyb.next();
        findValue(findValue);
        System.out.println("----------------------------------");

    }
    public String findValue(String findValue) {
        String foundValue="Not found";
       for (String i :setExample){
           if(i.equals(findValue)){
               foundValue=i;
               System.out.println(i);
           }
           else {
               System.out.println("Value not found");
           }
       }
        return foundValue;
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
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
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


