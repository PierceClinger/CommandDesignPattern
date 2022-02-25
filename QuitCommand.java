/**
 * Command class that quits the execution of the program
 * @author Danielle Higgins
 */
public class QuitCommand implements command {
    private Player player;

    public QuitCommand(Player player) {
        this.player = player;
    }

    public void execute() {
        System.exit(0);
    }
}