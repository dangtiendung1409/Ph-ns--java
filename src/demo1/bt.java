package demo1;

public class bt {
    public static void main(String[] args) {
        Main fraction1 = new Main(3, 4);
        Main fraction2 = new Main(1, 2);

        //in phân số
        fraction1.printFraction();

        //rút gọn phân số
        fraction1.simplifyFraction();
        fraction1.printFraction();

        //nghịch đảo phân số
        fraction1.invertFraction();
        fraction1.printFraction();

        //cộng hai phân số
        Main sum = fraction1.add(fraction2);
        sum.printFraction();

        //trừ hai phân số
        Main difference = fraction1.subtract(fraction2);
        difference.printFraction();

        //nhân hai phân số
        Main product = fraction1.multiply(fraction2);
        product.printFraction();

        //chia hai phân số
        Main quotient = fraction1.divide(fraction2);
        quotient.printFraction();
    }
}

