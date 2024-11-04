public class GradingSystem {
    public static void main(String[] args) {
        double Prelim = 85;
        double Midterm = 75;
        double Final = 87;
        
        double Results = (Prelim + Midterm + Final) / 3;
        
        int category = 0;

        if (Results <= 100 && Results >= 96) {
            category = 1;
        } else if (Results <= 95 && Results >= 90) {
            category = 2;
        } else if (Results <= 89 && Results >= 84) {
            category = 3;
        } else if (Results <= 83 && Results >= 78) {
            category = 4;
        } else if (Results <= 77 && Results >= 75) {
            category = 5;
        } else if (Results <= 74 && Results >= 72) {
            category = 6;
        } else if (Results <= 71 && Results >= 0) {
            category = 7;
        }
        
        switch (category) {
            case 1:
                System.out.println("Excellent");
                break;
            case 2:
                System.out.println("Very Good");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Satisfied");
                break;
            case 5:
                System.out.println("Passing");
                break;
            case 6:
                System.out.println("Failed");
                break;
            case 7:
                System.out.println("Conditionally Failure");
                break;
            default:
                System.out.println("Invalid Score");
                break;
        }
    }
}
