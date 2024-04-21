import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double cantidad;
        ConsultaDeCambios consulta = new ConsultaDeCambios();
//        ConsultaDeCambios cambio = new ConsultaDeCambios();
        Scanner teclado = new Scanner(System.in);
        System.out.println("***********************************************************");
        System.out.println("Bienvenido/a al Conversor de Monedas =)");

        String menu = """
                \n1) Dólar ==> Peso Argentino
                2) Peso Argentino ==> Dólar
                3) Dólar ==> Real Brasileño
                4) Real Brasileño ==> Dólar
                5) Dólar ==> Peso Colombiano
                6) Peso Colombiano ==> Dólar
                7) Salir
                Elija una opción válida:
                ***********************************************************
                """;

        int opcion = 0;
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    Cambio cambio = consulta.buscarCambios("USD", "ARS", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n " );
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    cambio = consulta.buscarCambios("ARS", "USD", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n" );

                    break;
                case 3:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    cambio = consulta.buscarCambios("USD", "BRL", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n " );

                    break;
                case 4:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    cambio = consulta.buscarCambios("BRL", "USD", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n " );

                    break;
                case 5:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    cambio = consulta.buscarCambios("USD", "COP", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n " );

                    break;
                case 6:
                    System.out.println("Ingrese el valor que desee convertir");
                    cantidad = teclado.nextDouble();
                    cambio = consulta.buscarCambios("COP", "USD", cantidad);
                    System.out.printf("El valor de: " + cantidad + " [" + cambio.base_code() +"] " + "corresponde al valor final de ==>>> " + cambio.conversion_result() + " [" + cambio.target_code() +"]\n " );

                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;            }


        }

        System.out.println("*******************************");



    }


}
