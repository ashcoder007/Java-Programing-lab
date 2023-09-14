class Complex {
    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public static Complex multiply(Complex x, Complex y) {
        int realPart = x.real * y.real - x.imag * y.imag;
        int imagPart = x.real * y.imag + x.imag * y.real;
        return new Complex(realPart, imagPart);
    }
}

class Complexproduct {
    public static void main(String[] args) {
        Complex x = new Complex(3, 4);
        Complex y = new Complex(2, 3);
        Complex multiplyResult = Complex.multiply(x, y);

        System.out.println("Multiplication result: " + multiplyResult.real + "+" + multiplyResult.imag + "i");
    }
}

