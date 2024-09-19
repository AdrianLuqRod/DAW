package _08colecciones.freeStyle_ejercicio;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        CalcularNotas cn = new CalcularNotas();
        List<Double> calificacionesAlumno1 = List.of(8.2, 4.5, 7.0);
        List<Double> calificacionesAlumno2 = List.of(5.6, 3.2, 5.5);

        System.out.println(cn.getNotaMedia(calificacionesAlumno1));
        System.out.println(cn.isAprobado(calificacionesAlumno1));
        System.out.println(cn.getNotaMedia(calificacionesAlumno2));
        System.out.println(cn.isAprobado(calificacionesAlumno2));

    }
}
