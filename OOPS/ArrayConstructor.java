

public class ArrayConstructor {
      public static class Student{ 
        String name;
        int rno;
        int[] marks;

        public Student() {
        }
        
        public Student(int[] arr) {
            marks = arr;
        }
         public Student(int size) {
            marks = new int[size];
        }
        
        
    }
    public static void main(String[] args) {
        int[]arr ={3,6,1,3,8,9};
        Student s1 = new Student(5);
        s1.name="chirag";
        System.out.println(s1.name);
        s1.rno=555;
        System.out.println(s1.rno);
        Student s2 = new Student(arr);
        s2.marks[4]=55;
        System.out.println(s2.marks[4]);
    }
}
