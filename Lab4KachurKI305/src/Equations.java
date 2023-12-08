/**
 * Class <code>Equations</code> реалізує метод обчислення виразу y=ctg(x)/tg(x).
 * @version 1.0
 */
class Equations {
    /**
     * Метод обчислення виразу y=ctg(x)/tg(x).
     * @param x Значення x в градусах.
     * @return Результат обчислення виразу.
     * @throws CalcException Виняток, якщо виникають помилкові ситуації при обчисленні.
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            double ctg = 1 / Math.tan(rad);
            double tg = Math.tan(rad);


            if (tg == 0) {
                throw new ArithmeticException("Ділення на нуль (tg(x) = 0)");
            }
            else if(x == 90) {
                throw new SomeOtherException("x = 90");
            }
            y = ctg / tg;
        }
        catch (ArithmeticException | SomeOtherException ex) {
            if (ex instanceof ArithmeticException) {
                throw new CalcException("Недопустиме значення при обчисленні виразу!");
            }
            else
                throw new CalcException("Помилка: " + ex.getMessage());
        }
        return y;

    }
}
