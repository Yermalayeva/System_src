import Controler.PetControler;
import Model.Pet;
import Services.IRepository;
import Services.PetRepository;
import UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetControler controller = new PetControler(myFarm);
        new ConsoleMenu (controller).start();
    }
}    