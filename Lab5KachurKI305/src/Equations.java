/**
 * Class <code>Equations</code> implements method for y=ctg(x)/tg(x) expression calculation
 * @version 1.0
 */
class Equations {
    public double calculate(double x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            double tanX = Math.tan(rad);
            if (tanX == 0) {
                throw new ArithmeticException();
            }
            y = 1 / tanX / tanX;
        } catch (ArithmeticException ex) {
            throw new CalcException("Недопустиме значення при обчислені значення тангенса!");
        }
        return y;
    }
}
