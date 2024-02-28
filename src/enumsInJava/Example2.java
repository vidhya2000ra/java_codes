package enumsInJava;

enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class Example2 {
    Day day;
    public Example2(Day day){
        this.day=day;
    }
    public void tellItLikeItIs(){
        switch (day){
            case MONDAY :
                System.out.println("Mondays are Good");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekend are best");
                break;
            default:
                System.out.println("Midweek days are so-so");
                break;
        }
    }
    public static void main(String[]args){
        Example2 firstDay = new Example2(Day.MONDAY);
        firstDay.tellItLikeItIs();
        Example2 secondDay = new Example2(Day.TUESDAY);
        secondDay.tellItLikeItIs();
        Example2 thirdDay = new Example2(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        Example2 fifthDay = new Example2(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        Example2 sixthDay = new Example2(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        Example2 seventhDay = new Example2(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
