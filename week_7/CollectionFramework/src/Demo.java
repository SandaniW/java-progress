import java.util.ArrayList;
import java.util.LinkedList;

//collection framework is part of the util
public class Demo {
    public static void main(String[]args){
        //arraylist
        ArrayList<String> arrayList = new ArrayList<>();
        //arrays have a fixed length when the limit exceeds the limit,
        // arraylist will create a new extended array and copy the previous arrays data to the new one
        //cons-if used in a program that needs to be constantly updated; too much costly back operation
        //pros-random access

        //add elements
        arrayList.add("Jhon");
        arrayList.add("Paul");
        arrayList.add("Simon");
        System.out.println(arrayList);

        //remove by index
        arrayList.remove(0);
        System.out.println(arrayList);

        //remove by name
        arrayList.remove("Paul");
        System.out.println(arrayList);

        //can pass own demo classes(objects) - department

        //linked list
        //cons-random access is hard
        //pros-sequential access
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("red");
        linkedList.add("blue");
        linkedList.add("green");
        System.out.println(linkedList);

    }

}
