package sia.knights;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println("Fight the knight is so brave!");
	}
	
	public void singAfterQuest() {
		stream.println("i did embark on a quest");
	}
}
