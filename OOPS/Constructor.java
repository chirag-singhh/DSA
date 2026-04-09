public class Constructor {
    public static class Car{
        int seats;
        String name;
        double length;
        // Car(){
        //     // defalut constructor likho mt likho woh aayea hi
        // }
        Car(int x , String s, double d){
            //Parameterized constructor
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(4, "Audi", 5.5);
        Car c2 = new Car(5, "Alto", 2.5);
        c1.print();
        c2.print();
    }
}
