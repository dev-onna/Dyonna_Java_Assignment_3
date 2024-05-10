import utility.*;
import objects.*;
import java.util.Scanner;

public class Adopt_a_pet {
   private static Scanner input = new Scanner(System.in);
   private static Ink ink = new Ink();
   private static User user;
   private static Shelter shelter = new Shelter();
   private static Pet pet;

   private static int choice;
   private static boolean isDone = false;
   private static boolean goBack = false;

   public static void main(String[] args) {

    ink.printWelcome();
    createUser(); // create the user
    createPets(); // helper pets
  
    
  

    
    while(!isDone) {
    
      choice = ink.validateMainMenu();
  
    

      switch (choice) {
        case 1: // print available pets
          ink.printAvailablePets(shelter.getPets());
          while(!goBack) {
            int pick = input.nextInt();
            if(pick != 0) {
              ink.printPetDetails(shelter.getPet(pick - 1));
              String answer = input.next();
              if(answer.equalsIgnoreCase("Y")) {
                shelter.adopt(pick - 1, user.getName());
                goBack = true;
              }
              else {
                goBack = true;
              }
            }
            else {
              goBack = true;
            }
          } // while
          break;
        case 2: // print shelter details
          ink.printShelterDetails(shelter);
          goBack = true;
          break;
        case 3: // book an appointment menu
          createBookAnAppointment();
          break;
        case 4:
          isDone = true;
          break;
      } // switch
      goBack = false; // seems wrong but it is NOT wrong
    } // while(main)

   
  } // main
   

  public static void createPets() {
    pet = new Pet("spot", "dog",
      3, "black", "hound");
    shelter.addPet(pet);
    pet = new Pet("cleveland", "dog",
      7, "brown", "boxer");
    shelter.addPet(pet);
    pet = new Pet("monster", "cat",
      1, "calico", "calico");
    shelter.addPet(pet);
  } // createPets()

  public static void createUser() {
    String name, email;
    int phone;
  
    System.out.println("What is your name? ");
    name = input.nextLine();
    System.out.println("What is your email? ");
    email = input.nextLine();
    System.out.println("What is your phone? ");
    phone = input.nextInt();

    input.nextLine();

    user = new User(name, email, phone);
  } // createUser()
  public static void createBookAnAppointment() {
    User.bookAnAppointment(shelter);
}

} // class