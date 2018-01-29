package dogDoor;

import java.util.Timer;
import java.util.TimerTask;

public class BarkRecongnizer {
	private DogDoor door;

	public BarkRecongnizer(DogDoor door) {
		this.door = door;
	}

	public void recongnizer(String bark) {
		System.out.println("Barkrecongnizer: Heard a '" + bark + "'");
		door.open();
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				door.close();
				timer.cancel();
			}
		}, 5000);

	}
}
