
public class MainFile {
	public static void main(String [] args) {
		TheSecondFile theSecondFile = new TheSecondFile();
		theSecondFile.sendMessage();
		System.out.println("the main file");
		
		System.out.println("Hello the second branch is created, after pushing to server");
		System.out.println("-----------------------------------------------");
		System.out.println("print out the again, after the second branch is created");
	}
}
