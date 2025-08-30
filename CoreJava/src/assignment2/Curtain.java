package assignment2;

public class Curtain {
	private static boolean isOpen;
	public Curtain() {
		isOpen = false;
	}
	
	public static boolean getCurtainState() {
		if(isOpen) {
			System.out.println("Curtains are open!");
		}else {
			System.out.println("Curtains are closed!");
		}
		return isOpen;
	}
	public static void openCurtain() {
		isOpen = true;
	}
	
	public static void closeCurtain() {
		isOpen = false;
	}
}
