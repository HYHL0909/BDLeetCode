package day01;

public class Main {
    public static void main(String[] args){
        LRUCache lruCache=new LRUCache(1) ;
//        lruCache.put(1,1);
        lruCache.put(2,1);
        System.out.println(lruCache.get(2));
//        System.out.println(lruCache.get(1));
//        lruCache.put(3,3);
//
//        System.out.println(lruCache.get(2));
//        lruCache.put(4,4);
//        System.out.println(lruCache.get(1));
//        System.out.println(lruCache.get(3));
//        System.out.println(lruCache.get(4));
    }
}
