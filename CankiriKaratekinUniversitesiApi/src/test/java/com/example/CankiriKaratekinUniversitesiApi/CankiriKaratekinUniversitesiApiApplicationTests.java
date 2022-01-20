package com.example.CankiriKaratekinUniversitesiApi;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.CankiriKaratekinUniversitesiApi.DersVeriServisi;
import com.example.CankiriKaratekinUniversitesiApi.Ders;
import  com.example.CankiriKaratekinUniversitesiApi.DersApi;
@SpringBootTest
class CankiriKaratekinUniversitesiApiApplicationTests {

	
	@Test
	
	public void getMetodu(){
		
		List<Ders> sonuc = DersVeriServisi.dersleriGetir();
		assertEquals(sonuc,DersVeriServisi.dersleriGetir());
		
	}

	      @Test
            public void deleteMetodu() {
      		Ders ders= new Ders("python","5","elif");

      		DersVeriServisi.dersSil(ders);
      		assertEquals(0,0);
      		
          }
	

  
	
	
	
	
}
