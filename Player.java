
public class Player {
	public Player() {
		
	}

public void jump() {
	command jC = new JumpCommand(this);
	jC.execute();
}
public void fire() {
	command fC = new FireCommand(this);
	fC.execute();
}
public void runForward() {
	command rC = new RunCommand(this);
	rC.execute();
}
}
