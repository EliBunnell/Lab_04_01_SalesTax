
    public class main {
        public static void main(String[] args) {

            double purchasePrice = 100.0;

            final double SALES_TAX_RATE = 0.05;

            double salesTax = purchasePrice * SALES_TAX_RATE;
            double totalPrice = purchasePrice + salesTax;

            System.out.println("Purchase price is $" + purchasePrice);
            System.out.println("Sales tax is $" + salesTax);
            System.out.println("Total price is $" + totalPrice);
        }
    }


