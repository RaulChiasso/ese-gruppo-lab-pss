class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(final double real, final double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void main(String[] args){
        System.out.println(4 + "+" + 8 + "i");

        //test plus
        ComplexNumber a = new ComplexNumber(2, 3);
        a=a.plus(new ComplexNumber(4,6));
        System.out.println(a.getReal() + "+" + a.getImaginary() + "i");

        //test sub
        ComplexNumber b = new ComplexNumber(4, 5);
        b=b.sub(new ComplexNumber(2,3));
        System.out.println(b.getReal() + "+" + b.getImaginary() + "i");
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double getReal() {
        return this.real;
    }
    
    public ComplexNumber plus(final ComplexNumber other) {
        return new ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }
    
    public ComplexNumber sub(final ComplexNumber other) {
        return new ComplexNumber(this.real - other.getReal(), this.imaginary - other.getImaginary());
    }

    public ComplexNumber times(final ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber toString(final ComplexNumber other){
        return null;

    }

    public ComplexNumber div(final ComplexNumber other) {
        final double commonDenominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        final double realNumerator = this.getReal() * other.getReal() + this.getImaginary() * other.getImaginary();
        final double imaginaryNumerator = other.getReal() * this.getImaginary() - this.getReal() * other.getImaginary();
        return new ComplexNumber(realNumerator / commonDenominator, imaginaryNumerator / commonDenominator);
    }
}