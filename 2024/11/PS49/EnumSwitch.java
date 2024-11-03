public class EnumSwitch {
    enum LightColor {
        RED, YELLOW, GREEN
    }

    public void displayAction(LightColor color) {
        switch (color) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Caution");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }
    public static void main(String[] args) {
        EnumSwitch system = new EnumSwitch();
        system.displayAction(LightColor.RED);
        system.displayAction(LightColor.GREEN);
    }
}
// Stop
// Go