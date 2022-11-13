import java.util.ArrayList;

public class Plan {

    private String nombre;

    private float deuda;

    private int cuotas;

    private ArrayList<Pago> pagos;

    //Constructor

    public Plan(String nombre, float deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new ArrayList<>();
    }

    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = new ArrayList<>();
    }

    //Metodos

    public void agregarPago(Pago pago) { pagos.add(pago); }

    public boolean estaPagadoTotalmente(){
        return false;
    }

    public String listadoPagos(){
        return null;
    }

    public float sumaInteresesCobrados(){
        return 0;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "nombre='" + nombre + '\'' +
                ", deuda=" + deuda +
                ", cuotas=" + cuotas +
                ", pagos=" + pagos +
                '}';
    }
}
