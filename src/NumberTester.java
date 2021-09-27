public class NumberTester implements NumberTest{


    public NumberTester(String fileName){
        //TODO
    }

    public void setOddEvenTester(NumberTester oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester){
        this.primeTester = primeTester;
    }

    public void setPrimeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){

    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}
