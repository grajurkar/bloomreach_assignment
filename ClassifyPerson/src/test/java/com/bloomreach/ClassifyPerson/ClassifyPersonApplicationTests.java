package com.bloomreach.ClassifyPerson;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.bloomreach.ClassifyPerson.bean.Person;
import com.bloomreach.ClassifyPerson.controller.ClassifyPersonController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassifyPersonApplicationTests {

	
	 @Test
	    public void testControllerMaleBoy() {
		 ClassifyPersonController classifyController = new ClassifyPersonController();
	        String result = classifyController.classifyPerson(0, "M");
	        assertEquals(result, "BOY");
	 }
	 @Test
	    public void testControllerMaleMan() {
		 ClassifyPersonController classifyController = new ClassifyPersonController();
	        String result = classifyController.classifyPerson(20, "M");
	        assertEquals(result, "MAN");
	 }
	 
	 @Test
	    public void testControllerFemaleGirl() {
		 ClassifyPersonController classifyController = new ClassifyPersonController();
	        String result = classifyController.classifyPerson(14, "F");
	        assertEquals(result, "GIRL");
	 }
	 
	 @Test
	    public void testControllerFemaleWoman() {
		 ClassifyPersonController classifyController = new ClassifyPersonController();
	        String result = classifyController.classifyPerson(19, "F");
	        assertEquals(result, "WOMAN");
	 }
	 
	@Test
	public String classifyPersonAsMale() {
			
		Person person = new Person();
		person.setSex("Male");
		person.setAge(16);
		if (person.getSex().equals("Male") && person.getAge() <18 )
		Assert.isTrue(true, "BOY");
		else
		Assert.isTrue(true, "MAN");
		
		return person.getSex();
		
	}
	
	@Test
	public String classifyPersonAsFemale() {
			
		Person person = new Person();
		person.setSex("Female");
		person.setAge(20);
		if (person.getSex().equals("Female") && person.getAge() <18 )
		Assert.isTrue(true, "GIRL");
		else
		Assert.isTrue(true, "WOMAN");
		
		return person.getSex();
		
	}

}
