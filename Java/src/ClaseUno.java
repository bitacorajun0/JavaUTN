// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Alt+Intro with your caret at the highlighted text to see how
// IntelliJ IDEA suggests fixing it.
// Press Mayús+F10 or click the green arrow button in the gutter to run the code.
// Press Mayús+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.
import java.util.Scanner;
public class ClaseUno {
    public static void main(String... args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        boolean var = true;

        // Se deberían mostrar los números:
        // 5,6,7,8,9,10,11,12,13,14
        while(numeroInicio <= numeroFin) {
            // A lo anterior, solo muestre los números pares
            if(numeroInicio%2==0 && var==true) {
                //A lo anterior, con una variable extra, elija si se deben mostrar los números
                //pares o impares, y para que muestre impares es:
                //si var = false;
                // if(numeroInicio%2!=0 && var==false) {
                System.out.print(numeroInicio+" ");
            }
            numeroInicio++;
            //Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
            //numeroInicio = 5;
            //for(int i=numeroFin;i>=numeroInicio;i--) {
            //if(numeroInicio%2==0) {
            //System.out.print(numeroInicio+" ");}
        }

        int ingresos = 589083;
        int cantidadAutos = 3;
        int inmuebles = 3;
        boolean embarcacion = true;
        boolean aeronave = true;
        boolean activos = true;

        Scanner leerIngresos = new Scanner(System.in);
        System.out.println("Indique los ingresos mensuales totales de su hogar");
        int datoUno = leerIngresos.nextInt();

        Scanner leerCantidadAutos = new Scanner(System.in);
        System.out.println("Cuantos autos tenes hace mas de cinco años?");
        int datoAutoUno = leerCantidadAutos.nextInt();

        Scanner leerInmuebles = new Scanner(System.in);
        System.out.println("Cuantos inmuebles posee?");
        int datoinmuebles = leerInmuebles.nextInt();


        if ( (datoUno >= ingresos) || (datoAutoUno >=  cantidadAutos) || (datoinmuebles >= inmuebles) ) {
            System.out.println("Usted es un cheto");
        }
        else {
            System.out.println("Usted no es un cheto");
        }
    }
}