import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest{


    private NumberTest palindromeTester;
    private NumberTester oddTester;
    private NumberTester primeTester;

    public NumberTester(String myFile){
        try( BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));) {
           String line = br.readLine();
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
