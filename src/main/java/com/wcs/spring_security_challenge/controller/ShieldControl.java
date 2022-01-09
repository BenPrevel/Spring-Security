package com.wcs.spring_security_challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldControl {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
    	 return "Avengers... Assemble";
    	
    }
    
    @GetMapping("/secret-bases")
    public String director() {
    	return "Secret bases : Biarritz, Bordeaux, La Loupe, Lille, Lyon, Marseille, Nantes, Orléans, Paris, Reims, Strasbourg, Toulouse, Tours, Amsterdam, Barcelone, Berlin, Bruxelles, , Lisbonne, Londres, Madrid, Remote-les-Bains";
    }
	
}
