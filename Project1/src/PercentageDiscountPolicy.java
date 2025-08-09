
/*
 * PercentageDiscountPolicy class
 * This class applies a percentage based discount
 */
public class PercentageDiscountPolicy implements DiscountPolicy{
    private int percent;

    public PercentageDiscountPolicy(int percent){
        if(percent < 0 || percent > 100){
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");
        }

        this.percent = percent;
    }

    @Override
    public double applyDiscount(double amount) {
        // TODO Auto-generated method stub
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        return amount * (1 - this.percent/100.0);
    }

    public int getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return percent + "%";
    }


}
