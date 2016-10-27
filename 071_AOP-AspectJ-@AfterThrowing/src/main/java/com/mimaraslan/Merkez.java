package com.mimaraslan;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class Merkez {
   public static void main(String[] args) {
	   
 ConfigurableApplicationContext context = 
 new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
  
IPersonelServis personelServis 
= (IPersonelServis) context.getBean("personelServisBean");

	try{
		personelServis.adiSoyadiKontrolEt();
		personelServis.selamVer("Hoşgeldiniz.");
		personelServis.personelBilgisiniVer();
	} catch(Exception e){
		System.out.println("Personel Servisinin "
		   + "adiSoyadiKontrolEt() metodunda istisna oluştu.");
		System.out.println("istisna mesajı : " + e);
	}
	
	context.close();
   }
}






















