package com.example.pokerhelp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;




public class HeadsUp extends Activity{
	Button P1C1;
	Button P1C2;
	Button P2C1;
	Button P2C2;
	public static Button flop1;
	public static Button flop2;
	public static Button flop3;
	public static Button turn;
	public static Button river;
	
	Button GO;
	Button atras;
	Button borrarmesa;
	
	static int gana1 = 0;
    static int gana2 = 0;
    static int empate = 0;
    static long total = 0;
	
	public static TextView win1;
	public static TextView lose1;
	public static TextView split1;
	public static TextView win2;
	public static TextView lose2;
	public static TextView split2;
	public static ProgressBar progreso;
	
	
	public static String P1C1palo = " ";
	public static String P1C1valor = " ";
	public static String P1C2palo = " ";
	public static String P1C2valor = " ";
	public static String P2C1palo = " ";
	public static String P2C1valor = " ";
	public static String P2C2palo = " ";
	public static String P2C2valor = " ";
	carta C1;
	carta C2;
	carta X1;
	carta X2;
	
	public static carta F1,F2,F3,F4,F5;
	boolean procesado = false;
	
	//carta[] mano1;
	//carta[] mano2;
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      overridePendingTransition(R.anim.opentop, R.anim.closetop);
	      setContentView(R.layout.headsup);
	      
	     // mano1 = new carta[7];
	     // mano2 = new carta[7];
	      
	      //P1C1.setBackgroundResource(R.drawable.cardclubs2);
	      win1 = (TextView)findViewById(R.id.win1);
	      lose1 = (TextView)findViewById(R.id.lose1);
	      split1 = (TextView)findViewById(R.id.split1);
	      win2 = (TextView)findViewById(R.id.win2);
	      lose2 = (TextView)findViewById(R.id.lose2);
	      split2 = (TextView)findViewById(R.id.split2);
	      flop1 = (Button)findViewById(R.id.flop1);
	      flop2 = (Button)findViewById(R.id.flop2);
	      flop3 = (Button)findViewById(R.id.flop3);
	      turn = (Button)findViewById(R.id.turn);
	      river = (Button)findViewById(R.id.river);
	      
	      progreso = (ProgressBar)findViewById(R.id.progreso);
	      
