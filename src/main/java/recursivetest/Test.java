package recursivetest;

import org.apache.log4j.Logger;

/**
 * Test
 *
 * @author Sergey Stotskiy
 *
 */
public class Test {

    static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {

        Executor executor = new Executor(323); // construct and initialize internal cache of values

        Test.checkResult(0, 0, "0.0", executor);
        Test.checkResult(1, 0, "0.5", executor);
        Test.checkResult(1, 1, "0.5", executor);
        Test.checkResult(2, 0, "0.75", executor);
        Test.checkResult(2, 1, "1.5", executor);
        Test.checkResult(2, 2, "0.75", executor);
        Test.checkResult(3, 0, "0.875", executor);
        Test.checkResult(3, 1, "2.125", executor);
        Test.checkResult(3, 2, "2.125", executor);
        Test.checkResult(3, 3, "0.875", executor);
        Test.checkResult(322, 156, "306.48749781747574", executor);
    }

    /**
     * Check result value.
     * 
     * @param row
     *            row
     * @param pos
     *            pos
     * @param resultString
     *            awaiting string
     * @param executor
     *            initialized executor
     * @return true if equals awaiting value else false
     */
    static boolean checkResult(int row, int pos, String resultString, Executor executor) {
        double awaitingResult = Double.parseDouble(resultString);
        double result = 0;
        if ((result = executor.W(row, pos)) != awaitingResult) {
            Test.logger.error(String.format("W(%d,%d) =%f but waiting %s value", row, pos,
                result, resultString));

            return false;
        }
        Test.logger.info(String.format("W(%d,%d) = %s", row, pos, resultString));
        return true;
    }
}
