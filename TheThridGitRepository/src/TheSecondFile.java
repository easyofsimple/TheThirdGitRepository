
public class TheSecondFile {
	
	public void sendMessage() {
		String message[] = {"Git", "message"};
		System.out.println("the second file");
		System.out.println("sending message");
		for (int i=0;i<message.length;i++) {
			System.out.println("message: " + message[i]);
		}
	}
}
