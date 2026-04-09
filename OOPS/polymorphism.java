public class polymorphism {
    public static class Dog{
        void speak(){
System.out.println("bark");
        }
    }
       public static class Cat{
        void speak(){
            System.out.println("meow");
        }
    }
       public static class Lion{
        void speak(){
            System.out.println("Sherrr");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hiii");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Human sneha = new Human();
        Pikachu p = new Pikachu();
        Lion l = new Lion();

        sneha.speak();
        p.speak();
        d.speak();
        c.speak();
        l.speak();
    }
}
