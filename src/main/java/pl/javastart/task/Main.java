package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Math math = new Math();

        System.out.println("Czy 2 jest liczbą parzystą: " + math.isEven(2));
        System.out.println("Czy 2 jest liczbą nieparzystą: " + math.isOdd(2));
        System.out.println("Pole koła o promieniu 7.56 wyniesie: " + math.circleField(7.56));
        System.out.println("Liczba 17 do kwadratu to: " + math.power(17));

    }
}
