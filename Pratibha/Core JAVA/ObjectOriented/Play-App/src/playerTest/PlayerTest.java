package playerTest;

import java.io.PrintStream;

import player.*;

public class PlayerTest {
	public static void main(String[] args) {
		PrintStream out = new PrintStream(System.out) {
			public void println(Player p) {
				super.println(p.getName());
				super.println(p.getAge());
				super.println(p.getId());
			}
		};
		System.setOut(out);
		Player p1 = new Player("Sachine", 45, 1);
		Player p2 = new Player("Virat", 29, 2);
		Player p3 = new Player("Sachine", 45, 1);
		Player elderPlayer = p2.whoIsElder(p1);
		PlayerTest.printInfo(elderPlayer);
	}

	public static void printInfo(Player p) {
		System.out.println("Elder player=" + p.getName());
	}

}
