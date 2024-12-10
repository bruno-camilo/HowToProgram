public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "2222-2222", 10000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Bob", "Lewis","3333-3333",50000,.04,300);

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString() );

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",
                basePlusCommissionEmployee.toString());

        CommissionEmployee commissionEmployee1 = basePlusCommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee1.toString());
    }
}
