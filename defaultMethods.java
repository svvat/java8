// This demonstrates a default method on an interface
// basically this is a virtual class


interface Converter {
    static double FACTOR_KG2LB = 2.205;
    double convert(double a);

    default double kgToLb(double a) {
        return a / FACTOR_KG2LB;
    }
    default double lbToKg(double a) {
        return a * FACTOR_KG2LB;
    }

}

class defaultMethods 
{ 
    public static void main (String[] args) 
    { 
        Converter lb = new Converter() {
            @Override
            public double convert(double a) {
                return kgToLb(a);
            }
        };
        Converter kg = new Converter() {
            @Override
            public double convert(double a) {
                return lbToKg(a);
            }
        };
        for(int n=0;n<10;n++)
        {
            System.out.format("%d kg = %.2f lb\n", n, kg.convert(n));
            System.out.format("%d lb = %.2f kg\n", n, lb.convert(n));
        }
    }
}

