import java.util.Random;
/**
 * Child class of PasswordDecorator abstract class used to modify the casing of a passed 
 * in Password instance's .getPassword() method.
 * @author BlaiseMoses01
 */
public class RandomCasing extends PasswordDecorator
{
   
    Random r = new Random();
    private Password passwordBeginning;
    private int upperbound = 101;
    int coin=r.nextInt(upperbound);
   /**
    * Creates an instance variable for PasswordBeginning and assigns it to a passed 
    * in Password instance to allow for manipulation and modification;
    */
    public RandomCasing(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }
    /**
     * creates and assigns a return String to passwordBeginning instance variable's .getPassword() return, 
     * then changes the casing of each alphabetical character in the String to upper or lower case randomly with a 50/50 ratio.
     * @returns String of passwordBeginning's .getPassword() method with casing of alphabetical characters randomized between upper and lower
     * case. 
     */
    public String getPassword()
    {
        String init=passwordBeginning.getPassword();
        String ret= "";
        for(int i=0;i<init.length();i++){
            int coin=r.nextInt(upperbound);
            if(coin > 50)
                init = init.toLowerCase();
            else
                init = init.toUpperCase();
            ret += init.charAt(i);
        }
        return ret;
    }
}