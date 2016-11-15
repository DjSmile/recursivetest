package recursivetest;

/**
 * Calculates the weight.
 * 
 * @author Sergey Stotskiy
 *
 */
public class Executor {

    /**
     * Сache of values
     */
    double[][] values = null;

    /**
     * Initialize cache of values.
     *
     * @param maxrow
     */
    public Executor(int maxrow) {
        values = new double[maxrow][];
        // initialize cache as pyramid of values
        for (int row = 0, position = 1; row < maxrow; row++) {
            values[row] = new double[position];
            position++;
        }
    }

    /**
     * Get weight value.
     * 
     * @param row
     *            row
     * @param pos
     *            position
     * @return value
     */
    public double W(int row, int pos) {

        if ((row == 0) || (pos == -1) || (pos > row)) {
            return 0;
        }

        // get value from cache
        double result = this.values[row][pos];

        if (result != 0) {
            return result;
        }

        double rightValue = W(--row, pos); // right bricks

        double leftValue = W(row, --pos); // left bricks

        // default weight of the two bricks
        double centralValue = 2;

        if ((leftValue == 0) || (rightValue == 0)) { // if left or right bricks is not existed
            centralValue = 1;
        }

        result = ((rightValue + centralValue + leftValue) / 2);

        this.values[(row + 1)][(pos + 1)] = result;// set result to cache

        return result;
    }
}
