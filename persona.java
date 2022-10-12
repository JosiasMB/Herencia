import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class persona {
    public String name;
    public String apellido;
    public int edad;
    char sexo;

    public void levantarse() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(1000);
        System.out.println(" se levanta a las " + dateFormat.format(date) + " todos los dias!");
    }

    public void correr() {
        System.out.println(name + " esta corriendo.");
    }

    public void dormir() {
        System.out.println(name + " esta durmiendo.");
    }

    // Sets and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
