package study;

public class NbCredit {

    private int nbCredit;
    private TeachingUnit TU;

    public NbCredit(int nbCredit, TeachingUnit TU) {
        this.nbCredit = nbCredit;
        this.TU = TU;
    }

    public NbCredit(int nbCredit) {
        this.nbCredit = nbCredit;
    }

    public NbCredit() {
    }


    public int getNbCredit() {
        return nbCredit;
    }

    public void setNbCredit(int nbCredit) {
        this.nbCredit = nbCredit;
    }

    public TeachingUnit getTU() {
        return TU;
    }

    public void setTU(TeachingUnit TU) {
        this.TU = TU;
    }
}