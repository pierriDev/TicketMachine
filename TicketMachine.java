public class TicketMachine{
    private int price;
    private int balance;
    private int totalSale;

    public TicketMachine(int cost){
        price = cost;
        balance = 0;
        totalSale = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public int getTotal() {
        return totalSale;
    }

    public void setBalance(int amount) {
        balance += amount;
    }

    public void buyTicket() {
        if(balance >= price){
            System.out.println("##########################");
            System.out.println("# Pierri Metro Line");
            System.out.println("# Ticket");
            System.out.println("# Cost:" + price + "cent" );
            System.out.println("##########################");
            System.out.println();

            balance = balance - price;
            totalSale += price;

        }else {
            System.out.println("#####################################################");
            System.out.println("# You dont have enough credit to buy this ticket");
            System.out.println("# You need at least" + (price - balance) + "cents");
            System.out.println("#####################################################");
        }
    }

    public int refundBalance() {
        int amountRefunded = balance;
        balance = 0;
        return amountRefunded;
    }


}