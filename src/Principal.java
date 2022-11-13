import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static Municipalidad municipalidad = new Municipalidad();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("----------------------------------------------------------");
            System.out.println("1. Agregar plan");
            System.out.println("2. Agregar pago");
            System.out.println("3. Ver resumen estadistico");
            System.out.println("4. Ver cantidad de planes pagados");
            System.out.println("5. Ver sumatoria de deudas registrada");
            System.out.println("6. Listar todos los pagos de un contribuyente");
            System.out.println("7. Ver promedio general de intereses adicionales cobrado");
            System.out.println("8. Salir");
            System.out.println("----------------------------------------------------------");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        Scanner op1 = new Scanner(System.in);
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Ingrese el nombre del plan: ");
                        String nombre = op1.next();
                        System.out.println("Ingrese el nombre del plan: ");
                        float deuda = op1.nextFloat();
                        System.out.println("Ingrese el nombre del plan: ");
                        int cuotas = op1.nextInt();
                        Plan plan = new Plan(nombre, deuda, cuotas);
                        municipalidad.agregarPlan(plan);
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2\n");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3\n");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4\n");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5\n");
                        break;
                    case 6:
                        System.out.println("Has seleccionado la opcion 6\n");
                        break;
                    case 7:
                        System.out.println("Has seleccionado la opcion 7\n");
                        break;
                    case 8:
                        System.out.println("Programa finalizado!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número\n");
                sc.next();
            }
        }

    }
}