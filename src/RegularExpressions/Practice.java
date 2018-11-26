package RegularExpressions;

import java.util.regex.Pattern;

public class Practice {

    public static void main(String[] args) {

//        String firstPattern = "(\\p{Ll}\\p{Lu}\\w+)";
//        Pattern patternFirst = Pattern.compile(firstPattern);
//        Matcher firstMatcher = patternFirst.matcher(firstEx);
//        System.out.println(firstMatcher.find());
//
//
//        String thirdEx = "  Removing        Extra Spaces       Between Words in  the             text  ";
//
//
//        Pattern pattern = Pattern.compile(firstEx);
//        Matcher matcher = pattern.matcher(firstEx);
//        System.out.println(matcher.find());
//

        String firstEx = "Word cAT DATA A site Java tExt";
        System.out.println(firstEx);
        System.out.println(firstEx.replaceAll("\\p{Ll}\\p{Lu}\\w+","").replaceAll("\\p{Ll}\\p{Ll}\\p{Ll}\\p{Ll}",""));

        String secondEx = "2450";
        System.out.println(secondEx);

        String thirdEx = "  Removing        Extra Spaces       Between Words in  the             text  ";
        System.out.println(thirdEx.replaceAll("[\\s]+"," ").trim());
        Pattern pattern = Pattern.compile("[\\s]+");
        System.out.println(pattern.matcher(thirdEx).replaceAll(" ").trim());


        String fifthEx = "Regular regular popular expressions entered popular use from 1968 1968 1968";
        System.out.println(fifthEx);
        Pattern pattern5 = Pattern.compile("");
        System.out.println(pattern5.matcher(fifthEx));
    }
}
