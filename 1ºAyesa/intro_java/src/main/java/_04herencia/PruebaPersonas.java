package _04herencia;

public class PruebaPersonas {

    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juanma", 2000, null);
        Alumno alumno = new Alumno("Paco", "1123", profesor);
        Alumno alumno2 = new Alumno("Mar", "1223", profesor);
        Alumno alumno3 = new Alumno("Adri", "1233", profesor);

        Alumno[] alumnos = { alumno, alumno2, alumno3 };
        profesor.setAlumnos(alumnos);

        imprimeAlumno(alumno);
        System.out.println("--------------------");
        imprimeProfesor(profesor);
    }

    public static void imprimeAlumno(Alumno alumno) {
        System.out.println(alumno);
    }

    public static void imprimeProfesor(Profesor profesor) {
        System.out.println(profesor);
    }
}
