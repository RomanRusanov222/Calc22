public class PowerCalculator {
    public double calculatePower(double a, int b)
            throws InvalidInputException {
        if (a == 0 || b < 0) {
            throw new InvalidInputException("некоректно или отрицательная степень");
        }

        return Math.pow(a,b);
    }

}
