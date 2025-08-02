public class TestTimeModern {
    public static void main(String[] args) {
        TimeModern t = new TimeModern(23, 59, 59);
        System.out.println("Start time: "+t);

        //Test nextSecond()
        TimeModern t2 = t.nextSecond();
        System.out.println("After 1 second: "+t2);

        //Test chaing
        TimeModern t3 = t2.nextSecond().nextSecond();

        //Getter
        System.out.println("Horu: "+t3.getHour());
        System.out.println("Horu: "+t3.getMinute());
        System.out.println("Horu: "+t3.getSecond());

        //Create new Time
        TimeModern t4 = t3.withTime(7, 30, 15);
        System.out.println("New Time with withTime() "+ t4);


    }

}

