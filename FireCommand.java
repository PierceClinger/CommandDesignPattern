/**
 * @author  Ryan Capron
*/

public class FireCommand implements command {
    private Player player;

    /**
     * Class constructor
     * @param player constructer parent class
    */
    public FireCommand(Player player) {
        this.player = player;
    }

    public void execute() {
<<<<<<< HEAD
        // Keeps track of current line in text file
        int line = 0;

        try {
            // Opens a bufferedReader for fire.txt
            BufferedReader html = new BufferedReader(new FileReader("./fire.txt"));
            
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
=======
        player.fire();    
>>>>>>> cdd3825365871ea212a4fc79133281f3dbdb7ac2
    }
    
}
