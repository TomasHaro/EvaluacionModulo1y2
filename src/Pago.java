public class Pago {

    private int demora;

    private float importe;

    private float interesesAdicionales;

    //Constructor

    public Pago(int demora, float importe) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = (float) (demora * 0.005 * importe);
    }

    //Getter y Setter

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(float interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "demora=" + demora +
                ", importe=" + importe +
                ", interesesAdicionales=" + interesesAdicionales +
                '}';
    }
}
