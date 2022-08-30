public class Estudiante {
    String nombreEStudiante  = "";
    String carnet = "";
    String carrera = "";
    Materia[] materias = new Materia[5];
    Materia materia = new Materia();
    float sumanotas = 0; 

    public Estudiante(String nombre, String carnet, String carrera){ //Llamar a todos los equipos con el modelo antes de los parametros
        this.nombreEStudiante = nombre;
        this.carnet = carnet;
        this.carrera = carrera;
    }
    public String getNombreEStudiante() {
        return nombreEStudiante;
    }
    public void setNombreEStudiante(String nombreEStudiante) {
        this.nombreEStudiante = nombreEStudiante;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public Materia[] getMaterias() {
        return materias;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public float getSumanotas() {
        return sumanotas;
    }
    public void setSumanotas(float sumanotas) {
        this.sumanotas = sumanotas;
    }
    

    public void asignaturaLlena(int i, String nombre, float nota){
        switch(i){
            case 1:{
                materias[0] = new Materia();
                materias[i-1].setNombre(nombre);
                materias[i-1].setNota(nota);
                break;
            }
            case 2:{
                materias[i-1] = new Materia();
                materias[i-1].setNombre(nombre);
                materias[i-1].setNota(nota);
                break;
            }
            case 3:{
                materias[i-1] = new Materia();
                //materia3 = nuevaMateria;
                materias[i-1].setNombre(nombre);
                materias[i-1].setNota(nota);
                //otra manera de hacerlo
                break;
            }
            case 4:{
                materias[i-1] = new Materia();
                materias[i-1].setNombre(nombre);
                materias[i-1].setNota(nota);
                break;
            }
            case 5:{
                materias[i-1] = new Materia();
                materias[i-1].setNombre(nombre);
                materias[i-1].setNota(nota);
                break;
            }
        }
    }
    public float promedio(){
        float sumanotas = materias[0].getNota() + materias[1].getNota() + materias[2].getNota() + materias[3].getNota() + materias[4].getNota(); 
        return sumanotas/materias.length;
    }
    
    public float mejorClase(){
        if(materias[0].getNota() >= materias[1].getNota() && materias[0].getNota() >= materias[2].getNota() && materias[0].getNota() >= materias[3].getNota() && materias[0].getNota() >= materias[4].getNota()){
           return materias[0].getNota();
        }
        else if(materias[1].getNota() >= materias[0].getNota() && materias[1].getNota() >= materias[2].getNota() && materias[1].getNota() >= materias[3].getNota() && materias[1].getNota() >= materias[4].getNota()){
            return materias[1].getNota();
        }
        else if (materias[2].getNota() >= materias[0].getNota() && materias[2].getNota() >= materias[1].getNota() && materias[2].getNota() >= materias[3].getNota() && materias[2].getNota() >= materias[4].getNota()){
            return materias[2].getNota();
        }
        else if(materias[3].getNota() >= materias[0].getNota() && materias[3].getNota() >= materias[1].getNota() && materias[3].getNota() >= materias[2].getNota() && materias[3].getNota() >= materias[4].getNota()){
            return materias[3].getNota();
        }
        else if(materias[4].getNota() >= materias[0].getNota() && materias[4].getNota() >= materias[1].getNota() && materias[4].getNota() >= materias[2].getNota() && materias[4].getNota() >= materias[3].getNota()){
            return materias[4].getNota();
        }
        return 0;
    }
    //Si el promedio es menor a 10
    public String alertaMat(){
        if (promedio()<=10)
            return "Cuidado vas muy mal";
        return "";
    }
    public String felicitacion(){
        if (promedio()>=90)
            return "Vas muy bien, felicidades";
        return "";
    }
    

    public String toString() {
        String cadena = "";
        cadena = "Bienvenido: " + getNombreEStudiante() + "\nCarné: " + getCarnet() + "\nCarrera: " + getCarrera() + "\nMateria1: " + materias[0].toString() + "\nMateria2: " + materias[1].toString() + "\nMateria3: " + materias[2].toString() + "\nMateria4: " + materias[3].toString() + "\nMateria5: " + materias[4].toString();
        return cadena;
    }

    //Para saber si dos estudiantes son iguales
    public boolean equals(Estudiante est){
        return nombreEStudiante.equals(est.nombreEStudiante) && carnet.equals(est.carnet) && carrera.equals(est.carrera) && materias[0].equals(est.materias[0]) && materias[1].equals(est.materias[1]) && materias[2].equals(est.materias[2]) && materias[3].equals(est.materias[3]) && materias[4].equals(est.materias[4]);
    }


}
