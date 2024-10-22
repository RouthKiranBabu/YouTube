package anonymousClasses;
public class Code3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello, World!");
			}
		});
		thread.start(); // Hello, World!
	} 
}
