package com.pluralsight.calcengine;

public class MathEquation {
    // These for fields represent state of this class
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // method for this particular class
    void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode " + opCode);
                result = 0.0d;
                break;
        }
    }

    void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    void setOpCode(char opCode) {
        this.opCode = opCode;
    }
}
