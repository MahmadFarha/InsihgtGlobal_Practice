package com.ig;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VoterValidatorTest {

		VoterValidator vv = new VoterValidator();
		@Test
		public	void testValidateVoterAge() throws Exception{
		    
			Exception exception = Assertions.assertThrows(Exception.class, () -> {
				vv.validateVoterAge(-11);
			});
		    Assertions.assertEquals("Invalid age", exception.getMessage());
		  
	    }
	
	@ParameterizedTest
	@ValueSource(ints = { 1,0,45,78})
	public void validateVoterAgeTestParameter(int age) throws Exception {
		
		Assertions.assertTrue(vv.validateVoterAge(age));
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 1,0,45,78})
	public void validateVoterAgeTestParameter123(int age) throws Exception {
		Assertions.assertFalse(vv.validateVoterAge(age));
	}
}