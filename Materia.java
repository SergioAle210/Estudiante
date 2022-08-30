public class Materia{
    private String nombre;
    private float nota;

    /*
     * Constructor 
     */
    public Materia(){
        nombre = "";
        nota = 0;
    }
    /*
     * Constructor con parametros
     * @param: nombre el nombre de la clase
     * @param: nota de la clase
     */
    public Materia(String nombre, float nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    /*
     * setNombre modifica el nombre de la asignatura
     * @param nombre: Es el nuevo nombre de la asignatura 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*
     * Obtiene el nombre de la clase
     * @reutn String con el nombre de la clase
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * @param nota cambia la nota de la materia
     */
    public void setNota(float nota) {
        this.nota = nota;
    }
    /*
     * @retun float retorna el valor de la nota
     */
    public float getNota() {
        return nota;
    }

    /*
    * @return genera una foto del objeto
    */

    public String toString() {
        String cadena = "";
        cadena = "Materia: " + nombre + "\nNota: "+nota;
        return cadena;
    }
    /*
     * Determina si las materias son iguales
     */
    public boolean equals(Materia otraMateria){ //Si son iguales los atributos de las dos materias
        float diffNotas = Math.abs(this.nota - otraMateria.getNota()); //Quita el numero negativo
        if (this.nombre.equals(otraMateria.getNombre()) && diffNotas < 0.001){
            return true;
        }
        return false;
    }

    

    /* 
    private String semestre;
    private String asignatura;
    private double promedio;
    


    public Estudiante(){
        nombreEstudiante = "";
        semestre = "";
        asignatura = "";
        promedio = 0;
    }

    public Estudiante(String asignatura, double promedio){
        this.asignatura = asignatura;
        this.promedio = promedio;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "";
    }
    */


}