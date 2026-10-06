package isp;

public class ImprimanteMultiFonction implements Imprimante, Scanner, Cancellable {

    @Override
    public void imprimer() {
        System.out.print("Impression par HPOfficeJet");
    }

    @Override
    public void annulerOperation() {
        System.out.print("Operation en cours annulée");
    }

    @Override
    public void scanner() {
        System.out.print("Scan par HPOfficeJet");
    }
}
