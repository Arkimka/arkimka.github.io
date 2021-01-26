import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException 
    {

        System.out.println("Please input the expression alse arguments and sign must be separated by a space.");

        try (Scanner sc = new Scanner(System.in)) 
        {
            String result = new Calculator().calc(sc.nextLine().trim().split(" "));
            System.out.println(result);
        } 
        catch (Exception e) 
        {
            System.out.println("ERROR,the incorrect data.");
        }
    }
}


