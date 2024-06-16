import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion != 7) {
            mostrarMenu();
            opcion = leerOpcion(lectura);

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("********************************************\n");
        System.out.println("Bienvenidos al coversor de monedas");
        System.out.println("1) Dolar ==> Peso Argentino");
        System.out.println("2) Peso Argentino ==> Dolar");
        System.out.println("3) Dolar ==> Real Brasileño");
        System.out.println("4) Real Brasileño ==> Dolar");
        System.out.println("5) Dolar ==> Peso Colombiano");
        System.out.println("6) Peso Colombiano ==> Dolar");
        System.out.println("7) Salir");
        System.out.println("Elija una opción válida \n");
        System.out.println("********************************************");
    }

    private static int leerOpcion(Scanner lectura) {
        int opcion = -1;
        try {
            System.out.print("Ingrese su opción: ");
            opcion = Integer.parseInt(lectura.nextLine().trim());
        } catch (Exception e) {
            System.out.println("Introduce sólo números por favor");
        }
        return opcion;
    }
}
