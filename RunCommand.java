import java.util.concurrent.TimeUnit;
import java.io.*;

public class RunCommand implements Command {
    RunCommand(Player player) {
        this.player = player;
    }

    public void execute() {
        int line = 0;
        try {
            String currentLine;
            BufferedReader reader = new BufferedReader(new FileReader("./run.txt"));
            while(reader.readLine() != null) {
                if (line % 3 == 0) {
                    sleep(4);
                    clear();
                } else {
                    line++;
                }
                System.out.println(reader.readLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    private void clear() {
        System.out.print("\033[H\033[2J");
    }

    
}
