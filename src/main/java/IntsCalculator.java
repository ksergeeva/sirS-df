public class IntsCalculator implements Ints {
    private final Calculator calc;

    public IntsCalculator() {
        this.calc = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calc.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }
@Override
public int sub(int a, int b) {
        return (int) calc.newFormula()
        .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result();
    }
    @Override
    public int pow(int a, int b) {
        return (int) calc.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}