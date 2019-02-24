package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFromPattern {
	public static void main(String[] args) {
		String myString = "<tagname>This is the string.</tagname>"
				+ "<tagname>This is another string.</tagname>";
		Pattern p = Pattern.compile("<tagname>(.*?)</tagname>");
		Matcher m = p.matcher(myString);
		
		while(m.find()) {
			System.out.println(m.group(1));
		}
	}
}
