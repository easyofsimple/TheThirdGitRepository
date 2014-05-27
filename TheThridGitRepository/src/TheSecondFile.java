
public class TheSecondFile {
	// the mail program. 
	public void sendMessage() {
		String message[] = {"Git", "message", "and","more", "message"};
		System.out.println("the second file");
		System.out.println("sending message");
		for (int i=0;i<message.length;i++) {
			System.out.println("print index i: " + i);
			System.out.println("message: " + message[i]);
		}
		
		
	}
}
