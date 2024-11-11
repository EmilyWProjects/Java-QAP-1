public class TestTime {

    public static void main(String[] args){
        
        Time t1 = new Time(7, 15, 30);
        Time t2 = new Time(2, 23, 25);


        System.out.println("Start time t1: " + t1.toString());
        System.out.println("Start time t2: " + t2.toString());


        t1.nextSecond();
        t2.previousSecond();


        System.out.println("Next second t1: " + t1.toString());
        System.out.println("Previous second t2: " + t2.toString());

    }
    
}
