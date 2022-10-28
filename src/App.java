import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String e1 = sc.next();
        System.out.println("Qual é o seu peso em kg? ");
        double e2 = sc.nextDouble();
        System.out.println("Qual a quantidade de água em litros que você ingeriu hoje? ");
        double e3 = sc.nextDouble();

        double qtideal = (e2 * 35) / 1000;
        double qtingerir = qtideal - e3;
        double qtingerir11 = (Math.round(qtingerir));

        System.out.println("Nome: " + e1);
        System.out.println("Peso: " + e2 + "Kg");
        System.out.println("Quantidade de água ingerida: " + e3 + " litros");
        System.out.println("Quantidade ideal de água a ingerir: " + (Math.round(qtideal)) + " litros");

        if (e3 > qtideal) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária! ");
        } else if (e3 < qtideal) {
            System.out.println(
                    "Continue focado em se hidratar por hoje, ainda faltam " + qtingerir11 + " litros! Você consegue!");
        }

    }

}
