import java.util.Scanner;
public class Principal {
     public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);
        String nombreEstudiante = "";
        String carrera = "";
        String semestre = "";
        String carnet = "";
        String nombre = "";
        float nota = 0f;

        //Pidiendo los datos al usuario, su informacion personal
        System.out.println("\t\t\tBienvenido al sistema de registro de notas");
        System.out.println("Ingrese su nombre: ");
        nombreEstudiante = teclado.nextLine();
        System.out.println("Ingrese su carrera: ");
        carrera = teclado.nextLine();
        System.out.println("Ingrese su carnet: ");
        carnet = teclado.nextLine();
        Estudiante estudiante = new Estudiante(nombre, carnet, carrera);

        System.out.println(nombre + " ingrese ahora sus asignaturas: ");
        int i = 1;
        String nombreMateria = "";
        float notaMateria = 0;

        while(i <= 5){
            System.out.println("Materia " + i + ":");
            System.out.println("Ingrese el nombre de la materia " + i);
            nombreMateria = teclado.nextLine();
            System.out.println("Ingrese la nota de la materia " + i);
            notaMateria = teclado.nextFloat();
            teclado.nextLine();
            estudiante.asignaturaLlena(i, nombreMateria, notaMateria);
            i++;
        }

        /*
        for(int i = 0; i < 5; i++){
            System.out.println("Numero de asignatura " + (i+1 + ": "));
            String next = teclado.nextLine();
            System.out.println("Nombre de la asignatura");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la nota de la asignatura: ");
            nota = teclado.nextFloat();

            estudiante.asignaturaLlena(i, nombre, nota);
        }
        */ 
        System.out.println("Promedio de total de notas: " + estudiante.promedio());
        String alerta = estudiante.alertaMat();
        if(!alerta.equals("")){ //! not
            System.out.println(alerta);
        }
        System.out.println("La mejor nota es de " + estudiante.mejorClase());
        System.out.println(estudiante.toString());



    }
}
