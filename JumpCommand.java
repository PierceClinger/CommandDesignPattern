/**
 * @author  Ryan Capron
 */

/**
 * TimeUnit library is used to allow sleep method
 * IO library is used to read jump text file
*/
import java.util.concurrent.TimeUnit;
import java.io.*;

public class JumpCommand implements Command {
    /**
     * Class constructor
     * @param player constructer parent class
    */
    public void execute() {
        // Keeps track of current line in text file
        int line = 0;

        try {
            // Opens a bufferedReader for jump.txt
            BufferedReader html = new BufferedReader(new FileReader("./jump.txt"));
            
            String currLine;
            while ((currLine = html.readLine()) != null) {
                // Sleeps and clears console every 3 lines
                if(line % 3 == 0) {
                    sleep(5);
                    clear();
                }
                line++;
                System.out.println(currLine);
            }
            html.close();        
        } catch (Exception e) {
            System.out.println(e);
        }    
    }

    /**
     * Sleeps for $num milliseconds
     * @param num is number of milliseconds to sleep
    */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    /**
     * Clear's the console to allow for next command to be read through
    */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
    
}
