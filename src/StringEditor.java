/**
 * Class to help with String manipulations
 * @author Eli Jelesko
 * @version 1.0.0
 */
public class StringEditor {
    /**
     *
     * @param input
     * @param toRemove
     */
    public static String remove(String input, String toRemove){
        return input.substring(0, input.indexOf(toRemove)) +
                input.substring(input.indexOf(toRemove)+toRemove.length());
    }

}
