package es.hugoalvarezajenjo.windows.fizzbuzz;

public class Fizzbuzz {

    public String execute(final Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("Number cannot be null");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
