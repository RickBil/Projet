package models;

public enum Grade {
    Ingenieur(10000),
    Doctor(15000),
    Professeur(25000);

    private double tauxH;
    Grade(double tauxH) {
        this.tauxH = tauxH;
    }
    public double getTauxH() {
        return tauxH;
    }
}
