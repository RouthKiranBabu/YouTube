/*
 * LRU (Least Recently Used) Cache implementation using LinkedHashMap in Java.
 * LinkedHashMap is used to maintain the order of insertion and provide O(1) access time.
 * When the cache exceeds its capacity, the least recently used entry is removed automatically.
 */

 import java.util.*;

 class script<K, V> extends LinkedHashMap<K, V> {
     private final int capacity;
 
     public script(int capacity) {
         super(capacity, 0.75f, true); // true enables access-order, making it an LRU cache
         this.capacity = capacity;
     }
 
     @Override
     protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
         return size() > capacity; // Remove the eldest when size exceeds capacity
     }
 
     public static void main(String[] args) {
         script<Integer, String> cache = new script<>(3); // LRU Cache with size 3
 
         cache.put(1, "A");
         cache.put(2, "B");
         cache.put(3, "C");
         System.out.println(cache); // {1=A, 2=B, 3=C}
 
         cache.get(1); // Accessing key 1 makes it most recently used
         cache.put(4, "D"); // This removes the least recently used key (2)
 
         System.out.println(cache); // {3=C, 1=A, 4=D}
 
         cache.put(5, "E"); // This removes the least recently used key (3)
 
         System.out.println(cache); // {1=A, 4=D, 5=E}
     }
 }
 
 /*
  * Output:
  * {1=A, 2=B, 3=C}
  * {3=C, 1=A, 4=D}
  * {1=A, 4=D, 5=E}
  *
  * Explanation:
  * - Initially, the cache is filled with 3 elements.
  * - Accessing key 1 makes it the most recently used.
  * - Adding key 4 removes key 2 (least recently used).
  * - Adding key 5 removes key 3.
  */
 