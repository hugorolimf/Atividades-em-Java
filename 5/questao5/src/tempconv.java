//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("1 para Fahrenheit ou 2 para Celsius? ");
//        int escolha = s.nextInt();
//
//        if (escolha == 1) {
//            System.out.print("Temp em Celsius: ");
//            double c = s.nextDouble();
//            double f = ctof(c);
//            System.out.println("Em Fahrenheit: " + f);
//        } else if (escolha == 2) {
//            System.out.print("Temp em Fahrenheit: ");
//            double f = s.nextDouble();
//            double c = ftoc(f);
//            System.out.println("Em Celsius: " + c);
//        } else {
//            System.out.println("Invalido");
//        }
//
//        s.close();
//    }
//
//    public static double ctof(double c) {
//        return 9.0 / 5.0 * c + 32;
//    }
//
//    public static double ftoc(double f) {
//        return 5.0 / 9.0 * (f - 32);
//    }
//}
