package java_basic_0;

import java.util.Hashtable;
import java.util.*;
import java.lang.*;
import java.io.*;

public class HashmapVSHashtable {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        //ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(103,"Ravi");
        ht.put(102,"Rahul");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

	}
        //----------------hashmap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        //hm.put(100,"Amit");
        hm.put(100,"sumit"); 
        hm.put(102,"Vijay");
        hm.put(101,"Rahul");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());

}
}
}
