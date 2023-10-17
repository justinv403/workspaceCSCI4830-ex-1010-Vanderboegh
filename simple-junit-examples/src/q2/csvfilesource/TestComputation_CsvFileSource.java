package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   @ParameterizedTest
   // set CSV location
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int input1, int input2, int expected) throws Exception {
	   
	   // create Computation Object
	   Computation com = new Computation();
	   
	   // assign result to getDiscount result
	   int result = com.getDiscount(input1, input2); 
	   
	   // assert expected is equal to actual
	   Assert.assertEquals(result, expected);

   }
}
