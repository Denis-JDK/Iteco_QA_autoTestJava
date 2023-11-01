package lesson6.practics.exception;

public class ExceptionPractica {

    public static void operationNonException() throws ArithmeticException, OneMyWriteException {
        int value=0;
        operationWithException(value);
    }
    public static void operationWithException(int nonZero) throws OneMyWriteException {
        if (nonZero==0){
            throw new OneMyWriteException("nonZero value should not be zero, this work OneMyWriteException");
        }
    }
}
