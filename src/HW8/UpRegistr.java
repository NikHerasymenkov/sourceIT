package HW8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpRegistr {
	public static void main(String[] args) {
		String s = "When I was younger\r\n" + "I never needed\r\n";
		Pattern p = Pattern.compile("(\\b[a-zA-Z]\\B)");
		Matcher m = p.matcher(s);
		while (m.find()) {
			s = s.replaceFirst(p.toString(), m.group().toUpperCase());

		}
		System.out.println(s);
	}

}
