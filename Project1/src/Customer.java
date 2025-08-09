/*
 * 5. Customer Class
 * It has a "has a" relationship woth DiscountPolicy
 * This class represemts a customer woth an ID, name, and a DiscountPolicy
 */



public class Customer {
    private int id;
    private String name;
    private DiscountPolicy discountPolicy;

/*
 * Constructor for create customer object
 * @parm id ไม่เป็นค่าติดลบ
 * @parm name ไม่เป็นค่าว่าง
 * @parm discount ส่วนลดเป็น(%) ต้องอยู่ระหว่าง 0-100
 * @throw IllegalArgumentException หาก @params ไม่ถูกต้อง
 */

    public Customer(int id, String name, DiscountPolicy discountPolicy){
        if(id < 0){
            throw new IllegalArgumentException("Customer ID must be non-negative");
        }

        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Customer ID must be null or blank");
        }

        if(discountPolicy == null){
            throw new IllegalArgumentException("Customer must have a discountPolicy");
        }

        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }
    public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public  DiscountPolicy getDiscountPolicy() {
            return this.discountPolicy;
        }

        public void setDiscount(DiscountPolicy policy){
        if(policy == null){
                throw new IllegalArgumentException("Customer must have a discountPolicy");
            }
            this.discountPolicy = policy;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Customer {" +
                    "id= " + id +
                    ", name= " + name +
                    ", discountPolicy= " + discountPolicy + "}";
        }
    
}