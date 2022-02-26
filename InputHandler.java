import java.util.HashMap;

public class InputHandler {
    private HashMap<String, command> commands = new HashMap<String, command>();

    public InputHandler(Player player) {
        JumpCommand jumpcommand = new JumpCommand(player);
        RunCommand runcommand = new RunCommand(player);
        FireCommand firecommand = new FireCommand(player);
        QuitCommand quitcommand = new QuitCommand(player);
        commands.put("jump", jumpcommand);
        commands.put("run", runcommand);
        commands.put("fire", firecommand);
        commands.put("quit", quitcommand);
    }

    public void buttonPressed(String button) {
        commands.get(button).execute();
    }
}
