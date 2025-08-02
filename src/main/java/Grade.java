public enum Grade {
    A(90, 100),
    B(80, 89),
    C(70, 79),
    D(60, 69),
    F(0, 59);

    // applying techniques of encapsulation with getter and setter implemented.
    private double minumumPercentage;
    private double maximumPercentage;

    Grade(double mininumPercentage, double maximumPercentage) {
        this.maximumPercentage = maximumPercentage;
        this.minumumPercentage = mininumPercentage;
    }

    // add getter and setter for maximumPercentage and miminumPercentage.
    public double getMaximumPercentage() {
        return maximumPercentage;
    }

    public void setMaximumPercentage(double maximumPercentage) {
        this.maximumPercentage = maximumPercentage;
    }

    public double getMinumumPercentage() {
        return minumumPercentage;
    }

    public void setMinumumPercentage(double minumumPercentage) {
        this.minumumPercentage = minumumPercentage;
    }
}
