package Model;

public class Admin extends User{
    public Admin() {
        super();
    }
    @Override
    public void showList() {
        System.out.println("|-------------------------------|");
        System.out.println("|          Model.Admin Powers         |");
        System.out.println("|-------------------------------|");
        System.out.println("| 1. Add New Model.Car                |");
        System.out.println("| 2. View Cars                  |");
        System.out.println("| 3. Update Model.Car                 |");
        System.out.println("| 4. Delete Model.Car                 |");
        System.out.println("| 5. Add New Model.Admin              |");
        System.out.println("| 6. Show Rents                 |");
        System.out.println("| 7. Quit                       |");
        System.out.println("|-------------------------------|");
    }

}
