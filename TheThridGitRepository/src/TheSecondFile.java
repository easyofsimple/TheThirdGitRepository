
public class TheSecondFile {
	
	public void sendMessage() {
		String message[] = {"Git", "message", "and","more", "message"};
		System.out.println("the second file");
		System.out.println("sending message");
		for (String data: message) {
			System.out.println("message: " + data);
		}
//		for (int i=0;i<message.length;i++) {
//			System.out.println("message: " + message[i]);
//		}
	}
}
