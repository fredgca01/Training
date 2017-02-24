package language;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * http://tutorials.jenkov.com/java-regex/syntax.html
 * @author frederic.garcia
 *
 */
public class RegexpTraining {
	
	public void testMatcher() {
		String text    =
		        "This is the text to be searched for occurrences of the http:// pattern.";
		//matches all texts which contains one or more characters (.*) followed by the text http:// followed by one or more characters (.*)
		String pattern1 = ".*http://.*";

		boolean matches = Pattern.matches(pattern1, text);

		System.out.println("matches = " + matches);
		
		
		text = "This is the text which is to be searched for occurrences of the word 'is'.";

		String patternString = "is";

		Pattern pattern2 = Pattern.compile(patternString);
		Matcher matcher = pattern2.matcher(text);

		int count = 0;
		while(matcher.find()) {
		    count++;
		    System.out.println("found: " + count + " : "
		            + matcher.start() + " - " + matcher.end());
		}
		
		text = "A sep Text sep With sep Many sep Separators";
        
        patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);
        
        String[] split = pattern.split(text);
        
        System.out.println("split.length = " + split.length);
        
        for(String element : split){
            System.out.println("element = " + element);
        }
	}
	
	

	public void testGroup() {
		String text    =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything."
              ;

		String patternString1 = "((John) (.+?)) ";

		Pattern pattern = Pattern.compile(patternString1);
		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println("found: <"  + matcher.group(1) +
                             "> <"       + matcher.group(2) +
                             "> <"       + matcher.group(3) + ">");
		}
	}
	
	public void testReplace() {
		String text    =
                "John writes about this, and John Doe writes about that," +
                        " and John Wayne writes about everything."
              ;

	      String patternString1 = "((John) (.+?)) ";
	
	      Pattern pattern = Pattern.compile(patternString1);
	      Matcher matcher = pattern.matcher(text);
	
	      String replaceAll = matcher.replaceAll("Joe Blocks ");
	      System.out.println("replaceAll   = " + replaceAll);
	
	      String replaceFirst = matcher.replaceFirst("Joe Blocks ");
	      System.out.println("replaceFirst = " + replaceFirst);
	}
}
