import java.util.Random;
/**
 * Child class of PasswordDecorator abstract class used to randomly append a random character from set list of symbols after each character of a  
 * String of a passed inPassword instance's .getPassword() method, with a 30% chance of a symbol being appended for each character in the String.
 * @author BlaiseMoses01
 */
public class SpecialChars extends PasswordDecorator
{
   
    Random r = new Random();
    private static final char[] specialChars = {'*','!','%','+','.','{','}'};
    private static final int upperbound = 101;
    private Password passwordBeginning;
    /**
    * Creates an instance variable for PasswordBeginning and assigns it to a passed 
    * in Password instance to allow for manipulation and modification;
    */
    public SpecialChars(Password passwordBeginning)
    {
        this.passwordBeginning= passwordBeginning;
    }
    /**
     * creates and assigns a return String to passwordBeginning instance variable's .getPassword() return, 
     * then randomly appends symbols (*,!,%,+,.,{,}) after each character in the String at a 30% chance of appenditure after each character.
     * @returns String of passwordBeginning's .getPassword() method with symbols (*,!,%,+,.,{,}) randomly appended 30% of the time between each character.
     */
    public String getPassword()
    {
        String init=passwordBeginning.getPassword();
        String ret= "";
        for(int i=0;i<init.length();i++)
        {
            int coin = r.nextInt(upperbound);
            if(coin<30)
            {
                ret += (init.charAt(i));
                ret += specialChars[r.nextInt(specialChars.length)];
            }
            else
                ret += init.charAt(i);
        }
        return ret;
    }
}