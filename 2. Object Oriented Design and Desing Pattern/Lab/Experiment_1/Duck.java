
// Class implementing multiple interfaces

class Duck implements Animal, Bird, Swimmer {
    @Override
    public void eat() {
        System.out.println("Duck is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}