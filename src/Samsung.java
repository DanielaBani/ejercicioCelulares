public class Samsung implements Celular {
    private Double batería;

    public Double getBatería() { return batería; }
    public void cargarBatería() {batería = 5.0;}
    public Boolean estasApagado () {return (batería==0);}
    public Double gastarBatería (Double minutos) {return batería = (batería - 0.25);}
}