	      //F1 = new carta(2,2);
		  //flop1.setBackgroundResource(R.drawable.cardclubs2);
		  //F2 = new carta(1,7);
		  //flop2.setBackgroundResource(R.drawable.cardspades7);
		  //F3 = new carta(1,8);
		  //flop3.setBackgroundResource(R.drawable.cardspades8);
		  //F4 = new carta(1,9);
		  //turn.setBackgroundResource(R.drawable.cardspades9);
		  //F5 = new carta(3,12);
		  //river.setBackgroundResource(R.drawable.cardheartsq);
	      
		  
		  flop1.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), flop1.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
		  flop2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), flop2.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
		  flop3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), flop3.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
		  turn.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), turn.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
		  river.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), river.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
		  
	      GO = (Button)findViewById(R.id.go);
	      
	      GO.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //1 picas || 2 trevoles || 3 corazones || 4 diamantes
	    		  
	    		  try{
		    		  if(F5.numero != 0){
		    			  //calcular desde river
		    			carta[] mano1 = {C1,C2,F1,F2,F3,F4,F5};
		    	    	carta[] mano2 = {X1,X2,F1,F2,F3,F4,F5};
	    	    		total = 1;
	    	    		int rr = new Calculate().Calculator(mano1, mano2);
	    	    		if(rr==1){gana1++;
	    	    		}else if(rr==2){gana2++;
	    	    		}else if(rr==0){empate++;
	    	    		}
		    		  }
	    		  }catch(Exception e1){
	    		  try{ 
	    			  if(F4.numero != 0){
	    				  carta[] Baraja = new carta[44];
			    		  int contadorBaraja = 0;
			    		  for(int i=1;i<5;i++){
			    			  for(int n=2; n<15 ; n++){
			    				  if(new carta(i,n).numero==C1.numero
			    					 && new carta(i,n).palo==C1.palo
			    					 || new carta(i,n).numero==C2.numero
			    					 && new carta(i,n).palo==C2.palo
			    					 || new carta(i,n).numero==X1.numero
			    					 && new carta(i,n).palo==X1.palo
			    					 || new carta(i,n).numero==X2.numero
			    					 && new carta(i,n).palo==X2.palo
			    					 || new carta(i,n).numero==F1.numero
			    					 && new carta(i,n).palo==F1.palo
			    					 || new carta(i,n).numero==F2.numero
			    					 && new carta(i,n).palo==F2.palo
			    					 || new carta(i,n).numero==F3.numero
			    					 && new carta(i,n).palo==F3.palo
			    					 || new carta(i,n).numero==F4.numero
			    					 && new carta(i,n).palo==F4.palo){
			    				  }else{
			    					  Baraja[contadorBaraja] = new carta(i,n);
			    					  contadorBaraja++;
			    				  }
			    			  }
			    		  }
		    			  //calcular desde turn
	    				  for ( int i = 0; i < 44; i++ ) {
	    					  	carta[] mano1 = {C1,C2,F1,F2,F3,F4,Baraja[i]};
		  		    	    	carta[] mano2 = {X1,X2,F1,F2,F3,F4,Baraja[i]};
		  	    	    		total ++;
		  	    	    		int rr = new Calculate().Calculator(mano1, mano2);
		  	    	    		if(rr==1){gana1++;
		  	    	    		}else if(rr==2){gana2++;
		  	    	    		}else if(rr==0){empate++;
		  	    	    		}
	    				  }
		    		  }
	    		  }catch(Exception e2){
	    		  try{ 
	    			  if(F3.numero != 0
	    					  && F2.numero != 0
	    					  && F1.numero != 0){
	    				  carta[] Baraja = new carta[45];
			    		  int contadorBaraja = 0;
			    		  for(int i=1;i<5;i++){
			    			  for(int n=2; n<15 ; n++){
			    				  if(new carta(i,n).numero==C1.numero
			    					 && new carta(i,n).palo==C1.palo
			    					 || new carta(i,n).numero==C2.numero
			    					 && new carta(i,n).palo==C2.palo
			    					 || new carta(i,n).numero==X1.numero
			    					 && new carta(i,n).palo==X1.palo
			    					 || new carta(i,n).numero==X2.numero
			    					 && new carta(i,n).palo==X2.palo
			    					 || new carta(i,n).numero==F1.numero
			    					 && new carta(i,n).palo==F1.palo
			    					 || new carta(i,n).numero==F2.numero
			    					 && new carta(i,n).palo==F2.palo
			    					 || new carta(i,n).numero==F3.numero
			    					 && new carta(i,n).palo==F3.palo){
			    				  }else{
			    					  Baraja[contadorBaraja] = new carta(i,n);
			    					  contadorBaraja++;
			    				  }
			    			  }
			    		  }
		    			  //calcular desde turn
	    				  for ( int i = 0; i < 45; i++ ) {
	    					  for ( int j = i + 1; j < 45; j++ ) {
		    					  	carta[] mano1 = {C1,C2,F1,F2,F3,Baraja[i],Baraja[j]};
			  		    	    	carta[] mano2 = {X1,X2,F1,F2,F3,Baraja[i],Baraja[j]};
			  	    	    		total ++;
			  	    	    		int rr = new Calculate().Calculator(mano1, mano2);
			  	    	    		if(rr==1){gana1++;
			  	    	    		}else if(rr==2){gana2++;
			  	    	    		}else if(rr==0){empate++;
			  	    	    		}
	    					  }
	    				  }
		    		  }
		    	  }catch(Exception e){
	    		  carta[] Baraja = new carta[48];
	    		  int contadorBaraja = 0;
	    		  for(int i=1;i<5;i++){
	    			  for(int n=2; n<15 ; n++){
	    				  if(new carta(i,n).numero==C1.numero
	    					 && new carta(i,n).palo==C1.palo
	    					 || new carta(i,n).numero==C2.numero
	    					 && new carta(i,n).palo==C2.palo
	    					 || new carta(i,n).numero==X1.numero
	    					 && new carta(i,n).palo==X1.palo
	    					 || new carta(i,n).numero==X2.numero
	    					 && new carta(i,n).palo==X2.palo){
	    				  }else{
	    					  Baraja[contadorBaraja] = new carta(i,n);
		    					 contadorBaraja++;
	    				  }
	    			  }
	    		  }
	    		  
	    		  
	    		  /*for(int n1=0;n1<48;n1++){
	    			  for(int n2=0;n2<48;n2++){
		    			  if(n2 != n1){
		    				  for(int n3=0;n3<48;n3++){
				    			  if(n3 != n2 && n3 != n1){
				    				  for(int n4=0;n4<48;n4++){
						    			  if(n4 != n3 && n4 != n2 && n4 != n1){
						    				  for(int n5=0;n5<48;n5++){
								    			  if(n5 != n4 && n5 != n3 && n5 != n2 && n5 != n1){
								    				  
								    				 // carta[] mano1 = {C1,C2,F1,F2,F3,F4,F5};
								    	    		 // carta[] mano2 = {X1,X2,F1,F2,F3,F4,F5};
								    	    		  
								    	    		  
								    	    		  //Toast.makeText(getApplicationContext(), mano1.length + " <-- cantidad cartas", Toast.LENGTH_LONG).show();
								    	    		  
								    	    		  //new Calculate(mano1, mano2);
								    				  total++;
								    				  if(total >= 10000000){break;}
								    			  }
							    			  }
						    			  }
					    			  }
				    			  }
			    			  }
		    			  }
		    		  }
	    		  }*/
	    		  /*Thread t = new Thread(new Runnable() {
	              		public void run() {
	              			int perce = 0;
	      	    		  
		      	    		  while(!procesado){
		      	    			  progreso.setProgress(perce);
		      	    			  perce++;
		      	    			  if(perce == 100){
		      	    				  perce=0;
		      	    			  }
		      	    		  }
		                  			
		              		}
			          	});
					
	    		  t.start();*/
	    		  
	    		  
	    		  for ( int i = 0; i < 48; i++ ) {
	    		        for ( int j = i + 1; j < 48; j++ ) {
	    		            for ( int k = j + 1; k < 48; k++ ) {
	    		                for (int l = k + 1; l < 48; l++) {
	    		                    for (int m = l + 1; m < 48; m++) {
	    		                    	carta[] mano1 = {C1,C2,Baraja[i],Baraja[j],Baraja[k],Baraja[l],Baraja[m]};
					    	    		carta[] mano2 = {X1,X2,Baraja[i],Baraja[j],Baraja[k],Baraja[l],Baraja[m]};
					    	    		
					    	    		//carta[] mano1 = {C1,C2,F1,F2,F3,F4,F5};
					  	    		  	//carta[] mano2 = {X1,X2,F1,F2,F3,F4,F5};
					    	    		
					    	    		total++;
					    	    		
					    	    		int rr = new Calculate().Calculator(mano1, mano2);
					    	    		if(rr==1){gana1++;
					    	    		}else if(rr==2){gana2++;
					    	    		}else if(rr==0){empate++;
					    	    		}
	    		                    }
	    		                }
	    		            }
	    		        }
	    		    }
	    		  //procesado = true;
	    		  
		    	  }
	    		  }
	    		  }
	    		  
	    		  long porc1 =  gana1*100/total;
	    		  long porc2 =  gana2*100/total;
	    		  long empate1 =  empate*100/total;
	    		  
	    		  win1text( Long.toString(porc1) +"% win" );
	    		  win2text( Long.toString(porc2) +"% win");
	    		  lose1text( Long.toString(porc2) +"% lose");
	    		  lose2text( Long.toString(porc1) +"% lose");
	    		  split1text( Long.toString(empate1) +"% split");
	    		  split2text( Long.toString(empate1) +"% split");
	    		  
	    		  //win1text(porc1 +"% win");
	    		  
	    		  
	    		  Toast.makeText(getApplicationContext(), gana1 + " <-- gana la mano 1", Toast.LENGTH_SHORT).show();
	    		  Toast.makeText(getApplicationContext(), gana2 + " <-- gana la mano 2", Toast.LENGTH_SHORT).show();
	    		  Toast.makeText(getApplicationContext(), empate + " <-- empates", Toast.LENGTH_SHORT).show();
	    		  
	    		  Toast.makeText(getApplicationContext(), total + " total hands analized", Toast.LENGTH_LONG).show();
	    		  total = 0;
	    		  gana1=0;
	    		  gana2=0;
	    		  empate=0;
	    		  porc1=0;
	    		  porc2=0;
	    		  empate1=0;
	    		 /* carta[] mano
	    		  * 1 = {C1,C2,F1,F2,F3,F4,F5};
	    		  carta[] mano2 = {X1,X2,F1,F2,F3,F4,F5};
	    		  
	    		  
	    		  new Calculate(mano1, mano2);*/
	    		  
		  }});
	      atras = (Button)findViewById(R.id.atras);
	      
	      atras.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
    		  	Intent i = new Intent(getApplicationContext(), MainActivity.class);
    		  	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		  	startActivity(i);
    		  	
	      }});
	      
	      borrarmesa= (Button)findViewById(R.id.borrarmesa);
	      borrarmesa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
    		  	F1 = null;
    		  	F2 = null;
    		  	F3 = null;
    		  	F4 = null;
    		  	F5 = null;
    		  	HeadsUp.flop1.setBackgroundResource(R.drawable.abc_ic_clear);
    		  	HeadsUp.flop2.setBackgroundResource(R.drawable.abc_ic_clear);
    		  	HeadsUp.flop3.setBackgroundResource(R.drawable.abc_ic_clear);
    		  	HeadsUp.turn.setBackgroundResource(R.drawable.abc_ic_clear);
    		  	HeadsUp.river.setBackgroundResource(R.drawable.abc_ic_clear);
    		  	
    		  	//Intent i = getApplicationContext().getPackageManager()
	  			// .getLaunchIntentForPackage(getApplicationContext().getPackageName() );

	  			// i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK );
	  			// startActivity(i);
    		  	
    		  	
	      }});
	      
	      P1C1 = (Button)findViewById(R.id.P1C1);
	      //P1C1.setBackgroundResource(R.drawable.cardjoker);
	      
	      P1C1.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), HeadsP1C1.class);
	    		  startActivity(i);
	 //   		  //overridePendingTransition(R.anim.hold, R.anim.fadein);
	    		  
		  }});
	      
	      
	      
	      P1C2 = (Button)findViewById(R.id.P1C2);
	      //P1C2.setBackgroundResource(R.drawable.cardjoker);
	      
	      P1C2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), HeadsP1C2.class);
	    		  startActivity(i);
	    		  
		  }});
	      
	      P2C1 = (Button)findViewById(R.id.P2C1);
	      //P2C1.setBackgroundResource(R.drawable.cardjoker);
	      
	      P2C1.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), HeadsP2C1.class);
	    		  startActivity(i);
	    		  
		  }});
	      
	      P2C2 = (Button)findViewById(R.id.P2C2);
	      //P2C2.setBackgroundResource(R.drawable.cardjoker);
	      
	      P2C2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), HeadsP2C2.class);
	    		  startActivity(i);
	    		  
		  }});
	      llenarcartas();
	      
	}
	static void setgana1(){
		gana1++;
		total++;
	}
	static void setgana2(){
		gana2++;
		total++;
	}
	static void setempate(){
		empate++;
		total++;
	}
	static void win1text(String text){
		win1.setText(text);
	}
	static void win2text(String text){
		win2.setText(text);
	}
	static void lose1text(String text){
		lose1.setText(text);
	}
	static void lose2text(String text){
		lose2.setText(text);
	}static void split1text(String text){
		split1.setText(text);
	}static void split2text(String text){
		split2.setText(text);
	}
	static void setProgreso(int n){
		progreso.setProgress(n);
	}
	public static void cambiarf1(int d){
		HeadsUp.flop1.setBackgroundResource(d);
	}public static void cambiarf2(int d){
		HeadsUp.flop2.setBackgroundResource(d);
	}public static void cambiarf3(int d){
		HeadsUp.flop3.setBackgroundResource(d);
	}public static void cambiart(int d){
		HeadsUp.turn.setBackgroundResource(d);
	}public static void cambiarr(int d){
		HeadsUp.river.setBackgroundResource(d);
	}
