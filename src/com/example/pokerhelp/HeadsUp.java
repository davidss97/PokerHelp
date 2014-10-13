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
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.headsup);
	      
	      
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
	    		  
	    		  new Calculate(P1C1palo,P1C1valor,P1C2palo,P1C2valor,
	    				  P2C1palo,P2C1valor,P2C2palo,P2C2valor);
	    		  
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
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(P1C1palo.equals("spad")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(P1C1palo.equals("diam")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(P1C1palo.equals("trev")){
	    	  
	    	  if(P1C1valor.equals("2")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(P1C1valor.equals("3")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(P1C1valor.equals("4")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(P1C1valor.equals("5")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(P1C1valor.equals("6")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(P1C1valor.equals("7")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(P1C1valor.equals("8")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(P1C1valor.equals("9")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(P1C1valor.equals("10")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(P1C1valor.equals("j")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(P1C1valor.equals("q")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(P1C1valor.equals("k")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(P1C1valor.equals("a")){
	    		  P1C1.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      } 
		
		
		
		
		
		if(P1C2palo.equals("hear")){
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(P1C2palo.equals("spad")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(P1C2palo.equals("diam")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(P1C2palo.equals("trev")){
	    	  
	    	  if(P1C2valor.equals("2")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(P1C2valor.equals("3")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(P1C2valor.equals("4")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(P1C2valor.equals("5")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(P1C2valor.equals("6")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(P1C2valor.equals("7")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(P1C2valor.equals("8")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(P1C2valor.equals("9")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(P1C2valor.equals("10")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(P1C2valor.equals("j")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(P1C2valor.equals("q")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(P1C2valor.equals("k")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(P1C2valor.equals("a")){
	    		  P1C2.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      }
		
		if(P2C1palo.equals("hear")){
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(P2C1palo.equals("spad")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(P2C1palo.equals("diam")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(P2C1palo.equals("trev")){
	    	  
	    	  if(P2C1valor.equals("2")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(P2C1valor.equals("3")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(P2C1valor.equals("4")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(P2C1valor.equals("5")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(P2C1valor.equals("6")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(P2C1valor.equals("7")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(P2C1valor.equals("8")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(P2C1valor.equals("9")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(P2C1valor.equals("10")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(P2C1valor.equals("j")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(P2C1valor.equals("q")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(P2C1valor.equals("k")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(P2C1valor.equals("a")){
	    		  P2C1.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      } 
		
		
		
		
		
		if(P2C2palo.equals("hear")){
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(P2C2palo.equals("spad")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(P2C2palo.equals("diam")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(P2C2palo.equals("trev")){
	    	  
	    	  if(P2C2valor.equals("2")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(P2C2valor.equals("3")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(P2C2valor.equals("4")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(P2C2valor.equals("5")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(P2C2valor.equals("6")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(P2C2valor.equals("7")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(P2C2valor.equals("8")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(P2C2valor.equals("9")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(P2C2valor.equals("10")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(P2C2valor.equals("j")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(P2C2valor.equals("q")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(P2C2valor.equals("k")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(P2C2valor.equals("a")){
	    		  P2C2.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      }
	}
}
