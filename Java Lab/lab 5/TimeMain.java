class Time {
    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void addTime(Time t) {
        this.hour += t.hour;
        this.minute += t.minute;

        if (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }
    }
}

public class TimeMain {
    public static void main(String[] args) {
        Time time1 = new Time(3, 30);
        Time time2 = new Time(2, 45);

        time1.addTime(time2);

        System.out.println("Total time: " + time1.hour + " hours and " + time1.minute + " minutes");
    }
}
