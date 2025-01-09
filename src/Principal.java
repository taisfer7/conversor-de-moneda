import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        GeneradorDeArchivo generadorDeArchivo = new GeneradorDeArchivo();

        while (true) {
            System.out.println("\nBienvenido/a al Conversor de Moneda");
            System.out.println("1. Dólar => Peso Argentino");
            System.out.println("2. Peso Argentino => Dólar");
            System.out.println("3. Dólar => Real Brasileño");
            System.out.println("4. Real Brasileño => Dólar");
            System.out.println("5. Dólar => Peso Colombiano");
            System.out.println("6. Peso Colombiano => Dólar");
            System.out.println("7. Salir");
            System.out.println("***************************************");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                System.out.println("Finalizando el programa. Gracias por usar el Conversor de Moneda.");
                break;
            }

            String monedaConvertir;
            String monedaObjetivo;

            switch (opcion) {
                case 1:
                    monedaConvertir = "USD";
                    monedaObjetivo = "ARS";
                    break;
                case 2:
                    monedaConvertir = "ARS";
                    monedaObjetivo = "USD";
                    break;
                case 3:
                    monedaConvertir = "USD";
                    monedaObjetivo = "BRL";
                    break;
                case 4:
                    monedaConvertir = "BRL";
                    monedaObjetivo = "USD";
                    break;
                case 5:
                    monedaConvertir = "USD";
                    monedaObjetivo = "COP";
                    break;
                case 6:
                    monedaConvertir = "COP";
                    monedaObjetivo = "USD";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            System.out.print("Ingrese el valor que desea convertir: ");
            double cantidad = scanner.nextDouble();

            try {
                Moneda tasa = consultaMoneda.buscarMoneda(monedaConvertir, monedaObjetivo);
                double resultado = cantidad * tasa.getRate();
                System.out.printf("El valor de %.2f %s corresponde al valor final de =>> %.2f %s\n",
                        cantidad, monedaConvertir, resultado, monedaObjetivo);

                Conversion conversion = new Conversion(monedaConvertir, monedaObjetivo, cantidad, resultado);
                generadorDeArchivo.guardarJson(conversion);

            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}


