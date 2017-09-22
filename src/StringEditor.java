/**
 * Class to help with String manipulations
 * @author Eli Jelesko
 * @version 1.0.0
 */
public class StringEditor {
    /**
     * Method to remove a section of a string from an existing string
     * @param input The string a segment is to be removed from
     * @param toRemove The segment to remove
     */
    public static String remove(String input, String toRemove){
        return input.substring(0, input.indexOf(toRemove)) +
                input.substring(input.indexOf(toRemove)+toRemove.length());
    }

}
