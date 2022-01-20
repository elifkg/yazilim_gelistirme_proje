package com.example.CankiriKaratekinUniversitesiApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ders")
public class DersApi {
	
    @GetMapping("/listele")
	public List<Ders> listele(){
	
		return  DersVeriServisi.dersleriGetir();
		
	}
     
    
    @PostMapping("/ekle")
    public Ders ekle(@RequestBody Ders ders) {
    	DersVeriServisi.dersEkle(ders);
    	return ders;
    }
    @GetMapping("/ekle2")
    public Ders dersEkle(@RequestParam String isim, @RequestParam String dersSayisi, @RequestParam String dersHocasi) {
    Ders ders = new Ders(isim, dersSayisi, dersHocasi);
    		DersVeriServisi.dersEkle(ders);
	        return ders;
    }
    
    
    @DeleteMapping("/sil") 	
    public String deleteByName(@RequestParam (value= "isim")String isim) {
    return "silindi";	
    }
    	 
    
    
    
    
	
	
	
}