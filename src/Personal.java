public class Personal implements Proveedor {
    private Double costo = 0.0;

    public Double precioLlamada (Double tiempo) { return costo = tiempo > 10.0 ? ((tiempo-10.0)*0.40) + 10.0*0.70 : (tiempo*0.70);}

    public Double getCosto () { return costo;}
}
