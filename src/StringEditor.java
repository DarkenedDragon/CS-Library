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
     * @return The input String without the removed section
     */
    public static String remove(String input, String toRemove){
        return input.substring(0, input.indexOf(toRemove)) +
                input.substring(input.indexOf(toRemove)+toRemove.length());
    }
    /**
     * Method for getting anynumber in front of the letters of the string
     *
     * @param input The string you wish to get the coefficent from 
     * @return The coefficent you wanted to find
     */
    public static int getCoefficient(String input){
        if(Character.isDigit(input.charAt(0))){
            String[] output = input.split("\\D");
            return output[0];
        }else{
            return 1;
        }
    }

}
