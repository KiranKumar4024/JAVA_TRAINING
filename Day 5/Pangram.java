import java.util.*;
public class Pangram {
	public static <thing> void print(thing... t) {
		for(thing i:t) {
			System.out.println(i);
		}
	}
	public static boolean verifier(String s) {
		boolean flag=true;
		char[] ks=s.toLowerCase().toCharArray();
		int[] arr=new int[26];
		for(int i=0;i<26;i++) {
			arr[i]=0;
		}
		for(char i:ks) {
			arr[(int)i-97]++;
		}
		for(int i:arr) {
			if(i==0) {
				return false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		print("Enter a string:");
		s=sc.nextLine();
		s=s.replaceAll("\\s", "");
		print(s);
		if(verifier(s)) {
			print("its pangram");
		}
		else {
			print("not pangram");
		}
		sc.close();
	}
}
