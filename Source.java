class Node<T> {
  public int data;
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {

    Node<Integer> pointer = head;
    int sum = 0;

    git addwhile (pointer != null) { // Validation
      sum = sum + pointer.val;
      pointer = pointer.next;
    }
      return sum;
  }







  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7
    
    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));
  }
}
