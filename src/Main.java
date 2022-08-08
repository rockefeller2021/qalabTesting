import static ui.UiMenu.*;


public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Rafael", "Ginecologia");
        System.out.println(myDoctor.nombre);
        System.out.println(myDoctor.especialidad);


        Patient patient = new Patient("Julia", "julia@gmail.com");


        System.out.println("Nombre de paciente:  " + patient.getNombre() + " " + "Correo de paciente es:  " +  patient.getEmail());
        patient.setWeight(56.5);
        System.out.println(patient.getWeight());



    }
}