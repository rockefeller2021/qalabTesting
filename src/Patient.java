public class Patient {

    int idPatient;
    private String nombre;
    private String email;
    private String address;
    private String PhoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String nombre, String email){
        this.nombre = nombre;
        this.email = email;

    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 10){
            System.out.println("El numero telefonico debe ser de 10 digistos ");
        }else if(phoneNumber.length() == 10){
            this.PhoneNumber = phoneNumber;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
