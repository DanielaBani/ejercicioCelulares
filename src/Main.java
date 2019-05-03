public class Main {
    public static void main (String [] args) {
    Persona juliana = new Persona ();
    Persona catalina = new Persona ();
    Samsung celularSamsung = new Samsung();
    Iphone celularIphone = new Iphone ();
    Personal personal = new Personal();
    Claro claro = new Claro();
    Movistar movistar = new Movistar ();


    juliana.setModeloCelular(celularSamsung);
    catalina.setModeloCelular(celularIphone);

    juliana.setProveedor(personal);
    catalina.setProveedor(movistar);
    celularIphone.cargarBatería();
    celularSamsung.cargarBatería();

    System.out.println (celularIphone.getBatería());
    System.out.println (celularSamsung.getBatería());
    System.out.println (celularIphone.estasApagado());
    System.out.println (celularSamsung.estasApagado());

    juliana.llamar (catalina, 3.0);
     System.out.println (juliana.getModeloCelular().getBatería());
        System.out.println (catalina.getModeloCelular().getBatería());


    catalina.llamar(juliana, 10.55);
        System.out.println (juliana.getModeloCelular().getBatería());
        System.out.println (catalina.getModeloCelular().getBatería());
        System.out.println (juliana.getProveedor().getCosto());
        System.out.println (catalina.getProveedor().getCosto());

    //juliana.llamar(3.0);
    //catalina.llamar(juliana, 20);
      //  System.out.println (catalina.getBatería());
        //System.out.println (juliana.getBatería());

    }



}
