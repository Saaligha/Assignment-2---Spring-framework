package Assignment2;


public class UnderGrad extends Student {

    public UnderGrad(String name, String studNum, double loanAmount) {
        super(name, studNum, loanAmount);
    }

    @Override
    public double interest() {
        return this.getLoanAmount() * 0.12 + this.getLoanAmount();
    }

}