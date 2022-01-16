import java.util.Scanner;

public class Athlete {

    private int id;

    private int startHour;
    private int startMinute;
    private int startSecond;
    private int startTimeInSeconds;

    private int endHour;
    private int endMinute;
    private int endSecond;
    private int endTimeInSeconds;

    public int fullTimeInSeconds;

    private double speed;

    Scanner scanner = new Scanner(System.in);


    public Athlete(int startHour, int startMinute, int startSecond) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.startSecond = startSecond;
    }

    public void setEndTime() {
        System.out.print("Enter End Hour: ");
        endHour = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter End Minute: ");
        endMinute = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter End Second: ");
        endSecond = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        if (endHour >= 0 && endHour < 24 && endMinute >= 0 && endMinute < 60 && endSecond >= 0 && endSecond < 60) {

        } else {
            System.out.println("Please Enter Valid Time Values");
            setEndTime();
        }
    }

    public void calTime() {
        startTimeInSeconds = (startHour * 3600) + (startMinute * 60) + startSecond;
        endTimeInSeconds = (endHour * 3600) + (endMinute * 60) + endSecond;
        fullTimeInSeconds = endTimeInSeconds - startTimeInSeconds;

    }

    public void display() {
        calTime();
        calSpeed();

        System.out.println("");
        System.out.println("\tIdentification Number: " + id + "\n");
        System.out.println("\tStarting Time: " + startHour + " : " + startMinute + " : " + startSecond);
        System.out.println("\tEnding Time: " + endHour + " : " + endMinute + " : " + endSecond + "\n\n");
        System.out.println("\tThe Time Spent: \n\n");
        System.out.println("\t\tHours: " + (fullTimeInSeconds / 3600));
        System.out.println("\t\tMinutes: " + ((fullTimeInSeconds % 3600) / 60));
        System.out.println("\t\tSeconds: " + (fullTimeInSeconds % 60));
        System.out.println("\n");
        System.out.println("\tTotal Time Spent: " + fullTimeInSeconds + " seconds\n\n");
        System.out.println("\tSpeed: " + speed + " m/s \n\n");

    }

    private void calSpeed() {
        speed = (double) (100.00 / fullTimeInSeconds);
    }

    public void setId() {
        System.out.print("Enter Identification Number: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("");
    }

}