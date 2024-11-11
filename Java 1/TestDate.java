public class TestDate {

    public static void main(String[] args) {
        Date today = new Date(13, 8, 2050);


    System.out.println("Today is: " + today.toString());

    today.setDay(14);
    today.setMonth(8);
    today.setYear(2050);


    System.out.println("Updated: " + today.toString());
    }
    
}
