public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking (Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights () {
        return this.nights;
    }

    public double getTotalBill() {
        return this.nights * this.bedroom.getNightlyRate();
    }
}
