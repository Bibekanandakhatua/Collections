package com.collection24augmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Driver {
  
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("karnatak","BLR");
		map.put("maharastra","mumbai");
		map.put("mp","bhopal");
		map.put("odisha","Bbsr");
		map.put("maharastra","mumbai"); 
		map.put("telengana","hyd");
		
		//System.out.println(map);
		
        Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		
        linkedHashMap.put("karnatak","BLR");
        linkedHashMap.put("maharastra","mumbai");
        linkedHashMap.put("mp","bhopal");
        linkedHashMap.put("odisha","Bbsr");
        linkedHashMap.put("maharastra","mumbai"); 
        linkedHashMap.put("telengana","hyd");
        
        //System.out.println(linkedHashMap);
        
        Map<String, String> treeMap = new TreeMap<String, String>();
		
        treeMap.put("karnatak","BLR");
        treeMap.put("maharastra","mumbai");
        treeMap.put("mp","bhopal");
        treeMap.put("odisha","Bbsr");
        treeMap.put("maharastra","mumbai"); 
        treeMap.put("andhra","amaravati");
        treeMap.put("telengana","hyd");
        
       // System.out.println(treeMap);
        
        
        Set<Entry<String,String>> entryset = map.entrySet();
        
        Iterator<Entry<String,String>> itr = entryset.iterator();
        
        while(itr.hasNext()) {
        		
        		Entry<String,String> i =itr.next();
        		
        		System.out.println("This is store the key :"+i.getKey()+" and This is store the value : "+i.getValue());
        }
		

	}

}
