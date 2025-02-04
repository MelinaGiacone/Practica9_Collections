package notesdam;

import java.util.ArrayList;

public class NotesDam {
    private ArrayList<Double> notesDam;

    public NotesDam() {
        notesDam = new ArrayList<Double>();
    }

    public void introdueixValors(double nota) {
        notesDam.add(nota);
    }

    public double sumaValorsConIterator() {
        double totalNotas = 0.0;
        for (int i = 0; i < notesDam.size(); ++i) {
            totalNotas += (Double) notesDam.get(i);
        }
        return totalNotas;
    }

    public double sumaValorsSenseIterator() {
        double totalNotas = 0.0;

        for (Double nota : notesDam) {
            totalNotas += nota;
        }

        return totalNotas;
    }

    public double calcularMedia() {
        return sumaValorsConIterator() / notesDam.size();
    }
}

