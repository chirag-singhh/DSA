

class ArrayList{
    //user defined data structure
    int[] arr;
    int idx =0;
    int size = 0;

    public ArrayList(int capacity) {
       arr = new int[capacity];
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length*2];
        for (int idx = 0; idx < arr.length; idx++) {
            arr2[idx] = arr[idx];
        }
        arr= arr2;
    }
    void add(int ele){
         if (size == arr.length) {
            capacityIncrease();
        }
        arr[idx++]=ele;
        size++;
    }
    int capacity(){
        return  arr.length;
    }
    void display(){
        for (int idx = 0; idx < size; idx++) {
            System.out.println(arr[idx]+" ");
            
        }
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList(8);
        arr.add(10);
        arr.add(22);
        arr.add(120);
        arr.add(56);
        arr.add(10);
        arr.add(22);
        arr.add(120);
        arr.add(56);
           arr.add(22);
        arr.add(120);
        arr.add(56);


          System.out.println(arr.size);
          arr.display();
    }   
}
