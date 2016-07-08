package com.rentalx.account.repository;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rentalx.account.PersonalDocument;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:WebContent/WEB-INF/application-context-test.xml")
public class PersonalDocumentRepositoryIntegrationTest {
	
	@Autowired
	private PersonalDocumentRespository personalDocumentRespository;
	
	@Test
	public  void createPersonalDocument (){
		
		PersonalDocument personalDocument = new PersonalDocument ();
		
		personalDocument.setDocId("ABC");
		personalDocument.setExpirationDate(new Date());
		
		personalDocumentRespository.create(personalDocument);
		
	}
	


}
