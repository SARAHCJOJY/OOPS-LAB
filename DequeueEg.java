import java.util.Deque;
import java.util.LinkedList;
public class DequeueEg {
    public static void main(String args[])
    {
        Deque<Integer> dq=new LinkedList<Integer>();
        dq.add(100);
        dq.add(200);
        dq.add(300);
        System.out.println(dq);
        dq.addFirst(50);
        dq.addFirst(350);
        dq.addFirst(400);
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
  //      System.out.println(dq.peekFirst());
  //       System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}