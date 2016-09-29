/* File: ResizingQueue.java
 * Classes: 
 * Date: 2/19/15
 * Class: Boston University CS 112, Spring 2015
 * Author: Wayne Snyder (snyder@bu.edu)
 * Purpose: Template for Lab 05
 */

package HW04.B1;

public class ResizingQueue {
   
   private final int INITIAL_SIZE = 10; 
   
   private int [] A = new int[INITIAL_SIZE];    // array to hold queue: front is always at Q[0]
                                                // and rear at A[next-1] 
   
   private int next = 0;                        // location of next available unused slot  
   
   // interface methods
   
   public void enqueue(int key) {          // push the key onto the back of the queue
      // if array is full, must resize 
      // in any case, put key at rear of queue
   }
   
// This method resizes an array A to twice as big
   private void resize() { 
      // create a new array B twice as big as A
      // transfer everything from A over to the same slots in B (i.e., A[0] goes to B[0], A[1] to B[1], etc.)
      // A = B;     // assign the object named by B to the name A; since A and B are references, you can do this!
   }
   
   public int dequeue() {            // remove the top integer and return it -- will cause error if empty! 
      // your code here
      return 0;   
   }
   
   public boolean isEmpty() {
      return (next == 0); 
   }
   
   public int size() {                 // how many integers in the queue
      return next; 
   }
   
   public String toString() {
      
      String s = "[";
      for(int i = 0; i < A.length; ++i) {
         if(i == next)
            s += " | " + A[i];
         else if(i == 0)
            s += A[i];
         else 
            s += ", " + A[i];
      }
      s += "]"; 
      return s;   
   }
   
   
   // unit test
   
public static void main(String [] args) {
      
      ResizingQueue Q = new ResizingQueue();  
      
      System.out.println("Unit Test for ResizingQueue\n\nNote: numbers to right of bar \"|\" in [5], [6], & [8] may be as shown or");
      System.out.println("you may choose to set them to 0 -- it does not matter. ");
      
      System.out.println("\nTesting toString on empty queue....");

      
      System.out.println("\n[1] Should be:\n[ | 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
      System.out.println(Q);      
      
      System.out.println("\nTesting size and isEmpty() on empty queue....");
      
      System.out.println("\n[2] Should be:\n0\ttrue");
      System.out.println(Q.size() + "\t" + Q.isEmpty()); 
      
      System.out.println("\nTesting enqueue...");
      
      Q.enqueue(3); 
      Q.enqueue(5);
      Q.enqueue(7);
      
      System.out.println("\n[3] Should be:\n[3, 5, 7 | 0, 0, 0, 0, 0, 0, 0]");
      System.out.println(Q); 
      
      System.out.println("\nTesting size and isEmpty on non-empty queue....");
      
      System.out.println("\n[4] Should be:\n3\tfalse");
      System.out.println(Q.size() + "\t" + Q.isEmpty()); 
  /*    
      System.out.println("\nTesting dequeue...");
      
      int n = Q.dequeue(); 
      
      System.out.println("\n[5] Should be:\n[5, 7 | 7, 0, 0, 0, 0, 0, 0, 0]\tQ.dequeue() => 3");
      System.out.println(Q + "\tQ.dequeue() => " + n);      
      
      n = Q.dequeue(); 
      n = Q.dequeue(); 
      
      System.out.println("\n[6] Should be:\n[ | 7, 7, 7, 0, 0, 0, 0, 0, 0, 0]\tQ.dequeue() => 7");
      System.out.println(Q + "\tQ.dequeue() => " + n);      
      
      System.out.println("\nTesting resizing...");
      
      for(int i = 10; i <= 25; ++i)
         Q.enqueue(i); 
      
      System.out.println("\n[7] Should be:\n[10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 | 0, 0, 0, 0]");
      System.out.println(Q);      
          
       for(int i = 0; i < 13; ++i)
         Q.dequeue(); 
       
             System.out.println("\n[8] Should be:\n[23, 24, 25 | 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 0, 0, 0, 0]");
      System.out.println(Q); 
      
      */
   }
   
   
}

