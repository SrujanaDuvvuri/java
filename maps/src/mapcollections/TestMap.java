package mapcollections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		TreeMap<String, String> callingCodes = new TreeMap<>();

		callingCodes.put("IND", "091");
		callingCodes.put("USA", "001");
		callingCodes.put("UK", "044");
		callingCodes.put("CAN", "001");
		
		Set<Entry<String, String>> entries = callingCodes.entrySet();
		
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() +  " : " + entry.getValue());
		}
//
//		System.out.println(callingCodes.size());
//
//		System.out.println(callingCodes.containsKey("IND"));
//		System.out.println(callingCodes.containsValue("IND"));
//
//		System.out.println(callingCodes.get("UK"));
//		System.out.println(callingCodes.put("CAN", "001"));
//		System.out.println(callingCodes);
//		System.out.println(callingCodes.remove("UK"));
//		System.out.println(callingCodes);
//
//		Set<String> names = callingCodes.keySet();
//		for (String string : names) {
//			System.out.println(string);
//		}

//		Collection<String> codes = callingCodes.values();
//		System.out.println(codes);

//		Set<Entry<String, String>> entries = callingCodes.entrySet();

//		for (Entry<String, String> entry : entries) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}

//		HashMap<String, ArrayList<String>> b = new HashMap<>();
//		
//		ArrayList<String> hyd = new ArrayList<String>();
//			hyd.add("AMPT");
//			hyd.add("MTN");
//			hyd.add("AVN");
//			
//		b.put("HYD", hyd);
//		
//		ArrayList<String> mum = new ArrayList<String>();
//			mum.add("CG");
//			mum.add("Bandra");
//			mum.add("Thane");
//		
//		b.put("MUM", mum);
//		
//		ArrayList<String> vizag = new ArrayList<String>();
//			vizag.add("BR");
//			vizag.add("JDMC");
//			vizag.add("LKPM");
//		b.put("VIZAG", vizag);
//
//		System.out.println(b);
	}

}
