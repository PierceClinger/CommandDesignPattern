import java.util.HashMap;

public class InputHandler {
    private HashMap<String, command> commands = new HashMap<String, command>();
    private Player player;

    public InputHandler(Player player) {
        this.player = player;
        commands.put("jump", JumpCommand);
        commands.put("run", RunCommand);
        commands.put("fire", FireCommand);
        commands.put("quit", QuitCommand);
    }

    public void buttonPressed(String button) {
        commands.get(button).run();
    }
}
