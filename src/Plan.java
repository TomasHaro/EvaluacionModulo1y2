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

    public ArrayList<Pago> listadoPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = new ArrayList<>();
    }

    //Metodos

    public void agregarPago(Pago pago) { pagos.add(pago); }

    public boolean estaPagadoTotalmente(){
        if (pagos.size() == cuotas) {
            return pagos.stream().allMatch(x -> x.getImporte() == (deuda/cuotas));
        }
        else{
            return false;
        }
    }

    //public ArrayList<Pago> listadoPagos(){
        //return pagos.stream().filter(x -> x );
        //ArrayList<Pago> listadoPagos = new ArrayList<>();
        //pagos.stream().forEach(x -> listadoPagos.add(x));
        //return listadoPagos;

    //}

    public float sumaInteresesCobrados(){
        return (float) pagos.stream().mapToDouble(x -> x.getInteresesAdicionales()).sum();
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", deuda=" + deuda +
                ", cuotas=" + cuotas +
                ", pagos=" + pagos ;
    }
}
