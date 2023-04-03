import java.util.Date;
import java.util.Scanner;

public class fouroperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            double AIR = input.nextDouble();
            int NOY = input.nextInt();
            double LA = input.nextDouble();
            try {
                Loan m = new Loan(AIR, NOY, LA);
                System.out.printf("%.3f\n",m.getTotalPayment());
            } catch (Exception ex) {
                System.out.println("java.lang." + ex);
            }
        }
    }
}
//异常类
class IllegalArgumentException extends Exception {
    public IllegalArgumentException() {
    }
    public IllegalArgumentException(String message) {
        super(message);
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Date getLoanDate() {
        return loanDate;
    }
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Loan() {
        this.annualInterestRate = 2.5;
        this.loanAmount = 100;
        this.numberOfYears = 1;
        this.loanDate = new Date();
    }
    public Loan(double AIR, int NOY, double LA) throws IllegalArgumentException {
        if (AIR <= 0) {
            throw new IllegalArgumentException("Annual interest rate must be positive");
        } else if(NOY <= 0) {
            throw new IllegalArgumentException("Number of years must be positive");
        } else if (LA <= 0) {
            throw new IllegalArgumentException("Loan amount must be positive");
        }
        this.annualInterestRate = AIR;
        this.numberOfYears = NOY;
        this.loanAmount = LA;
    }

    public double getMonthlyPayment() {
        return (this.loanAmount*this.annualInterestRate/1200)/(1-(1/Math.pow(1+this.annualInterestRate/1200, this.numberOfYears*12)));
        //(贷款额度月利率)/(1-(1/Math.pow(1+月利率,年数12)))
    }
    public double getTotalPayment() {
        return getMonthlyPayment()*numberOfYears*12;
    }
}