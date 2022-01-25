import java.util.HashMap;
/**
 * Child class of PasswordDecorator abstract class, used to replace specific characters
 *  in a passed in Password instance's password String with corresponding symbols.
 * @author BlaiseMoses01
 */
public class Symbols extends PasswordDecorator 
{
   
    private static final HashMap<Character,Character> cypher = new HashMap<>(){{
        put('a','@');
        put('b','8');
        put('e', '3');
        put('g','9');
        put('i','!');
        put('o','0');
        put('s','$');
        put('t','7');
      }};
    private Password passwordBeginning;
    /**
     * Creates an instance variable for PasswordBeginning and assigns it to a passed in 
     * Password instance to allow for manipulation and modification;
     */
    public Symbols(Password passwordBeginning)
    {
       this.passwordBeginning = passwordBeginning;
    }
   /**
    * creates and assigns a return String to passwordBeginning instance variable's .getPassword() return, then changes 
    *any occurence of the characters (a,b,e,g,i,o,s,t) to (@,8,3,9,!,0,$,7) respectively using a HashMap cypher.
    *@return String of passwordBeginning's .getPassword() method with the specific characters changed to the symbols indicated in the description.
    */
    public String getPassword()
    {
        String init = passwordBeginning.getPassword();
        String ret = "";
        for(int i=0;i<init.length();i++)
        {
            if(cypher.containsKey(init.charAt(i)))
                ret += cypher.get(init.charAt(i));
            else
                ret+= init.charAt(i);
        }
        return ret;
    }
}
/**
* referenced https://alvinalexander.com/java/how-to-populate-predefined-static-data-map-hashmap-in-java/ for syntax of how to populate
* a constant HashMap.
*/