

public abstract class Student implements LoanInterest {

    private String name;
    private String studNum;
    public double loanAmount;

    public Student(String name, String studNum, double loanAmount) {
        super();
        this.name = name;
        this.studNum = studNum;
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", studNum:" + studNum + ", Loan Amount: R" + loanAmount +", Amount due: R" + this.interest() + "";
    }

}
