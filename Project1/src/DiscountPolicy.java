/*
 * DiscountPolicy interface
 */

public interface DiscountPolicy {
    /*
     * @parm amount The original amount
     * @return The amount after the discount us appied
     */
    double applyDiscount(double amount);
}
