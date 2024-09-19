package _08colecciones.freeStyle_ejercicio;

import java.util.List;

public class CalcularNotas {
    public Double getNotaMedia(List<Double> notas) {
        Double sumNotas = 0.0;
        for (Double nota : notas) {
            sumNotas += nota;
        }
        return sumNotas / notas.size();
    }

    public boolean isAprobado(List<Double> notas) {
        return getNotaMedia(notas) >= 5.0;
    }

}
