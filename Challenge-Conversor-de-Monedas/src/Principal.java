import com.google.gson.JsonSyntaxException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaApi consulta = new ConsultaApi();

        int opcion = 0;
        String divisa = "";
        String cambio = "";
        double valor = 0;
        var  resultado = " ";
        String monedas = """
                            
                            Bienvenidos al Conversor de Monedas
                --------------------------------------------------------------------------------------

                Monedas Disponibles:

                1- Dólar a Peso Argentino
                2- Peso Argnetino a Dólar
                3- Real Brasileño a Dólar
                4- Dólar a Peso Colombiano
                5-Peso Colombiano a Dólar
                6- Quetzal a Dólar
                7- Dólar a Quetzal
                8- Salir

                Elija una Opción valida:
                --------------------------------------------------------------------------------------

                """;
        Scanner lectura = new Scanner(System.in);
        ConsultaApi consultaApi = new ConsultaApi();
        while (opcion != 8) {
            System.out.println(monedas);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:

                    System.out.println("Elija la cantidad a transformar");
                     valor = lectura.nextDouble();
                    divisa = "USD";
                    cambio = "MXN";
                   resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                   System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();

                    break;
                case 2:
                   System.out.println("Elija la cantidad a transformar");
                     valor = lectura.nextDouble();
                    divisa = "ARS";
                    cambio = "USD";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                   System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                   break;
                case 3:
                    System.out.println("Elija la cantidad a transformar");
                    valor = lectura.nextDouble();
                    divisa = "BRL";
                    cambio = "USD";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                    System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Elija la cantidad a transformar");
                    valor = lectura.nextDouble();
                    divisa = "USD";
                    cambio = "COP";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                    System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Elija la cantidad a transformar");
                    valor = lectura.nextDouble();
                    divisa = "USD";
                    cambio = "COP";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                    System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Elija la cantidad a transformar");
                    valor = lectura.nextDouble();
                    divisa = "GTQ";
                    cambio = "USD";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                    System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Elija la cantidad a transformar");
                    valor = lectura.nextDouble();
                    divisa = "USD";
                    cambio = "GTQ";
                    resultado = String.valueOf(consultaApi.bucarMoneda(divisa, cambio,valor));


                    System.out.println("La cantidad de:" + " " + valor + " " + divisa + " " + "corresponde al valor final de: (" + resultado + " " + cambio + ")");
                    System.out.println();
                    break;


                case 8:
                    System.out.println("Salimos del programa, gracias por utilizar nuestro servicios");

            }
        }


    }
}





