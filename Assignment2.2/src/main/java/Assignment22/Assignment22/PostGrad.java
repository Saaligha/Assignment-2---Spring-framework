package Assignment22.Assignment22;

public class PostGrad extends Student {

    public PostGrad(String name, String studNum, double loanAmount) {
        super(name, studNum, loanAmount);
    }

    @Override
    public double interest() {
        return this.getLoanAmount() * 0.70 + this.getLoanAmount();
    }

}
