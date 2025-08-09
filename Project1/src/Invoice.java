/*
 * 6.Invoice Class
 * This class represents an invoice, linking a customer to a total amount
 * Relatiobship 'has a' (มี class customer)
 * เช่น รถยนต์ ต้องมี เครื่องยนต์, ล้อ
 */
public class Invoice {
    private int id;
    private Customer customer; //Composition concept
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        if(id < 0){
            throw new IllegalArgumentException("Customer ID must be non-negative");
        }

        if(customer == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }

        if(amount < 0){
            throw new IllegalArgumentException("Amount must be non-negative");
        }

        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be non-negative");
        }
         this.customer = customer;
    }

    public void setAmount(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount must be non-negative");
        }
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    // public int getCustomerDiscount(){
    //     return customer.getDiscount();
    // }

    //คำนวณ ยอดเงินสุดท้ายหลังหักส่วนลด

    //Core Business logic: apply the customer's discount policy
    public double getAmountAfterDiscount(){

        return this.customer.getDiscountPolicy().applyDiscount(this.amount);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "invoice{ "+
                "id=" + id+
                ", customerId=" + getCustomerId()+
                ", customerName= " + getCustomerName()+
                ", originalAmount= "+ String.format("%.2f", amount)+
                ", discountAmount= "+ String.format("%.2f", getAmountAfterDiscount())+
                "}";
    }




}
