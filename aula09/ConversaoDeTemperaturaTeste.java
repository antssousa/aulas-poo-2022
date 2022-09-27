import java.util.Scanner;

public class ConversaoDeTemperaturaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celsius");
        double celsius = scan.nextDouble();
        double fah = ConversaoDeTemperatura.celsiusParaFah(celsius);
        System.out.println("A temperatura em graus Fahrenheit e " + fah);
        System.out.println("Digite a temperatura em graus Fahrenheit");
        fah = scan.nextDouble();
        celsius = ConversaoDeTemperatura.fahParaCelsius(fah);
        System.out.println("A temperatura em graus celsius e " + celsius);
        System.out.println("Digite a temperatura em graus Celsius");
        celsius = scan.nextDouble();
        double kelvin = ConversaoDeTemperatura.celsiusParaKelvin(celsius);
        System.out.println("A temperatura em graus Kelvin e " + kelvin);
        System.out.println("Digite a temperatura em graus Kelvin");
        kelvin = scan.nextDouble();
        kelvin = ConversaoDeTemperatura.kelvinParaCelsius(celsius);
        System.out.println("A temperatura em graus Kelvin e " + kelvin);
    }
}
