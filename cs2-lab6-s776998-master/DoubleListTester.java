import java.util.NoSuchElementException;

public class DoubleListTester{
  public static void main(String[] args){

//====================================================
    DoubleList<String> list = new DoubleList<String>();
    System.out.println("\n==test addToFront()==");
    // create a list: front-->A<->B<->C<--rear
    list.addToFront("C");
    list.addToFront("B");
    list.addToFront("A");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);

    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());

    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

//====================================================
    System.out.println("\n==test addToRear()==");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    list.addToRear("C");

    System.out.println("test case: appending");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);

    System.out.println("test case: size increment");
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());

    System.out.println("test case: proper pointer handling");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

//====================================================
    System.out.println("\n==test addAfter()==");
    System.out.println("test case: add to middle");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("C");
    list.addAfter("A", "B");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

    System.out.println("test case: add to empty list");
    list = new DoubleList<String>();
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.addAfter("A", "B");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: add to nowhere");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.addAfter("C", "D");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }
    System.out.println("expect:\t AB");
    System.out.println("got:\t "+list);

    System.out.println("test case: add to rear");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    list.addAfter("B", "C");
    System.out.println("expect:\t ABC");
    System.out.println("got:\t "+list);
    System.out.println("expect:\t 3");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());

//====================================================
    System.out.println("\n==test removeFirst()==");
    System.out.println("test case: remove from empty list");
    list = new DoubleList<String>();
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.removeFirst();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the only node");
    list = new DoubleList<String>();
    list.addToRear("A");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeFirst());
    System.out.println("expect:\t 0");
    System.out.println("got:\t "+list.size());
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.first();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.last();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the first node");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeFirst());
    System.out.println("expect:\t 1");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.last());

//====================================================
    System.out.println("\n==test removeLast()==");
    System.out.println("test case: remove from empty list");
    list = new DoubleList<String>();
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.removeLast();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the only node");
    list = new DoubleList<String>();
    list.addToRear("A");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.removeLast());
    System.out.println("expect:\t 0");
    System.out.println("got:\t "+list.size());
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.first();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.last();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the last node");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.removeLast());
    System.out.println("expect:\t 1");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.last());

//====================================================
    System.out.println("\n==test remove()==");
    System.out.println("test case: remove from empty list");
    list = new DoubleList<String>();
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.remove("A");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the only node");
    list = new DoubleList<String>();
    list.addToRear("A");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.remove("A"));
    System.out.println("expect:\t 0");
    System.out.println("got:\t "+list.size());
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.first();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }
    try{
      System.out.println("expect:\t EmptyCollectionException");
      list.last();
    }catch(EmptyCollectionException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: element not found");
    list = new DoubleList<String>();
    list.addToRear("A");
    try{
      System.out.println("expect:\t NoSuchElementException");
      list.remove("B");
    }catch(NoSuchElementException e){
      System.out.println("got:\t "+e.toString());
    }

    System.out.println("test case: remove the first node");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.remove("A"));
    System.out.println("expect:\t 1");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.last());

    System.out.println("test case: remove the last node");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.remove("B"));
    System.out.println("expect:\t 1");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.last());

    System.out.println("test case: remove from the middle");
    list = new DoubleList<String>();
    list.addToRear("A");
    list.addToRear("B");
    list.addToRear("C");
    System.out.println("expect:\t B");
    System.out.println("got:\t "+list.remove("B"));
    System.out.println("expect:\t 2");
    System.out.println("got:\t "+list.size());
    System.out.println("expect:\t A");
    System.out.println("got:\t "+list.first());
    System.out.println("expect:\t C");
    System.out.println("got:\t "+list.last());
  }
}