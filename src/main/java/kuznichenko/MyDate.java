package kuznichenko;



public class MyDate {

    Month month;
    int day;
    DayOfWeek dayOfWeek;


    public static void main(String[] args) {
        MyDate firstDate = new MyDate(Month.December, 01);
        MyDate newYear = new MyDate(Month.December, 31, DayOfWeek.Monday);
        MyDate today = new MyDate(Month.February, 07, DayOfWeek.Sunday);

    }


    MyDate(Month month, int day){
        this.month = month;
        this.day = day;
        System.out.println(month + " " + day);

    }

    MyDate(Month month, int day, DayOfWeek dayOfWeek){
        this.dayOfWeek = dayOfWeek;
        System.out.println(month + " " + day + " " + dayOfWeek);
    }

    public static enum Month {

        January(1),
        February(2),
        March(3),
        April(4),
        May(5),
        June(6),
        July(7),
        August(8),
        September(9),
        October(10),
        November(11),
        December(12);

        private int value;

        Month(int value) {
            this.value = value;
        }




    }

    public static enum  DayOfWeek{
        Monday(1),
        Tuesday(2),
        Wednesday(3),
        Thursady(4),
        Friday(5),
        Saturday(6),
        Sunday(7);

        private int day;

        DayOfWeek (int day){
            this.day = day;
        }


    }

}
