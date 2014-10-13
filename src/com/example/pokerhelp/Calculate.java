package com.example.pokerhelp;

import java.util.Timer;
import java.util.TimerTask;

public class Calculate {
	static int a=0;
	Calculate(String P1C1p,String P1C1v,String P1C2p,String P1C2v,
			String P2C1p,String P2C1v,String P2C2p,String P2C2v){
		
		HeadsUp.win1text("In development...");
		
		
			
		new Timer().schedule(new TimerTask() {          
		    @Override
		    public void run() {
		    	if(a<=100){
				HeadsUp.setProgreso(a);
				a++;
		    	}
		    }
		}, 50);
		
	}
}
