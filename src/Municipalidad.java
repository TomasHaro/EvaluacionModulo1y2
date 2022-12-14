import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Municipalidad {

    private ArrayList<Plan> planes;

    //Constructor

    public Municipalidad() {
        this.planes = new ArrayList<>();
    }

    //Getter y Setter

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plan> planes) {
        this.planes = planes;
    }

    //Metodos

    public void agregarPlan(Plan plan){planes.add(plan);}

    public int cantidadPlanesPagados(){
        return (int) planes.stream().filter(x -> x.estaPagadoTotalmente()).count();
    }

    public float sumatoriaDeuda(){
        return (float) (planes.stream().mapToDouble(x -> x.getDeuda()).sum());
    }

    public String listadoPagosContribuyente(String nombre){
        // (existePlan(nombre3))
        //return planes.stream().filter(x -> x.getNombre().equals(nombre3)).toString();
        if (existePlan(nombre)) {
            List<Plan> pagosxContribuyente = planes.stream().filter(x -> x.getNombre().equals(nombre)).toList();
            return pagosxContribuyente.stream().map(x -> x.listadoPagos()).collect(Collectors.toList()).toString();
        }
        else {

            return null;
        }
    }

    public float promedioIntereses(){
        return (float) planes.stream().mapToDouble(x -> x.sumaInteresesCobrados()).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Planes=" + planes ;
    }

    public boolean existePlan(String nombre) {
        return planes.stream().anyMatch(x -> x.getNombre().equals(nombre));
    }

    public Plan getPlan(String nombre) {
        return planes.stream().filter(x -> x.getNombre().equals(nombre)).findFirst().get();
    }

    public void mostrar(){
        for (Plan p: planes) System.out.println(p);
    }
}
