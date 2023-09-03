public class BasicCalculator {
    public double sum(double... numbers){
        int sums = 0;
        for (double number:numbers){
            sums += number;

        }
        return sums;
    }
    public double subtract(double... numbers){
        int sums = 0;
        for (double number:numbers){
            sums -= number;

        }
        return sums;
    }
    public double multiplied(double... numbers){
        double sums = 1;
        for (double number:numbers){
            sums *= number;
        }
        return sums;
    }
    public double divided(double number1 , double number2) {
        return number1/number2;
    }
}
