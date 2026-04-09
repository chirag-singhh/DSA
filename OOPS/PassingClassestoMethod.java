public class PassingClassestoMethod {
    
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        }
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Bullet";
        c.seats = 4;
        c.torque = 122;
        c.type = "suv";

        changecar(c);
        System.out.println(c.seats);
        c.print();
    }

//pass by refrence
    private static void changecar(Car c) {
       c.seats = 55;
    }
}
