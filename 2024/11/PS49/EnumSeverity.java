enum SeverityLevel {
    LOW(1), MEDIUM(2), HIGH(3), CRITICAL(4);
    
    private int levelCode;

    SeverityLevel(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }
}

public class EnumSeverity{
    public static void main(String[] args) {
        for (SeverityLevel level : SeverityLevel.values()) {
            System.out.println("Severity Level: " + level + " - Code: " + level.getLevelCode());
        }
    }
}
// Severity Level: LOW - Code: 1
// Severity Level: MEDIUM - Code: 2
// Severity Level: HIGH - Code: 3
// Severity Level: CRITICAL - Code: 4