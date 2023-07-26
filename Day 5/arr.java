ackage samplePackage;
import java.util.*;
class arr{
	public <thing> thing[] arraycreation(thing... t){
		thing list[];
		for (int i=0;i<t.length;i++) {
			list[i]=t[i];
			//System.out.println(t[i]);
		}
		return list;
	}
}
public class Prime {
	public static void main(String[] args) {
		arr n=new arr("ki","ran",9,67787);
	}

}
