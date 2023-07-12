public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Введите цисло 1: ");
            double a = scanner.nextDouble();

            System.out.print("Введите число 2: ");
            int b = scanner.nextInt();
            PowerCalculator powerCalculator = new PowerCalculator();


            System.out.println("resultat: " + powerCalculator.calculatePower(a,b));
        } catch (InvalidInputException e) {
            System.out.println("ochibka: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ochibca vvoda: введены некорректные числа");
        }

        scanner.close();
    }
    }

    

