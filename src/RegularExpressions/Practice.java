package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) {

        //ex1
        String firstEx = "Word cAT DATA A site Java tExt";
//      Pattern firstPattern = Pattern.compile("(\\p{Ll}{1}\\p{Lu}{2})|(\\p{Ll}{4})|(\\p{Ll}{1}\\p{Lu}{1}\\p{Ll}{2})");
        Pattern firstPattern = Pattern.compile("(\\b[a-z]\\w+)");
        Matcher firstMatcher = firstPattern.matcher("Word cAT DATA A site Java tExt");
        System.out.println();
        System.out.println(firstMatcher.replaceAll(" ").replaceAll("\\s* "," "));

        //ex2
        String secondEx = "2057";//2013 - 5043
        Pattern secondPattern = Pattern.compile("(^[2][0][1-9][3-9])|(^[3-4][0-9][0-9][0-9])|(^[5][0][0-4][0-3]|^[2][1-9][0-9][0-9])");
        Matcher secondMatcher = secondPattern.matcher("2200");
        System.out.println(secondMatcher.replaceAll("This is a valid number"));

        //ex3
        String thirdEx = "         Removing     Extra  Spaces         Between Words       in the              text   ";
        Pattern thirdPattern = Pattern.compile("\\s* ");
        Matcher thirdMatcher = thirdPattern.matcher(thirdEx);
        System.out.println(thirdMatcher.replaceAll(" ").trim());

        //ex4
        String fourthEx = "2018/10/09"; //DD/MM/YYYY;
        Pattern fourthPattern = Pattern.compile("^\\d{2}\\/\\d{2}\\/\\d{4}");
        Matcher fourthMatcher = fourthPattern.matcher("14/12/2018");
        System.out.println(fourthMatcher.find());

        //ex5
        String fifthEx = "Regular regular popular expressions entered popular use from 1968 1968 1968";
        Pattern fifthPattern = Pattern.compile("(\\b[r]\\w+.)");
        Matcher fifthMatcher = fifthPattern.matcher(fifthEx);
        System.out.println(fifthMatcher.replaceAll("*").replaceAll("  "," "));

        //ex6
        String sixthEx = "11122333";
//        Pattern sixthPattern = Pattern.compile("(\\d{2}(?!\\d))");
        Pattern sixthPattern = Pattern.compile("");
        Matcher sixthMatcher = sixthPattern.matcher(sixthEx);
        System.out.println(sixthMatcher.replaceAll("*"));

        //ex7
        String seventhEx = "password wword word Heeeeeeello";
        Pattern seventhPattern = Pattern.compile("^$");
        Matcher seventhMatcher = seventhPattern.matcher(seventhEx);
        System.out.println(seventhMatcher.replaceAll("*"));









    }
}
