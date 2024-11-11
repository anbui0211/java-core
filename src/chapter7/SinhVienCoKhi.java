package chapter7;

public class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        super();
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    double getDiem() {
        return (double) (this.scoreCNC + scorePLC) / 2;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }
}