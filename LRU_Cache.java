import java.util.*;

public class LRU_Cache {
    Node head = new Node(0,0);
    Node tail = new Node(0, 0);
    Map<Integer,Node> map = new HashMap<>();
    int capacity;

    public LRU_Cache(int cap){
        this.capacity = cap;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        insert(new Node(key, value));
    }

    public void insert(Node node) {
        map.put(node.key, node);
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
    }

    private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

class Node{
    int key;
    int value;
    Node next = null;
    Node prev = null;
    Node(int key,int value){
        this.key = key;
        this.value = value;
    }
}
