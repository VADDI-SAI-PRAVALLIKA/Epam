package com.epam.christmasgift;


public class Driver {
public static void main(String args[]) {

	Sweet sweet=new Sweet();
	sweet.setInfo("vaddi", "sai", "pravallika");
	sweet.getInfo();
	
	System.out.println();
	

//Gift -> sweet ->Laddu
	kaaju laddu=new kaaju();
	laddu.setInfo("SweetMagic", "Besan Laddu", 150, 756, 10);
	laddu.setSweetType("Starter");
	laddu.getInfo();
	
	
}
}