package objects;

import java.util.Scanner;

public class User {
  private String name;
  private String email;
  private int phone;

  public User(String name, String email, int phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  } // constructor

  public static void bookAnAppointment(Shelter shelter) {
    System.out.printf("Shelter Address: %s\n", shelter.getAddress());

    String[] days = shelter.getDays();
    String[][] hours = shelter.getHours();


    System.out.println("Available days for booking:");
    for (int i = 0; i < days.length; i++) {
        System.out.print("\u001B[31m");
         System.out.println((i + 1) + ". ");
          System.out.print("\u001B[0m");

          System.out.print(days[i] + "\n");
    }

    // user will choose a day to book
    System.out.println("Which day would you like to book for?:" + "Choose by number");
    Scanner input = new Scanner(System.in);
    int dayChoice = input.nextInt();

    if (dayChoice >= 1 && dayChoice <= days.length) {
        String chosenDay = days[dayChoice - 1];
        String[] availableHours = hours[dayChoice - 1];

        // Display available hours for the day
        System.out.println("Available hours for " + chosenDay + ":");
        for (int i = 0; i < availableHours.length; i++) {

          System.out.print("\u001B[31m");
            System.out.println((i + 1) + ". ");
             System.out.print("\u001B[0m");

            System.out.println(availableHours[i]);
        }

        // user choose hour to book
        System.out.println("What time would you like to book?:" + "Choose by number");
        int hourChoice = input.nextInt();
        if (hourChoice >= 1 && hourChoice <= availableHours.length) {
            String chosenHour = availableHours[hourChoice - 1];
            System.out.println("You have chosen to book for " + chosenDay + " at " + chosenHour);
            System.out.println("Your booking is confirmed for" + chosenDay + " at " + chosenHour);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    } else {
  
    }
System.out.println("Press any key to go back");
input.nextLine();
input.nextLine();
}


   
  

  //===============>>
  // GETTERS
  public String getName() {
    return this.name;
  }
  public String getEmail() {
    return this.email;
  }
  public int getPhone() {
    return this.phone;
  }

  //===============>>
  // SETTERS
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPhone(int phone) {
    this.phone = phone;
  }
} // class