void llenarcartas(){
		
		if(P1C1palo.equals("hear")){
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts2);
	    		  C1 = new carta(3,2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts3);
	    		  C1 = new carta(3,3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts4);
	    		  C1 = new carta(3,4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts5);
	    		  C1 = new carta(3,5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts6);
	    		  C1 = new carta(3,6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts7);
	    		  C1 = new carta(3,7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts8);
	    		  C1 = new carta(3,8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts9);
	    		  C1 = new carta(3,9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts10);
	    		  C1 = new carta(3,10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsj);
	    		  C1 = new carta(3,11);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsq);
	    		  C1 = new carta(3,12);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsk);
	    		  C1 = new carta(3,13);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsa);
	    		  C1 = new carta(3,14);
	    	  }
	      }else if(P1C1palo.equals("spad")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades2);
	    		  C1 = new carta(1,2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades3);
	    		  C1 = new carta(1,3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades4);
	    		  C1 = new carta(1,4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades5);
	    		  C1 = new carta(1,5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades6);
	    		  C1 = new carta(1,6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades7);
	    		  C1 = new carta(1,7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades8);
	    		  C1 = new carta(1,8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades9);
	    		  C1 = new carta(1,9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades10);
	    		  C1 = new carta(1,10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesj);
	    		  C1 = new carta(1,11);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesq);
	    		  C1 = new carta(1,12);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesk);
	    		  C1 = new carta(1,13);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesa);
	    		  C1 = new carta(1,14);
	    	  }
	      }else if(P1C1palo.equals("diam")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds2);
	    		  C1 = new carta(4,2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds3);
	    		  C1 = new carta(4,3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds4);
	    		  C1 = new carta(4,4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds5);
	    		  C1 = new carta(4,5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds6);
	    		  C1 = new carta(4,6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds7);
	    		  C1 = new carta(4,7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds8);
	    		  C1 = new carta(4,8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds9);
	    		  C1 = new carta(4,9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds10);
	    		  C1 = new carta(4,10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsj);
	    		  C1 = new carta(4,11);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsq);
	    		  C1 = new carta(4,12);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsk);
	    		  C1 = new carta(4,13);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsa);
	    		  C1 = new carta(4,14);
	    	  }
	      }else if(P1C1palo.equals("trev")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs2);
	    		  C1 = new carta(2,2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs3);
	    		  C1 = new carta(2,3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs4);
	    		  C1 = new carta(2,4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs5);
	    		  C1 = new carta(2,5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs6);
	    		  C1 = new carta(2,6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs7);
	    		  C1 = new carta(2,7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs8);
	    		  C1 = new carta(2,8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs9);
	    		  C1 = new carta(2,9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs10);
	    		  C1 = new carta(2,10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsj);
	    		  C1 = new carta(2,11);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsq);
	    		  C1 = new carta(2,12);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsk);
	    		  C1 = new carta(2,13);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsa);
	    		  C1 = new carta(2,14);
	    	  }
	      } 
		
		
		/////////////////////////////////////////////////////////////////////////////
		
		
		if(P1C2palo.equals("hear")){
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts2);
	    		  C2 = new carta(3,2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts3);
	    		  C2 = new carta(3,3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts4);
	    		  C2 = new carta(3,4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts5);
	    		  C2 = new carta(3,5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts6);
	    		  C2 = new carta(3,6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts7);
	    		  C2 = new carta(3,7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts8);
	    		  C2 = new carta(3,8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts9);
	    		  C2 = new carta(3,9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts10);
	    		  C2 = new carta(3,10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsj);
	    		  C2 = new carta(3,11);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsq);
	    		  C2 = new carta(3,12);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsk);
	    		  C2 = new carta(3,13);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsa);
	    		  C2 = new carta(3,14);
	    	  }
	      }else if(P1C2palo.equals("spad")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades2);
	    		  C2 = new carta(1,2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades3);
	    		  C2 = new carta(1,3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades4);
	    		  C2 = new carta(1,4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades5);
	    		  C2 = new carta(1,5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades6);
	    		  C2 = new carta(1,6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades7);
	    		  C2 = new carta(1,7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades8);
	    		  C2 = new carta(1,8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades9);
	    		  C2 = new carta(1,9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades10);
	    		  C2 = new carta(1,10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesj);
	    		  C2 = new carta(1,11);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesq);
	    		  C2 = new carta(1,12);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesk);
	    		  C2 = new carta(1,13);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesa);
	    		  C2 = new carta(1,14);
	    	  }
	      }else if(P1C2palo.equals("diam")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds2);
	    		  C2 = new carta(4,2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds3);
	    		  C2 = new carta(4,3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds4);
	    		  C2 = new carta(4,4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds5);
	    		  C2 = new carta(4,5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds6);
	    		  C2 = new carta(4,6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds7);
	    		  C2 = new carta(4,7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds8);
	    		  C2 = new carta(4,8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds9);
	    		  C2 = new carta(4,9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds10);
	    		  C2 = new carta(4,10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsj);
	    		  C2 = new carta(4,11);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsq);
	    		  C2 = new carta(4,12);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsk);
	    		  C2 = new carta(4,13);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsa);
	    		  C2 = new carta(4,14);
	    	  }
	      }else if(P1C2palo.equals("trev")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs2);
	    		  C2 = new carta(2,2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs3);
	    		  C2 = new carta(2,3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs4);
	    		  C2 = new carta(2,4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs5);
	    		  C2 = new carta(2,5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs6);
	    		  C2 = new carta(2,6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs7);
	    		  C2 = new carta(2,7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs8);
	    		  C2 = new carta(2,8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs9);
	    		  C2 = new carta(2,9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs10);
	    		  C2 = new carta(2,10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsj);
	    		  C2 = new carta(2,11);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsq);
	    		  C2 = new carta(2,12);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsk);
	    		  C2 = new carta(2,13);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsa);
	    		  C2 = new carta(2,14);
	    	  }
	      }
		
		if(P2C1palo.equals("hear")){
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts2);
	    		  X1 = new carta(3,2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts3);
	    		  X1 = new carta(3,3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts4);
	    		  X1 = new carta(3,4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts5);
	    		  X1 = new carta(3,5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts6);
	    		  X1 = new carta(3,6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts7);
	    		  X1 = new carta(3,7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts8);
	    		  X1 = new carta(3,8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts9);
	    		  X1 = new carta(3,9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts10);
	    		  X1 = new carta(3,10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsj);
	    		  X1 = new carta(3,11);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsq);
	    		  X1 = new carta(3,12);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsk);
	    		  X1 = new carta(3,13);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsa);
	    		  X1 = new carta(3,14);
	    	  }
	      }else if(P2C1palo.equals("spad")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades2);
	    		  X1 = new carta(1,2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades3);
	    		  X1 = new carta(1,3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades4);
	    		  X1 = new carta(1,4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades5);
	    		  X1 = new carta(1,5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades6);
	    		  X1 = new carta(1,6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades7);
	    		  X1 = new carta(1,7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades8);
	    		  X1 = new carta(1,8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades9);
	    		  X1 = new carta(1,9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades10);
	    		  X1 = new carta(1,10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesj);
	    		  X1 = new carta(1,11);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesq);
	    		  X1 = new carta(1,12);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesk);
	    		  X1 = new carta(1,13);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesa);
	    		  X1 = new carta(1,14);
	    	  }
	      }else if(P2C1palo.equals("diam")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds2);
	    		  X1 = new carta(4,2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds3);
	    		  X1 = new carta(4,3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds4);
	    		  X1 = new carta(4,4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds5);
	    		  X1 = new carta(4,5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds6);
	    		  X1 = new carta(4,6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds7);
	    		  X1 = new carta(4,7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds8);
	    		  X1 = new carta(4,8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds9);
	    		  X1 = new carta(4,9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds10);
	    		  X1 = new carta(4,10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsj);
	    		  X1 = new carta(4,11);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsq);
	    		  X1 = new carta(4,12);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsk);
	    		  X1 = new carta(4,13);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsa);
	    		  X1 = new carta(4,14);
	    	  }
	      }else if(P2C1palo.equals("trev")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs2);
	    		  X1 = new carta(2,2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs3);
	    		  X1 = new carta(2,3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs4);
	    		  X1 = new carta(2,4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs5);
	    		  X1 = new carta(2,5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs6);
	    		  X1 = new carta(2,6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs7);
	    		  X1 = new carta(2,7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs8);
	    		  X1 = new carta(2,8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs9);
	    		  X1 = new carta(2,9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs10);
	    		  X1 = new carta(2,10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsj);
	    		  X1 = new carta(2,11);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsq);
	    		  X1 = new carta(2,12);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsk);
	    		  X1 = new carta(2,13);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsa);
	    		  X1 = new carta(2,14);
	    	  }
	      } 
		
		
		
		
		
		if(P2C2palo.equals("hear")){
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts2);
	    		  X2 = new carta(3,2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts3);
	    		  X2 = new carta(3,3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts4);
	    		  X2 = new carta(3,4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts5);
	    		  X2 = new carta(3,5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts6);
	    		  X2 = new carta(3,6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts7);
	    		  X2 = new carta(3,7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts8);
	    		  X2 = new carta(3,8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts9);
	    		  X2 = new carta(3,9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts10);
	    		  X2 = new carta(3,10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsj);
	    		  X2 = new carta(3,11);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsq);
	    		  X2 = new carta(3,12);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsk);
	    		  X2 = new carta(3,13);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsa);
	    		  X2 = new carta(3,14);
	    	  }
	      }else if(P2C2palo.equals("spad")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades2);
	    		  X2 = new carta(1,2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades3);
	    		  X2 = new carta(1,3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades4);
	    		  X2 = new carta(1,4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades5);
	    		  X2 = new carta(1,5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades6);
	    		  X2 = new carta(1,6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades7);
	    		  X2 = new carta(1,7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades8);
	    		  X2 = new carta(1,8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades9);
	    		  X2 = new carta(1,9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades10);
	    		  X2 = new carta(1,10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesj);
	    		  X2 = new carta(1,11);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesq);
	    		  X2 = new carta(1,12);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesk);
	    		  X2 = new carta(1,13);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesa);
	    		  X2 = new carta(1,14);
	    	  }
	      }else if(P2C2palo.equals("diam")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds2);
	    		  X2 = new carta(4,2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds3);
	    		  X2 = new carta(4,3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds4);
	    		  X2 = new carta(4,4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds5);
	    		  X2 = new carta(4,5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds6);
	    		  X2 = new carta(4,6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds7);
	    		  X2 = new carta(4,7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds8);
	    		  X2 = new carta(4,8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds9);
	    		  X2 = new carta(4,9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds10);
	    		  X2 = new carta(4,10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsj);
	    		  X2 = new carta(4,11);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsq);
	    		  X2 = new carta(4,12);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsk);
	    		  X2 = new carta(4,13);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsa);
	    		  X2 = new carta(4,14);
	    	  }
	      }else if(P2C2palo.equals("trev")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs2);
	    		  X2 = new carta(2,2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs3);
	    		  X2 = new carta(2,3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs4);
	    		  X2 = new carta(2,4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs5);
	    		  X2 = new carta(2,5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs6);
	    		  X2 = new carta(2,6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs7);
	    		  X2 = new carta(2,7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs8);
	    		  X2 = new carta(2,8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs9);
	    		  X2 = new carta(2,9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs10);
	    		  X2 = new carta(2,10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsj);
	    		  X2 = new carta(2,11);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsq);
	    		  X2 = new carta(2,12);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsk);
	    		  X2 = new carta(2,13);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsa);
	    		  X2 = new carta(2,14);
	    	  }
	      }
	}

}
