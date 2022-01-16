import java.util.Scanner;

public class WaterBillCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee empl = new Employee();

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Water Bill Calculator ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        System.out.print("# Customer ID         :  ");
        int customer_id = scan.nextInt();
        System.out.print("# Mounthly Used Units :  ");
        int mont_use = scan.nextInt();

        empl.setCustomer(customer_id, mont_use);

        System.out.print("# Unit Price          :  ");
        float uni_price = scan.nextFloat();
        System.out.print("# Discount Rate       :  ");
        int discount_rate = scan.nextInt();

        empl.setBill(uni_price, discount_rate);

        System.out.print("# Employee ID         :  ");
        int emp = scan.nextInt();

        empl.setEmployee(emp);

        empl.calBill();
        empl.display();
    }
}

class Customer {
    int customer_id;
    int units_per_month;

    public void setCustomer(int cus_id, int units_p_m) {
        this.customer_id = cus_id;
        this.units_per_month = units_p_m;
    }
}

class WaterBill extends Customer {
    float unit_price, discount_rate;
    float final_bill_amount, bill_amount, disount_amount;

    public void setBill(float Unit_price, float disco_rate) {
        this.unit_price = Unit_price;
        this.discount_rate = disco_rate;
    }

    public void calBill() {
        bill_amount = units_per_month * unit_price;
        disount_amount = (bill_amount * discount_rate) / 100;
        final_bill_amount = bill_amount - disount_amount;
    }


}

class Employee extends WaterBill {
    int employee_id;

    public void setEmployee(int emp_id) {
        this.employee_id = emp_id;
    }

    public void display() {
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Final Bill ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("    Employee ID              Customer ID               Final Bill Amount");
        System.out.println("       " + employee_id + "                          " + customer_id + "                         " + final_bill_amount);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
