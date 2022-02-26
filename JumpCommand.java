/**
 * Command class that executes the jump command to be run by the console
 * @author  Ryan Capron
 */

public class JumpCommand implements command {
    private Player player;

    /**
     * Class constructor
     * @param player constructer parent class
    */
    public JumpCommand(Player player) {
        this.player = player;
    }

    /**
     * Calls the jump command from the player class
     */
    public void execute() {
        player.jump();    
    }
    
}
