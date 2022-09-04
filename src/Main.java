public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);







        // int ticket = 15000;// стоимость билета
       //  int perOne = 20;// количество рублей для одной бонусной милли

       // int miles = ticket / perOne;


        // System.out.println("Количество начисленных миль: " + miles);


    }
}
