import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<String> arrayList = new MyArrayList<>();
//       // String[]
//        arrayList.add("123");
//        arrayList.add("234");
//
//
//        System.out.println(arrayList.get(0));
//        arrayList.clear();
//        arrayList.add("123");
//        System.out.println(arrayList.get(0));
//        arrayList.add("456");
//        arrayList.add("789");
//        System.out.println(Arrays.toString(arrayList.array));
//        arrayList.remove(0);
//        System.out.println(Arrays.toString(arrayList.array));
//        System.out.println(arrayList.get(100));
//        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
//        myLinkedList.add("First");
//        myLinkedList.add("Second");
//       // myLinkedList.clear();
//        myLinkedList.remove(0);
//
//
//
//      // System.out.println(myLinkedList);
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(1));
//
//
//        MyLinkedList$MyNode@5f184fc6
//       MyLinkedList$MyNode@5f184fc6
//        LinkedList<String> sd = new LinkedList<>();
//        sd.clear();
//        sd.get(1);
       // sd.remove(1);

        MyQueue<String> myQueue = new MyQueue<>();
//        myQueue.add("First");
//        myQueue.add("Second");
//        myQueue.add("Third");
//        System.out.println(Arrays.toString(myQueue.array));
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.poll());
//        System.out.println(Arrays.toString(myQueue.array));
//        System.out.println(myQueue.size());
//        myQueue.clear();
//        System.out.println(Arrays.toString(myQueue.array));


//        MyStack<String> myStack = new MyStack<>();
//        myStack.push("First");
//        myStack.push("second");
//        myStack.push("Third");
//        myStack.push("Fourth");
//        System.out.println(Arrays.toString(myStack.array));
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());
//        System.out.println(Arrays.toString(myStack.array));
//        myStack.remove(1);
//        System.out.println(Arrays.toString(myStack.array));
 //      HashMap<String, String> test = new HashMap<>();
//        test.put("Ukraine", "Kyiv");
  //      test.put("Ukraine", "London");
//        System.out.println(test);

        MyHashMap<String, String> test1 = new MyHashMap<>();
        test1.put("Ukraine", "Kyev");
        test1.put("Ukraine1", "London1");
        test1.put("Ukraine2", "London1");

        System.out.println(test1.get("Ukraine1"));
        test1.remove("Ukraine1");
        System.out.println(test1.get("Ukraine1"));
        System.out.println(test1.size());
        test1.clear();
        System.out.println(test1.size());


    }
}
