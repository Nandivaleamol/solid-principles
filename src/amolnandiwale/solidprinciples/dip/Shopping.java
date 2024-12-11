package amolnandiwale.solidprinciples.dip;

public class Shopping {
    private DebitCard debitCard;

    public Shopping(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void checkout(int amount) {
        debitCard.makePayment(amount);
    }
}
