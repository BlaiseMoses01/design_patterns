
/**
 * Abstract class to extend the Password class and serve as a skeleton structure for decorator child classes.
 * @author BlaiseMoses01
 */
public abstract class PasswordDecorator extends Password
{
    Password passwordBeginning;
    public abstract String getPassword();
}