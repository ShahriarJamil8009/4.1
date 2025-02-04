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
