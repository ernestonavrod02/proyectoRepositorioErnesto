package com.everies.everisdesafiomvn_ENR;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TransformarMayus("ejercicio hecho por ernesto navarrete rodriguez");
    }
    
    public static void TransformarMayus(String texto) {
    	System.out.print(StringUtils.upperCase(texto));
    }
    
}
