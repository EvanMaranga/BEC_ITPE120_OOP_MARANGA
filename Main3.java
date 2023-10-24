public class Main3 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("It's the start of the workweek.");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a regular workday.");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Time to relax.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}