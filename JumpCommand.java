/**
 * @author  Ryan Capron
 */

import java.util.concurrent.TimeUnit;
import java.io.*;

public class JumpCommand implements command {
    public void execute() {
        int line = 0;
        try {
            String currLine;
            BufferedReader html = new BufferedReader(new FileReader("./jump.txt"));
            while ((currLine = html.readLine()) != null) {
                if(line % 6 == 0) {
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
