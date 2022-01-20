package com.example.CankiriKaratekinUniversitesiApi;

import java.util.ArrayList;
import java.util.List;

public class DersVeriServisi {

	private static final 		List <Ders> DERSLER= new ArrayList<Ders>();
      static {
    	  
    	  DERSLER.add(new Ders("Kodlama","5","Ali Yılmaz"));
    	  DERSLER.add(new Ders("Yapay Zeka","7","Hande Su"));
    	  DERSLER.add(new Ders("Programlama Temelleri","7","Selen Ak"));
    	  DERSLER.add(new Ders("Java","10","Mehmet Sönmez"));
    	  DERSLER.add(new Ders("C# Programlama","4","Hande Yaz"));


      }
	
      public static List<Ders> dersleriGetir(){
    	  return DERSLER;
    	  
      }
	
      public static void dersEkle(Ders ders) {
    	  DERSLER.add(ders);
      }
      
      public static void dersSil(Ders ders) {
    	  DERSLER.remove(ders);
      }


	
	
      
      
}
