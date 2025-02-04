import java.util.ArrayList;
import java.util.List;

class PetShop {
    private List<Pet> pets;

    public PetShop() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.name + " has been added to the pet shop.");
    }

    public void displayPets() {
        System.out.println("\nPets Available in the Shop:");
        for (Pet pet : pets) {
            pet.displayInfo();
            System.out.println("");
        }
    }
}