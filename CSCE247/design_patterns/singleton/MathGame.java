import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * class for a math problem solving game. Executes the game, keeps score of games won, and calculates correct answers for the
 * problems presented to the user
 * @author BlaiseMoses01
 */
public class MathGame{
  private int score;
  private static final String[] OPERANDS = {"+","-","/","*"};
  Random rand = new Random();
  Scanner reader = new Scanner(System.in);
  DecimalFormat df = new DecimalFormat("0.#");
/**
 * initializes some of the utilities needed by other methods such and the java.util Random and Scanner functions, as well as 
 * creates an instance variable to allow for data manipulation of the score as the game progresses.
 */
  public MathGame(){
    Random rand = new Random();
    Scanner reader = new Scanner(System.in);
    System.out.println("Let's have fun with Math!");
    this.score=0;
}
/**
 * creates and returns an instance of MathGame class
 * @return an instance of MathGame class
 */
public static MathGame getInstance(){
    MathGame mathGame=new MathGame();
    return mathGame;
}
/**
 * prompts the user to see if they wish to play or not, as well as terminates the game when the users indicates
 * to do so.
 */
public void play(){
    String token= " ";
    while(token.equalsIgnoreCase("q")==false){
        System.out.print("(P)lay or (Q)uit: ");
        token=reader.next();
        if(token.equalsIgnoreCase("p"))
            playRound();
        else if (token.equalsIgnoreCase("q") == false)
             System.out.println("Sorry, you must enter p or q");
    }
    System.out.println("You won "+score+" Games\nGoodbye");
    System.exit(0);
}
/**
 * handles the functionality of the game itself, prints the question to the user and takes in their answer, compares 
 * it to the correct solution , and returns true if they were correct and false if they were incorrect.
 * @return a boolean value corresponding to the accuracy of the user's solution to the given problem
 */
public boolean playRound(){
    double rand1= rand.nextInt(101);
    double rand2= rand.nextInt(101);
    String operand = OPERANDS[rand.nextInt(OPERANDS.length-1)];
    System.out.print("\nRound answer to 1 decimal place\n"+df.format(rand1)+" "+operand+" "+ df.format(rand2)+" : ");
    double response=reader.nextDouble();  
    double answer=calculate(rand1, rand2, operand);
    if( df.format(response).equals(df.format(answer))){
        System.out.println("You got it!");
        score++;
        return true;
    }
    else{
        System.out.println("The correct answer is: "+df.format(answer));
        return false;
    }
}
/**
 * A helper method for the playRound() class, takes in the two random numbers and operand the aformentioned class 
 * generates, and uses them to calculate the correct answer to the problem the game is presenting to the user.
 * @return returns the correct answer to the problem the playRound() method is executing to allow for comparison to the user's answer.
 */
public double calculate(double num1, double num2, String operand){
    double answer=0;
    if(operand == "+")
       answer = num1+num2;
    else if(operand == "-")
       answer = num1-num2;
    else if(operand == "/")
       answer = num1/num2;
    else 
       answer = num1*num2;
       return answer;
}
}

/* https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html used this site to refresh my
memory on decimalFormat import I used to format the responses
*/