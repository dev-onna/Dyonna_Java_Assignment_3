package objects;
import java.util.ArrayList;

public class Shelter {

  private String address = "123 Scoopers Lane";
  private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday/Sunday"};
  private String[][] hours = {
      {"8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM"},
      {"8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM"},
      {"8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM"},
      {"8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM"},
      {"8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM"},
      {"closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed", "closed"}
  };





  // composition: a class made up of other classes
  private ArrayList<Pet> pets = new ArrayList<>();

  public Shelter() {
    // do nothing
  }
  

  //=============>>
  // GETTERS
  public String getAddress() {
    return this.address;
  }
  public ArrayList<Pet> getPets() {
    return this.pets;
  }
  public Pet getPet(int idx) {
    return pets.get(idx);
  }
  public String[][] getHours() {
    return hours;
}
public String[] getDays() {
  return days;
}

  //=============>>
  // SETTERS
  public void setAddress(String address) {
    this.address = address;
  }
  public void setHours(String[][] hours) {
    this.hours = hours;
  }
  public void adopt(int idx, String owner) {
    pets.get(idx).setIsAdopted();
    pets.get(idx).setOwner(owner);
    System.out.printf("%s is now yours!", pets.get(idx).getName());
    pets.remove(idx); // takes the pet from the shelter
  }
  public void addPet(Pet pet) {
    pets.add(pet);
  }
  public void setDays(String[] days) {
    this.days = days;
  }
} // class