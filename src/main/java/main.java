import java.util.Scanner;



public class main {
    public static void gui(){
        Scanner input = new Scanner(System.in);
        System.out.println("What option do you want to see");
        System.out.println("1:Collection");
        System.out.println("2:List");
        System.out.println("3:Map");
        System.out.println("4:Set");
        System.out.println("Type in the number you want");

        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("Collection");

                System.out.println("Collection");
                CollectionImplement collection =new CollectionImplement();
                collection.populate();
                collection.ui();
                break;
            case 2:
                System.out.println("List");
                ListImplement list =new ListImplement();
                list.populate();
                list.ui();
                break;

            case 3:
                System.out.println("Map");
                MapImplement map =new MapImplement();
                map.populate();
                map.ui();
                break;
            case 4:
                System.out.println("Set");
                SetImplement set =new SetImplement();
                set.populate();
                set.ui();
                break;

        }



}
    public static void main(String[]args) {
        while(true){
            main.gui();


        }
    }
}
