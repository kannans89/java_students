package day1;

public class SoundPlayer {

	public static void main(String[] args) {
		Song s2=new Song("Pollitik");
		s2.play();
		
		Song s3=new Song("Lalalalalala");
		s3.play();
		
	}

	public void playSound(String title) {
		System.out.println(title+"  Is Currently Playing");
	}
	
	public void stopSound(String title){
		System.out.println(title+" Song is Stopped now");
	}

}
