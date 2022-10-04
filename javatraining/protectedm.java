package javatraining;

class Animal{
    protected void display() {
        System.out.println("I am a dog");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog obj = new Dog();
                obj.display();
    }
}