public class Persona {
    private Celular modeloCelular;
    private Proveedor proveedor;

    public void setModeloCelular(Celular modelo) {
        modeloCelular = modelo;
    }
    public Celular getModeloCelular() {
        return modeloCelular;
    }

    public void setProveedor (Proveedor empresa) {
        proveedor = empresa;
    }
     public Proveedor getProveedor() { return proveedor;}

    public void llamar(Persona otraPersona, Double minutos) {
        this.getModeloCelular().gastarBatería(minutos);
        otraPersona.getModeloCelular().gastarBatería(minutos);
        this.getProveedor().precioLlamada(minutos);
        otraPersona.getProveedor().precioLlamada(minutos);
    }

    }



