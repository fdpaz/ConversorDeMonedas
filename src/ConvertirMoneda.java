import java.util.Scanner;
import java.util.Date;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad = leerCantidad(monedaBase, lectura); // Leer cantidad con validación
        Date hoy = new Date();

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget); // Consultar tasa de conversión
        System.out.println("La tasa de conversión de hoy " + hoy +
                " \n1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaTarget);

        double cantidadConvertida = cantidad * monedas.conversion_rate(); // Calcular cantidad convertida
        System.out.println("El valor " + cantidad + " " + monedaBase + " corresponde al valor final de =>> " + cantidadConvertida + " " + monedas.target_code());
    }

    private static double leerCantidad(String monedaBase, Scanner lectura) {
        double cantidad = 0;
        while (true) {
            try {
                System.out.println("Ingrese el valor que deseas convertir " + monedaBase);
                cantidad = Double.parseDouble(lectura.nextLine());
                if (cantidad <= 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un valor numérico positivo."); // Mensaje de error
            }
        }
        return cantidad;
    }
}