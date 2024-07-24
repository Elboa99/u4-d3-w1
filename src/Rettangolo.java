public class Rettangolo {
    // attributi
    private double base;
    private double altezza;

    // 2. costruttori
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
        System.out.println("RETTANGOLO 1: ");
        ret1.stampaRettangolo();
        System.out.println("RETTANGOLO 2: ");
        ret2.stampaRettangolo();
        System.out.println("SOMMA AREE: " + (ret1.calcoloArea() + ret2.calcoloArea()));
        System.out.println("SOMMA PERIMETRI: " + (ret1.calcoloPerimetro() + ret2.calcoloPerimetro()));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcoloPerimetro() {
        return (getBase() + getAltezza()) * 2;
    }

    public double calcoloArea() {
        return getBase() * getAltezza();
    }

    public void stampaRettangolo() {
        System.out.println("area: " + calcoloArea());
        System.out.println("perimetro: " + calcoloPerimetro());
    }
}





