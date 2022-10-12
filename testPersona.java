import java.util.Scanner;

public class testPersona {

    public static void main(String[] args) {
        Scanner letra = new Scanner(System.in);
        clearP limpiar = new clearP();
        persona p = new persona();
        Estudiante estudent = new Estudiante();

        limpiar.clear();

        System.out.println("Cual es tu Nombre?");
        estudent.name = letra.next();
        System.out.println("Cual es tu Apellido?");
        estudent.apellido = letra.next();

        System.out.println("Cual es tu sexo?");
        char sexo = letra.next().charAt(0);

        if (sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F') {
            estudent.sexo = sexo;
        } else {
            System.out.println("Sexo incorrecto");
        }

        System.out.println("Cual es tu Matricula?");
        estudent.matricula = letra.next();
        System.out.println("Cual es tu promedio?");
        estudent.nota = letra.nextDouble();

        estudent.mostrarDatos();
        System.out.print(estudent.name);
        p.levantarse();
    }
}
