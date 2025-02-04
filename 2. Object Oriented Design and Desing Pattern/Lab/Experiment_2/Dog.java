class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Dog");
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}