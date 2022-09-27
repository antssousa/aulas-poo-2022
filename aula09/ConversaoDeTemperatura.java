import javax.swing.JOptionPane;

public class ConversaoDeTemperatura {

    // Construtor privado a classe não pode ser instanciada
    private ConversaoDeTemperatura() {

    }

    // Celsius para Fahrenheit
    public static double celsiusParaFah(double celsius) {
        return (9 * celsius / 5) + 32;
    }

    // Fahrenheit para Celsius C = (F − 32) × 5/9
    public static double fahParaCelsius(double fah) {
        return (fah - 32) * 5 / 9;
    }

    // Celsius para Kelvin K = C + 273.15
    public static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin para Celsius C = K − 273.15
    public static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}