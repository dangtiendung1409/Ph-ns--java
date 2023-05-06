package demo1;
public class Main {
    private int numerator; //tử số
    private int denominator; //mẫu số

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //constructor
    public Main(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }



    //in phân số
    public void printFraction() {
        System.out.println(numerator + "/" + denominator);
    }

    //rút gọn phân số
    public void simplifyFraction() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    //tìm ước chung lớn nhất của hai số
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    //nghịch đảo phân số
    public void invertFraction() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //cộng hai phân số
    public Main add(Main other) {
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int newDenominator = denominator * other.denominator;
        Main result = new Main(newNumerator, newDenominator);
        result.simplifyFraction();
        return result;
    }

    //trừ hai phân số
    public Main subtract(Main other) {
        int newNumerator = (numerator * other.denominator) - (other.numerator * denominator);
        int newDenominator = denominator * other.denominator;
        Main result = new Main(newNumerator, newDenominator);
        result.simplifyFraction();
        return result;
    }

    //nhân hai phân số
    public Main multiply(Main other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        Main result = new Main(newNumerator, newDenominator);
        result.simplifyFraction();
        return result;
    }

    //chia hai phân số
    public Main divide(Main other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        Main result = new Main(newNumerator, newDenominator);
        result.simplifyFraction();
        return result;
    }
}

