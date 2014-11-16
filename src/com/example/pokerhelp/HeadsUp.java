package com.example.pokerhelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;




public class HeadsUp extends Activity{
	Button P1C1;
	Button P1C2;
	Button P2C1;
	Button P2C2;
	Button GO;
	Button atras;
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
	
	carta F1,F2,F3,F4,F5;
	
	//carta[] mano1;
	//carta[] mano2;
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
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
	      
	      progreso = (ProgressBar)findViewById(R.id.progreso);
	      GO = (Button)findViewById(R.id.go);
	      
	      GO.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //1 picas || 2 trevoles || 3 corazones || 4 diamantes
	    		  
	    		  F1 = new carta(1,14);
	    		  F2 = new carta(1,7);
	    		  F3 = new carta(1,8);
	    		  F4 = new carta(1,9);
	    		  F5 = new carta(1,7);
	    		  
	    		  
	    		  carta[] mano1 = {C1,C2,F1,F2,F3,F4,F5};
	    		  carta[] mano2 = {X1,X2,F1,F2,F3,F4,F5};
	    		  
	    		  
	    		  new Calculate(mano1, mano2);
	    		  
		  }});
	      atras = (Button)findViewById(R.id.atras);
	      
	      atras.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
    		  	Intent i = new Intent(getApplicationContext(), MainActivity.class);
    		  	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		  	startActivity(i);
    		  	
	      }});
	      
	      P1C1 = (Button)findViewById(R.id.P1C1);
	      //P1C1.setBackgroundResource(R.drawable.cardjoker);
	      
	      P1C1.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  //Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  Intent i = new Intent(getApplicationContext(), HeadsP1C1.class);
	    		  startActivity(i);
	    		  
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
	static void win1text(String text){
		win1.setText(text);
	}
	static void setProgreso(int n){
		progreso.setProgress(n);
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
