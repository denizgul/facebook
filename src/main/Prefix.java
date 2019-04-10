

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prefix {

	public static void main(String[] args) {
		String[] array = new String[] {"zebra", "dog", "duck", "dove"};
		String[] array2 = new String[] {"bearcat", "bert"};
		
		System.out.println(prefix(Arrays.asList(array2)));
	}
	
	public static ArrayList<String> prefix(List<String> a) {
		
		ArrayList<String> list = new ArrayList<>();
		int index=0;
		for(String x:a) {
			index=0;
			for (int i=0;i<a.size();i++) {
				String y = a.get(i);
				if(!x.equalsIgnoreCase(y) && y.startsWith(x.substring(0,index))) {
					index++;
					i=i-1;
				}
			}
			list.add(x.substring(0, index));
			
		}
		return list;
	}

}
