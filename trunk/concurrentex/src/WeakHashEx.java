import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;


public class WeakHashEx {
	public static void main(String[] args) {
		String s2 = new String("kamal2");
		
		String s1 = new String("kamal1");
	/*	WeakReference<String> str = new WeakReference<String>(s1);
		System.out.println(str+"jjjjj");
		s1 = null;
		System.gc();
		System.out.println(s1+"jjjjj");*/
		
		Map<String,String> map = new WeakHashMap<String,String>();
		map.put(s1, "new1");
		map.put(s2, "new2");
		
		for(Map.Entry<String,String> entryset : map.entrySet()) {
			System.out.println(entryset.getKey()+ "+++++="+ entryset.getValue());
		}
		
		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
		
	/*	s1 = null;
		s2 = null;
		
		System.gc();
		
		for(Map.Entry<String,String> entryset : map.entrySet()) {
			System.out.println(entryset.getKey()+ "+++++="+ entryset.getValue());
		}
		
		System.out.println(map.get(s1));
		System.out.println(map.get(s2));*/
		
	}

}
