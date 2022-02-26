/**
 * Command class that executes the fire command to be run in the console
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

    /**
     * Calls the execute method from the player class
     * 
     */
    public void execute() {
        player.fire();    
    }
    
}
