import java.util.Random;
/**
 * child class of Password abstract class, implements Password methods for the specifics of the EasyPassword class.
 * @author BlaiseMoses01
 */
public class EasyPassword extends Password
{
    Random r = new Random();
    private int upperbound=101;
    private int randomNum=r.nextInt(upperbound);
    private String password;
    /**
     * creates an instance variable for the private password string and sets it to a passed in String, then appends a random number between 0-100, allowing for manipulation and 
     * modification of said instance variable.
     */
    public EasyPassword(String phrase)
    {
        this.password=phrase+randomNum;
    }
    /**
     * removes all spaces and adds a random number between 0 and 100 to the password instance variable, then returns the modified password.
     * @returns password instance variable sans space characters with a random number between 0 and 100 appended to the end.
     */
    public String getPassword()
    {
        String ret= "";
        for(int i=0;i < password.length();i++){
            if(this.password.charAt(i) != ' ')
                ret += this.password.charAt(i);
        }
        return ret;
        }
    }
