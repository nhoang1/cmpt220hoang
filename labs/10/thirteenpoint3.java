//package Lab10;
import java.util.ArrayList;

public class thirteenpoint3 {

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(7);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(9);

		System.out.println(list.toString());
		sort(list);
		System.out.println(list.toString());
	}

	private static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).doubleValue() < list.get(i).doubleValue()) { 		//compare the double value not the Number value
					Number temp = list.get(i); 		
					list.set(i, list.get(j));	//swap 'em
					list.set(j, temp);
				}
			}
		}
		
	}

}
