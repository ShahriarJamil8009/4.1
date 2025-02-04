class Pet {
    protected String name;
    protected int age;
    protected String type;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age + ", Type: " + type);
    }
}