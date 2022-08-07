public class Doctor {

    static int id = 0;// autoincrement
    String nombre;
    String especialidad;
    String email;

    Doctor(){
        System.out.println("Ingresando al sistema");

    }

    Doctor(String nombre, String especialidad){
        System.out.println("El nombre del Doctor asignado es: " + nombre);
        id++;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    //Comportamientos

    public void showName(){
        System.out.println(this.nombre);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
