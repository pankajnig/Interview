import java.util.ArrayList;
import java.util.Collections;

public class CompareComparable implements Comparable<CompareComparable>{
	public String name;
	public int idno;
	public CompareComparable(int id,String s){
		name = s;
		idno= id;
	}
	
	public static void dividestring() {
		String str = "Pineapple";
		System.out.println(str.split("e")[2]);
	}

		
			
		
	
		public static void main(String args[]) {
			/*CompareComparable cc = new CompareComparable(3,"Car");
			CompareComparable cc1 = new CompareComparable(1,"Banana");
			CompareComparable cc2 = new CompareComparable(2,"apple");
			ArrayList<CompareComparable> arr = new ArrayList<CompareComparable>();
			arr.add(cc);
			arr.add(cc1);
			arr.add(cc2);
			for(CompareComparable s : arr) {
			System.out.println(s.name);}
			Collections.sort(arr);
			for(CompareComparable s : arr) {
				System.out.println(s.name);}*/
			
			dividestring();
		}
		@Override
		public int compareTo(CompareComparable c) {
			System.out.println("inside compareTo");
			if(this.idno>c.idno) {
				return 1;
			}
			else if(this.idno<c.idno){
				return -1;
			}
			else {
				return 0;
			}
		}

}
