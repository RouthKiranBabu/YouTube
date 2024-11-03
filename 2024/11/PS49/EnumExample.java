enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}   
public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            default:
                System.out.println("Just a regular day.");
        }
    }// Start of the week!
}
