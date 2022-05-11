package ua.lviv.iot.labs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveText {
    public static void main (String[] args) {

        String inputString = "Out commonly use prepositions to show a relationship in space or time or a logical "+
                "relationship between two or more people, places or things. " +
                "Prepositions are most commonly followed by a noun phrase or pronoun (underlined):" +
                "The last time I saw him he was walking down the road. The most useful preposition are: " +
                "or, on, in, out and others.";
        String regularExpression = "\\b(T|t)he(\\b|\\W) |\\b(A|a)n(\\b|\\W) |\\b(A|a)(\\b|\\W) " +
                "|\\b(O|o)r(\\b|\\W) |\\b(I|i)n(\\b|\\W) |\\b(O|o)n(\\b|\\W) |\\b(O|o)ut(\\b|\\W) |\\b(A|a)re(\\b|\\W)";
        String replacement = "";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher match = pattern.matcher(inputString);

        System.out.println("InputText:");
        System.out.println(inputString);

        inputString = match.replaceAll(replacement);
        System.out.println("ChangedText:");
        System.out.println(inputString);
    }
}
