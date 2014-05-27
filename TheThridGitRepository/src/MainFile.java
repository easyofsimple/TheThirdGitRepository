
public class MainFile {
	public static void main(String [] args) {
		TheSecondFile theSecondFile = new TheSecondFile();
		theSecondFile.sendMessage();
		System.out.println("the main file");
		
		System.out.println("after pushing to server");
	}
}
