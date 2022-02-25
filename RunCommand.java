import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

/**
 * Command class that executes the run animation in the console
 * @author Hayden Boozer
 * 
 */
public class RunCommand implements command {
    private Player player;

    /**
     * Default Constructor: Sets the player to the current player
     * @param player The player that is passed in
     * 
     */
    public RunCommand(Player player) {
        this.player = player;
    }

    /**
     * Main method of the class that reads the txt file, and prints the necessary lines to perform the console animation
     * 
     */
    public void execute() {
        int line = 0;
        try {
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader("./run.txt"));
            while((currentLine = reader.readLine()) != null) {
                if (line % 3 == 0) {
                    sleep(4);
                    clear();
                } else {
                    line++;
                }
                System.out.println(reader.readLine());
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Sleeps the loop for a temporary time
     * @param num The amount of times that the sleep happens
     * 
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    /**
     * Clears the console.
     * 
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }

    
}
