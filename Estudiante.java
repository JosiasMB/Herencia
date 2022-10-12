public class Estudiante extends persona {
    clearP limpiar = new clearP();
    protected double nota;
    protected String matricula;

    public void mostrarDatos() {
        limpiar.clear();
        System.out.println("Estudiante: " + this.name);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Matricula: " + matricula);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Nota: " + nota);
    }

    public clearP getLimpiar() {
        return limpiar;
    }

    public void setLimpiar(clearP limpiar) {
        this.limpiar = limpiar;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
