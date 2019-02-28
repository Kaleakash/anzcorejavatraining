package com;

import java.util.HashMap;
import java.util.Set;

public class Operation {
		HashMap hm = new HashMap();
		
		public void addInfo(String key,String value) {		//a, abc , a, xyz 
			if(!hm.containsKey(key)) {
					hm.put(key, value);
					System.out.println("Record inserted ");
			}else {
				System.out.println("Plz provice unique key");
			}
		}
		
		public Object getInfoValue(String key) {
			return hm.get(key);
		}
		
		public void displayInfo() {
						Set ss = hm.keySet();			// converting map to set 
						for(Object obj:ss) {
							System.out.println(obj);
						}
		}
}
