import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static Municipalidad municipalidad = new Municipalidad();

    public static void case4(){
        System.out.println("\nCantidad de planes pagados en su totalidad: " + municipalidad.cantidadPlanesPagados());
    }

    public static void case5(){
        System.out.println("\nSumatoria de deudas registradas: " + municipalidad.sumatoriaDeuda());
    }

    public static void case6(String nombre){
        if (municipalidad.listadoPagosContribuyente(nombre) == null){
            System.out.println("No existe contribuyente");
        }
        else{
            System.out.println(municipalidad.listadoPagosContribuyente(nombre));
        }
    }

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

                        System.out.println("Ingrese el nombre del plan: ");
                        String nombre = op1.next();
                        System.out.println("Ingrese la deuda del plan: ");
                        float deuda = op1.nextFloat();
                        System.out.println("Ingrese las cuotas del plan: ");
                        int cuotas = op1.nextInt();

                        Plan plan = new Plan(nombre, deuda, cuotas);
                        municipalidad.agregarPlan(plan);
                        System.out.println("\n");
                        break;
                    case 2:
                        Scanner op2 = new Scanner(System.in);
                        System.out.println("Ingrese el nombre del contribuyente: ");
                        String nombre2 = op2.next();

                        if ( municipalidad.existePlan(nombre2) ){
                            Plan planSeleccionado = municipalidad.getPlan(nombre2);

                            System.out.println("Ingrese la demora del pago: ");
                            int demora = op2.nextInt();
                            System.out.println("Ingrese em importe del pago: ");
                            float importe = op2.nextFloat();

                            Pago pago = new Pago(demora, importe);
                            planSeleccionado.agregarPago(pago);

                        } else {
                            System.out.println("No existe un plan con el nombre de ese constribuyente.");
                            return;
                        }
                        System.out.println("\n");
                        break;

                    case 3:
                        System.out.println("\nResumen estadistico: ");
                        case4();
                        case5();
                        Scanner op3 = new Scanner(System.in);
                        System.out.println("Ingrese el nombre del contribuyente que desea ver los pagos: ");
                        String nombre4 = op3.next();
                        case6(nombre4);
                        break;
                    case 4:
                        case4();
                        break;
                    case 5:
                        case5();
                        break;
                    case 6:
                        Scanner op6 = new Scanner(System.in);
                        System.out.println("Ingrese el nombre del contribuyente: ");
                        String nombre3 = op6.next();
                        case6(nombre3);
                        break;
                    case 7:
                        System.out.println("\nPromedio general de intereses adicionales cobrados: " + municipalidad.promedioIntereses());
                        break;
                    case 8:
                        System.out.println("Programa finalizado!");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número\n");
                sc.next();
            }
        }

    }
}