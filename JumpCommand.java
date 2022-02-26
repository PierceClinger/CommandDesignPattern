/**
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

    public void execute() {
        player.jump();    
    }
    
}
