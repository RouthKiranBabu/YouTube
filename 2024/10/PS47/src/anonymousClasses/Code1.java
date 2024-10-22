package anonymousClasses;
interface Animal{
	void sound();
}
public class Code1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal() {
			@Override
			public void sound() {
				System.out.println("Dog barks");
			}
		};
		dog.sound(); // Dog barks
	}

}
