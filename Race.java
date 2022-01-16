import java.util.Scanner;

public class Race {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Athlete[] athlete = new Athlete[3];

        System.out.print("Enter Start Hour: ");
        int startHour = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Start Minute: ");
        int startMinute = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Start Second: ");
        int startSecond = Integer.parseInt(scanner.nextLine());
        System.out.println("");

        if (startHour >= 0 && startHour < 24 && startMinute >= 0 && startMinute < 60 && startSecond >= 0 && startSecond < 60) {

        } else {
            System.out.println("Please Enter Valid Time Values");
            main(null);
        }

        for (int i = 0; i < athlete.length; i++) {
            athlete[i] = new Athlete(startHour, startMinute, startSecond);
            athlete[i].setId();
            athlete[i].setEndTime();

        }

        for (int i = 0; i < athlete.length; i++) {
            System.out.println("DETAILS OF ATHLETE " + (i + 1));
            System.out.println("\n---------------------------------\n ");
            athlete[i].display();

        }

        findWinner(athlete[0], athlete[1], athlete[2]);

    }

    private static void findWinner(Athlete a, Athlete b, Athlete c) {
        int minTime = a.fullTimeInSeconds;

        if (minTime > b.fullTimeInSeconds || minTime > c.fullTimeInSeconds) {
            minTime = b.fullTimeInSeconds;


            if (minTime > c.fullTimeInSeconds) {
                minTime = c.fullTimeInSeconds;
                System.out.println("Winner: Athlete 3\n");
            } else {
                System.out.println("Winner: Athlete 2\n");
            }
        }
        if (minTime < b.fullTimeInSeconds && minTime < b.fullTimeInSeconds) {
            System.out.println("Winner: Athlete 1\n");
        }


    }
}