// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        short ticketPrice = 22685; // стоимость билета на самолёт в рублях
        /* ещё один вариант решения
        short bonusMiles = (short) (ticketPrice / 20);

        System.out.println(bonusMiles + " бонусных милей");
        */
        short rublesMile = 20; // стоимость одной бонусной мили в рублях
        short bonusMiles = (short) (ticketPrice / rublesMile); // сколько бонусных милей получено за купленный билет

        System.out.println(bonusMiles + " бонусных милей"); // вывод значения переменной бонусных милей за купленный билет + текст
    }
}