public class UserDefinedDataType {

    //class hai class blureprint hota hai
    public static class Student{ //khudka data typee
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa+" ");
        }
    }
    public static void main(String[] args) {
        Student s1  = new Student(); // declaration
        s1.name="Chirag";
        s1.cgpa= 9.85;
        s1.rno= 50;

        Student s2  = new Student(); // declaration
        s2.name="Sneha";
        s2.cgpa= 9.95;
        s2.rno= 55;

        Student s3  = new Student(); // declaration
        s3.name="rururu";
        s3.cgpa= 10.95;
        s3.rno= 58;

        //object hai objext blueprint

        // System.out.println(s1.name);
        s1.print();
        s2.print();
        s3.print();
    
    }


    
}
