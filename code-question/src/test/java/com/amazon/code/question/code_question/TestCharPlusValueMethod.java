package com.amazon.code.question.code_question;

import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

/**
 * Unit test for simple App.
 */
public class TestCharPlusValueMethod
{
	// variables
	char returnValue;
	List<Character> list = new LinkedList<Character>();
	char addChar = 'a';
	
	
	@Rule
	public final TestName testName = new TestName();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("***************************************************************************");
		System.out.println("Running Test: " + testName.getMethodName());
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("End of Test");
	}
	
	
	
	
	// TESTS ----------------------------------------------------------------------------------------------------------------------------------------------
    @Test
    public void testEmptyList() throws Exception
    {
    	returnValue = TestQuestion.returnCharPlusValue(list, 'a', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testEmptyChar() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	returnValue = TestQuestion.returnCharPlusValue(list, ' ', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testNullList() throws Exception
    {
    	returnValue = TestQuestion.returnCharPlusValue(null, 'a', 1);
    	assertEquals("Expected: " + TestQuestion.nullListErrMsg, TestQuestion.nullList, returnValue);
    }
    
    @Test
    public void testValueNotInList1() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 't', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testValueNotInList2() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 26; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '1', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testValueNotInList3() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 26; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '&', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testValueNotInList4() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'A', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testValueNotInList5() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '\t', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testValueNotInList6() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '\n', 1);
    	assertEquals("Expected: " + TestQuestion.doesNotContainErrMsg, TestQuestion.doesNotContain, returnValue);
    }
    
    @Test
    public void testNumIndicesTooLarge1() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'a', 3);
    	assertEquals("Expected: " + TestQuestion.numIndicesTooLargeErrMsg, TestQuestion.numIndicesTooLarge, returnValue);
    }
    @Test
    public void testNumIndicesTooLarge2() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 10; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'd', 300000);
    	assertEquals("Expected: " + TestQuestion.numIndicesTooLargeErrMsg, TestQuestion.numIndicesTooLarge, returnValue);
    }
    
    @Test
    public void testEndOfList1() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'b', 2);
    	assertEquals("Expected: " + TestQuestion.endOfListErrMsg, TestQuestion.endOfList, returnValue);
    }
    
    @Test
    public void testEndOfList2() throws Exception
    {
    	// initialize list
    	list.add('s');
    	for(int i = 0; i < 10; i++) {
    		list.add(addChar);
    	}
    	list.add('z');
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'a', 11);
    	assertEquals("Expected: " + TestQuestion.endOfListErrMsg, TestQuestion.endOfList, returnValue);
    }
    
    @Test
    public void testEndOfList3() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 200; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'Ă', 78);
    	assertEquals("Expected: " + TestQuestion.endOfListErrMsg, TestQuestion.endOfList, returnValue);
    }
    
    @Test
    public void testMultipleSameChars() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 10; i++) {
    		list.add(addChar);
    	}
    	list.add('z');
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'a', 10);
    	assertEquals("Expected: z but was: " + returnValue + '\n', 'z', returnValue);
    }
    
    @Test
    public void testBasicExample1() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 10; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'c', 7);
    	assertEquals("Expected: j but was: " + returnValue + '\n', 'j', returnValue);
    }
    
    @Test
    public void testBasicExample2() throws Exception
    {
    	// initialize list
    	addChar = 'z';
    	for(int i = 0; i < 20; i++) {
    		list.add(addChar--);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'y', 17);
    	assertEquals("Expected: h but was: " + returnValue + '\n', 'h', returnValue);
    }
    
    @Test
    public void testBasicExample3() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 200; i++) {
    		list.add(addChar++);
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, 'y', 137);
    	assertEquals("Expected: Ă but was: " + returnValue + '\n', 'Ă', returnValue);
    }
    
    @Test
    public void testBasicExample4() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    		list.add('\t');
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '\t', 2);
    	assertEquals("Expected: \t but was " + returnValue, '\t', returnValue);
    }
    
    @Test
    public void testBasicExample5() throws Exception
    {
    	// initialize list
    	for(int i = 0; i < 3; i++) {
    		list.add(addChar++);
    		list.add('\t');
    	}
    	
    	// run test
    	returnValue = TestQuestion.returnCharPlusValue(list, '\t', 3);
    	assertEquals("Expected: \t but was " + returnValue, 'c', returnValue);
    }
}
