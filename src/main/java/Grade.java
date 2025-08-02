public enum Grade {
    A(90, 100),
    B(80, 89),
    C(70, 79),
    D(60, 69),
    F(0, 59);

    public double minumumPercentage;
    public double maximumPercentage;

    Grade(double mininumPercentage, double maximumPercentage) {
        this.maximumPercentage = maximumPercentage;
        this.minumumPercentage = mininumPercentage;
    }
}
