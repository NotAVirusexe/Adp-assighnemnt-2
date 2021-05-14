import java.util.*;

public class ListImplement implements List{
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
            System.out.println("----------------------------------");

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
                default:
                    System.out.println("Error 404");
            }
        } while (cont);
    }


    public void addValueInput() {

        System.out.println("Type the value that you want to add");
        Scanner keyb = new Scanner(System.in);
        String addValue = keyb.next();
        addValue(addValue);
        System.out.println("Value has bein added");
        System.out.println("----------------------------------");

    }

    public void addValue(String addValue) {

            listExample.add(addValue);

    }
        public void removeValueInput(){
            System.out.println("Type the value you want to get rid of");
            Scanner keyb = new Scanner(System.in);
            String removeValue = keyb.next();
            removeValue(removeValue);
            System.out.println("Value has bein removed");
            System.out.println("----------------------------------");


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
        System.out.println("Index of trhe value is "+listExample.indexOf(findValue));
        System.out.println("----------------------------------");
        return listExample.indexOf(findValue);
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

    @org.jetbrains.annotations.NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @org.jetbrains.annotations.NotNull
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
    public boolean addAll(@org.jetbrains.annotations.NotNull Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @org.jetbrains.annotations.NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @org.jetbrains.annotations.NotNull
    @Override
    public ListIterator listIterator() {
        return null;
    }

    @org.jetbrains.annotations.NotNull
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @org.jetbrains.annotations.NotNull
    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(@org.jetbrains.annotations.NotNull Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(@org.jetbrains.annotations.NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@org.jetbrains.annotations.NotNull Collection c) {
        return false;
    }

    @org.jetbrains.annotations.NotNull
    @Override
    public Object[] toArray(@org.jetbrains.annotations.NotNull Object[] a) {
        return new Object[0];
    }
}

