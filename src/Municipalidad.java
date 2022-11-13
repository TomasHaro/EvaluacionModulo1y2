import java.util.ArrayList;

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
        return 0;
    }

    public float sumatoriaDeuda(){
        return 0;
    }

    public String listadoPagosContribuyente(){
        return null;
    }

    public float promedioIntereses(){
        return 0;
    }

    @Override
    public String toString() {
        return "Municipalidad{" +
                "planes=" + planes +
                '}';
    }
}
