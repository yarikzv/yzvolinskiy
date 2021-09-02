package lesson7;


import static lesson6.Task1.calculate;



public class TestCalc {

    public static void main(String[] args) {
     //  compareResult(expectedResult(), givenData());
    }

    //given data
    public static String[] givenData(){
        String[] dataArray = new String[100];
        for (int i = 0; i < dataArray.length/4; i++) {
            dataArray[i] = i+" + "+i;
        }
        for (int i = dataArray.length/4; i < dataArray.length/2; i++) {
            dataArray[i] = i*100+" - "+i;
        }
        for (int i = dataArray.length/2; i < dataArray.length/4*3; i++) {
            dataArray[i] = i+" * "+i;
        }
        for (int i = dataArray.length/4*3; i < dataArray.length; i++) {
            dataArray[i] = i*100+" / "+i;
        }
        return dataArray;
    }
    //expected result
    public static double[] expectedResult() {
        double[] expectedResultArray = new double[100];
        for (int i = 0; i < expectedResultArray.length / 4; i++) {
            expectedResultArray[i] = i + i;
        }
        for (int i = expectedResultArray.length / 4; i < expectedResultArray.length / 2; i++) {
            expectedResultArray[i] = i * 100 - i;
        }
        for (int i = expectedResultArray.length / 2; i < expectedResultArray.length / 4 * 3; i++) {
            expectedResultArray[i] = i * i;
        }
        for (int i = expectedResultArray.length / 4 * 3; i < expectedResultArray.length; i++) {
            expectedResultArray[i] = (double) i * 100 / i;
        }
        return expectedResultArray;
    }
    //actual result
    public static double[] actualResult(double[] givenData){
        double[] actualResult = new double[100];
        for (int i = 0; i < actualResult.length; i++) {
            actualResult[i] = calculate(String.valueOf(givenData()));
        }
        return  actualResult;
    }
    //compare actual result
    public static void compareResult(double[] expectedResult, double[] actualResult){
        for (int i = 0; i < expectedResult.length; i++) {
            if (expectedResult[i]!=actualResult[i]){
                System.out.println("Error in element " + i);
            } else {
                System.out.println("CHECK");
            }
        }

    }
}
