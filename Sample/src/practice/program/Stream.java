package practice.program;

import java.util.Arrays;
import java.util.List;

public class Stream {
	
	public static void main(String[] args) {
		
		String fd = "What are you doing";

String [] ar = new String[fd.length()];
		for(int i=0;i<fd.length();i++) {
			String ju = "";
			ju = ju+ fd.charAt(i);
			ar[i]= ju;
		}
		List<String> li= Arrays.asList(ar);
		String vw = "aeiou";
		li.stream().filter(s -> s.equals("a"||"e"||"i"||"o"||"u")).forEach(System.out.println(s));
	}

}
