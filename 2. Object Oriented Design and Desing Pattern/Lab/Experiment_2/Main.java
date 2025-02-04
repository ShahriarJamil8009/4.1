/* 
2. PET Management System  
Write a Java program to demonstrate a PET management system, which could be a PET shop, PET care, or PET service.
Ensure you follow appropriate object-oriented design concepts while implementing the tasks.
*/    


public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        Pet pet1 = new Pet("Whiskers", 2, "Cat");
        Dog pet2 = new Dog("Buddy", 3, "Golden Retriever");

        shop.addPet(pet1);
        shop.addPet(pet2);

        shop.displayPets();
    }
}
