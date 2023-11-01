package lesson6.practics.exception;

public class ExceptionMain {

    public static void main(String[] args) throws OneMyWriteException {
        int x = 2;
        int y = 0;
        int r;

        try {
            r = x/y;
        }catch (ArithmeticException ex){
            ex.printStackTrace();
        }
//---------------------------------------------
//        if (y==0){
//            throw new ArithmeticException("nonZero value should not be zero");
//        }
//----------------------------------------------
        ExceptionPractica.operationNonException(); //throws OneMyWriteException чтоб получить из catch, информацию по исключению, прокидываем исключение.

    }
}
