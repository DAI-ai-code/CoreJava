package Assignment2;

public class Remote {
	public static void buttonPress() {
		if(Curtain.getCurtainState()) {
			Curtain.closeCurtain();
		    System.out.println("Closing curtains");
		}else {
			Curtain.openCurtain();
			System.out.println("Opening curtains");
		}
	}
	
}
