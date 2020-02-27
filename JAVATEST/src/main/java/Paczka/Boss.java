package Paczka;

public class Boss extends Pracownik {
    private double premia;

    public Boss(String imie, String nazwisko, String stanowisko, double zarobki, double premia) {
        super(imie, nazwisko, stanowisko, zarobki);
        this.premia = premia;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }
}
