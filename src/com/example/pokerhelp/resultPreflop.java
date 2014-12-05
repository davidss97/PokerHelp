package com.example.pokerhelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class resultPreflop extends Activity{
	Button boton1;
	Button boton2;
	Button atras;
	TextView resultado;
	RatingBar rate;
	//////////////////////////////////////////
	public String palo1;
	public String valor1;
	public String palo2;
	public String valor2;
	
	
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.respreflop);
	      boton1 = (Button)findViewById(R.id.card1);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      boton1.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  Toast.makeText(getApplicationContext(), "CARTA 1", Toast.LENGTH_SHORT).show();
		  }});
	      boton2 = (Button)findViewById(R.id.card2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      boton2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  Toast.makeText(getApplicationContext(), "CARTA 1", Toast.LENGTH_SHORT).show();
		  }});
	      atras = (Button)findViewById(R.id.caraacara);
	      
	      atras.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
    		  	Intent i = new Intent(getApplicationContext(), MainActivity.class);
    		  	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    		  	startActivity(i);
    		  	
	      }});
	      
	      resultado = (TextView)findViewById(R.id.lose1);
	      rate = (RatingBar)findViewById(R.id.ratingBar);
	      
	      Bundle extras = getIntent().getExtras();
	      if (extras != null) {
	          palo1 = extras.getString("pal");
	          valor1 = extras.getString("val");
	          palo2 = extras.getString("pal2");
	          valor2 = extras.getString("val2");
	          
	          Toast.makeText(getApplicationContext(), "Anterior = " + valor1 + " de " + palo1 , Toast.LENGTH_SHORT).show();
	          resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "");
	      }
	      
	      llenarcartas();
	      
	      if(palo1.equals(palo2) || valor1.equals(valor2)){
	    	  if(valor1.equals("a") && valor2.equals("a") 
	    		|| valor1.equals("a") && valor2.equals("k")
	    		|| valor1.equals("k") && valor2.equals("a")
	    		|| valor1.equals("q") && valor2.equals("k")
	    		|| valor1.equals("k") && valor2.equals("q")
	    		|| valor1.equals("q") && valor2.equals("j")
	    		|| valor1.equals("j") && valor2.equals("q")
	    		|| valor1.equals("j") && valor2.equals("10")
	    		|| valor1.equals("10") && valor2.equals("j")
	    		|| valor1.equals("10") && valor2.equals("9")
	    		|| valor1.equals("9") && valor2.equals("10")
	    		|| valor1.equals("k") && valor2.equals("k")
	    		|| valor1.equals("a") && valor2.equals("q")
	    		|| valor1.equals("q") && valor2.equals("a")
	    		|| valor1.equals("k") && valor2.equals("j")
	    		|| valor1.equals("j") && valor2.equals("k")
	    		|| valor1.equals("q") && valor2.equals("10")
	    		|| valor1.equals("10") && valor2.equals("q")
	    		|| valor1.equals("j") && valor2.equals("9")
	    		|| valor1.equals("9") && valor2.equals("j")
	    		|| valor1.equals("q") && valor2.equals("q")
	    		|| valor1.equals("a") && valor2.equals("j")
	    		|| valor1.equals("j") && valor2.equals("a")
	    		|| valor1.equals("k") && valor2.equals("10")
	    		|| valor1.equals("10") && valor2.equals("k")
	    		|| valor1.equals("j") && valor2.equals("j")
	    		|| valor1.equals("a") && valor2.equals("10")
	    		|| valor1.equals("10") && valor2.equals("a")
	    		|| valor1.equals("10") && valor2.equals("10")
	    		|| valor1.equals("9") && valor2.equals("9")
	    		|| valor1.equals("8") && valor2.equals("8")
	    		|| valor1.equals("7") && valor2.equals("7")){
	    		  
	    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
	    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS SIEMPRE");
	    		  rate.setRating(5);
	    		  
	    	  }else if(valor1.equals("9") && valor2.equals("8") 
	  	    		|| valor1.equals("8") && valor2.equals("9")
	  	    		|| valor1.equals("10") && valor2.equals("8")
	  	    		|| valor1.equals("8") && valor2.equals("10")
	  	    		|| valor1.equals("j") && valor2.equals("8")
	  	    		|| valor1.equals("8") && valor2.equals("j")
	  	    		|| valor1.equals("q") && valor2.equals("9")
	  	    		|| valor1.equals("9") && valor2.equals("q")
	  	    		|| valor1.equals("q") && valor2.equals("8")
	  	    		|| valor1.equals("8") && valor2.equals("q")
	  	    		|| valor1.equals("k") && valor2.equals("9")
	  	    		|| valor1.equals("9") && valor2.equals("k")
	  	    		|| valor1.equals("a") && valor2.equals("9")
	  	    		|| valor1.equals("9") && valor2.equals("a")
	  	    		|| valor1.equals("8") && valor2.equals("a")
	  	    		|| valor1.equals("a") && valor2.equals("8")
	  	    		|| valor1.equals("7") && valor2.equals("a")
	  	    		|| valor1.equals("a") && valor2.equals("7")
	  	    		|| valor1.equals("6") && valor2.equals("a")
	  	    		|| valor1.equals("a") && valor2.equals("6")
	  	    		|| valor1.equals("6") && valor2.equals("6")
	  	    		|| valor1.equals("5") && valor2.equals("5")
	  	    		
	  	    		){
	    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
	    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS EN POSICION MEDIA Y TARDIA");
	    		  rate.setRating(4);
	    		  
	    	  }else if(valor1.equals("5") && valor2.equals("4") 
		  	    		|| valor1.equals("4") && valor2.equals("5")
		  	    		|| valor1.equals("6") && valor2.equals("5")
		  	    		|| valor1.equals("5") && valor2.equals("6")
		  	    		|| valor1.equals("6") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("6")
		  	    		|| valor1.equals("8") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("8")
		  	    		|| valor1.equals("7") && valor2.equals("5")
		  	    		|| valor1.equals("5") && valor2.equals("7")
		  	    		|| valor1.equals("8") && valor2.equals("6")
		  	    		|| valor1.equals("6") && valor2.equals("8")
		  	    		|| valor1.equals("9") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("9")
		  	    		|| valor1.equals("9") && valor2.equals("6")
		  	    		|| valor1.equals("6") && valor2.equals("9")
		  	    		|| valor1.equals("10") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("10")
		  	    		|| valor1.equals("j") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("j")
		  	    		|| valor1.equals("k") && valor2.equals("8")
		  	    		|| valor1.equals("8") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("7")
		  	    		|| valor1.equals("7") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("6")
		  	    		|| valor1.equals("6") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("5")
		  	    		|| valor1.equals("5") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("4")
		  	    		|| valor1.equals("4") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("3")
		  	    		|| valor1.equals("3") && valor2.equals("k")
		  	    		|| valor1.equals("k") && valor2.equals("2")
		  	    		|| valor1.equals("2") && valor2.equals("k")
		  	    		|| valor1.equals("a") && valor2.equals("5")
		  	    		|| valor1.equals("5") && valor2.equals("a")
		  	    		|| valor1.equals("a") && valor2.equals("4")
		  	    		|| valor1.equals("4") && valor2.equals("a")
		  	    		|| valor1.equals("a") && valor2.equals("3")
		  	    		|| valor1.equals("3") && valor2.equals("a")
		  	    		|| valor1.equals("a") && valor2.equals("2")
		  	    		|| valor1.equals("2") && valor2.equals("a")
		  	    		|| valor1.equals("4") && valor2.equals("4")
		  	    		|| valor1.equals("3") && valor2.equals("3")
		  	    		|| valor1.equals("2") && valor2.equals("2")
		  	    		
		  	    		
		  	    		
		  	    		){
		    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
		    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS EN POSICION SOLO TARDIA");
		    		  rate.setRating((float) 2.5);
	    	  }else{resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
    				  + "ESTAS CARTAS NO DEBERIAN SER JUGADAS");
	    	  		rate.setRating(1);}
	      }else{////////////////////////////////////////////////////////////////////////////////////////////
	    	  if(valor1.equals("a") && valor2.equals("k") 
		  	    || valor1.equals("k") && valor2.equals("a")
		  	    || valor1.equals("a") && valor2.equals("q")
		  	    || valor1.equals("q") && valor2.equals("a")
		  	    || valor1.equals("a") && valor2.equals("j")
		  	    || valor1.equals("j") && valor2.equals("a")
		  	    || valor1.equals("a") && valor2.equals("10")
		  	    || valor1.equals("10") && valor2.equals("a")
		  	    || valor1.equals("k") && valor2.equals("q")
		  	    || valor1.equals("q") && valor2.equals("k")
		  	    || valor1.equals("k") && valor2.equals("j")
		  	    || valor1.equals("j") && valor2.equals("k")
		  	    
		  	    ){
	    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
	    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS SIEMPRE");
	    		  rate.setRating(5);
	    		  
	    	  }else if(valor1.equals("q") && valor2.equals("j") 
	  		  	    || valor1.equals("j") && valor2.equals("q")
			  	    || valor1.equals("10") && valor2.equals("q")
			  	    || valor1.equals("q") && valor2.equals("10")
			  	    || valor1.equals("10") && valor2.equals("j")
			  	    || valor1.equals("j") && valor2.equals("10")
			  	    || valor1.equals("10") && valor2.equals("k")
			  	    || valor1.equals("k") && valor2.equals("10")
			  	    
			  	    ){
		    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
		    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS EN POSICION MEDIA Y TARDIA");
		    		  rate.setRating(4);
		    		  
	    	  }else if(valor1.equals("10") && valor2.equals("9") 
	  		  	    || valor1.equals("9") && valor2.equals("10")
	  		  	    || valor1.equals("9") && valor2.equals("8")
	  		  	    || valor1.equals("8") && valor2.equals("9")
	  		  	    || valor1.equals("7") && valor2.equals("8")
	  		  	    || valor1.equals("8") && valor2.equals("7")
	  		  	    || valor1.equals("7") && valor2.equals("9")
	  		  	    || valor1.equals("9") && valor2.equals("7")
	  		  	    || valor1.equals("10") && valor2.equals("8")
	  		  	    || valor1.equals("8") && valor2.equals("10")
  		  	    	|| valor1.equals("j") && valor2.equals("9")
  		  	    	|| valor1.equals("9") && valor2.equals("j")
  		  	    	|| valor1.equals("j") && valor2.equals("8")
		  	    	|| valor1.equals("8") && valor2.equals("j")
		  	    	|| valor1.equals("q") && valor2.equals("9")
  		  	    	|| valor1.equals("9") && valor2.equals("q")
  		  	    	|| valor1.equals("k") && valor2.equals("9")
		  	    	|| valor1.equals("9") && valor2.equals("k")
		  	    	|| valor1.equals("9") && valor2.equals("a")
		  	    	|| valor1.equals("a") && valor2.equals("9")
		  	    	|| valor1.equals("8") && valor2.equals("a")
		  	    	|| valor1.equals("a") && valor2.equals("8")
		  	    	|| valor1.equals("7") && valor2.equals("a")
		  	    	|| valor1.equals("a") && valor2.equals("7")
		  	    	
			  	    ){
	    		  resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
	    				  + "ESTAS CARTAS DEBERIAN SER JUGADAS EN POSICION SOLO TARDIA");
	    		  rate.setRating((float) 2.5);
	    	  }else{resultado.setText("Cartas: " + valor1 + " de " + palo1 + " y " + valor2 + " de " + palo2 + "\n"
				  + "ESTAS CARTAS NO DEBERIAN SER JUGADAS");
    	  		rate.setRating(1);
		    		  
	    	  }
	    	  
	      }
	}
	
	
	void llenarcartas(){
		
		if(palo1.equals("hear")){
	    	  if(valor1.equals("2")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts2);
	    	  }
	    	  if(valor1.equals("3")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(valor1.equals("4")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(valor1.equals("5")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(valor1.equals("6")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(valor1.equals("7")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(valor1.equals("8")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(valor1.equals("9")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(valor1.equals("10")){
	    		  boton1.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(valor1.equals("j")){
	    		  boton1.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(valor1.equals("q")){
	    		  boton1.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(valor1.equals("k")){
	    		  boton1.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(valor1.equals("a")){
	    		  boton1.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(palo1.equals("spad")){
	    	  
	    	  if(valor1.equals("2")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(valor1.equals("3")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(valor1.equals("4")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(valor1.equals("5")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(valor1.equals("6")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(valor1.equals("7")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(valor1.equals("8")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(valor1.equals("9")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(valor1.equals("10")){
	    		  boton1.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(valor1.equals("j")){
	    		  boton1.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(valor1.equals("q")){
	    		  boton1.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(valor1.equals("k")){
	    		  boton1.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(valor1.equals("a")){
	    		  boton1.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(palo1.equals("diam")){
	    	  
	    	  if(valor1.equals("2")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(valor1.equals("3")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(valor1.equals("4")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(valor1.equals("5")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(valor1.equals("6")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(valor1.equals("7")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(valor1.equals("8")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(valor1.equals("9")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(valor1.equals("10")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(valor1.equals("j")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(valor1.equals("q")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(valor1.equals("k")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(valor1.equals("a")){
	    		  boton1.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(palo1.equals("trev")){
	    	  
	    	  if(valor1.equals("2")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(valor1.equals("3")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(valor1.equals("4")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(valor1.equals("5")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(valor1.equals("6")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(valor1.equals("7")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(valor1.equals("8")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(valor1.equals("9")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(valor1.equals("10")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(valor1.equals("j")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(valor1.equals("q")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(valor1.equals("k")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(valor1.equals("a")){
	    		  boton1.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      } 
		
		
		
		
		
		if(palo2.equals("hear")){
	    	  if(valor2.equals("2")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts2);
	    	  }
	    	  if(valor2.equals("3")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts3);
	    	  }
	    	  if(valor2.equals("4")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts4);
	    	  }
	    	  if(valor2.equals("5")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts5);
	    	  }
	    	  if(valor2.equals("6")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts6);
	    	  }
	    	  if(valor2.equals("7")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts7);
	    	  }
	    	  if(valor2.equals("8")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts8);
	    	  }
	    	  if(valor2.equals("9")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts9);
	    	  }
	    	  if(valor2.equals("10")){
	    		  boton2.setBackgroundResource(R.drawable.cardhearts10);
	    	  }
	    	  if(valor2.equals("j")){
	    		  boton2.setBackgroundResource(R.drawable.cardheartsj);
	    	  }
	    	  if(valor2.equals("q")){
	    		  boton2.setBackgroundResource(R.drawable.cardheartsq);
	    	  }
	    	  if(valor2.equals("k")){
	    		  boton2.setBackgroundResource(R.drawable.cardheartsk);
	    	  }
	    	  if(valor2.equals("a")){
	    		  boton2.setBackgroundResource(R.drawable.cardheartsa);
	    	  }
	      }else if(palo2.equals("spad")){
	    	  
	    	  if(valor2.equals("2")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades2);
	    	  }
	    	  if(valor2.equals("3")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades3);
	    	  }
	    	  if(valor2.equals("4")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades4);
	    	  }
	    	  if(valor2.equals("5")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades5);
	    	  }
	    	  if(valor2.equals("6")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades6);
	    	  }
	    	  if(valor2.equals("7")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades7);
	    	  }
	    	  if(valor2.equals("8")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades8);
	    	  }
	    	  if(valor2.equals("9")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades9);
	    	  }
	    	  if(valor2.equals("10")){
	    		  boton2.setBackgroundResource(R.drawable.cardspades10);
	    	  }
	    	  if(valor2.equals("j")){
	    		  boton2.setBackgroundResource(R.drawable.cardspadesj);
	    	  }
	    	  if(valor2.equals("q")){
	    		  boton2.setBackgroundResource(R.drawable.cardspadesq);
	    	  }
	    	  if(valor2.equals("k")){
	    		  boton2.setBackgroundResource(R.drawable.cardspadesk);
	    	  }
	    	  if(valor2.equals("a")){
	    		  boton2.setBackgroundResource(R.drawable.cardspadesa);
	    	  }
	      }else if(palo2.equals("diam")){
	    	  
	    	  if(valor2.equals("2")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds2);
	    	  }
	    	  if(valor2.equals("3")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds3);
	    	  }
	    	  if(valor2.equals("4")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds4);
	    	  }
	    	  if(valor2.equals("5")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds5);
	    	  }
	    	  if(valor2.equals("6")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds6);
	    	  }
	    	  if(valor2.equals("7")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds7);
	    	  }
	    	  if(valor2.equals("8")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds8);
	    	  }
	    	  if(valor2.equals("9")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds9);
	    	  }
	    	  if(valor2.equals("10")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamonds10);
	    	  }
	    	  if(valor2.equals("j")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamondsj);
	    	  }
	    	  if(valor2.equals("q")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamondsq);
	    	  }
	    	  if(valor2.equals("k")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamondsk);
	    	  }
	    	  if(valor2.equals("a")){
	    		  boton2.setBackgroundResource(R.drawable.carddiamondsa);
	    	  }
	      }else if(palo2.equals("trev")){
	    	  
	    	  if(valor2.equals("2")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs2);
	    	  }
	    	  if(valor2.equals("3")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs3);
	    	  }
	    	  if(valor2.equals("4")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs4);
	    	  }
	    	  if(valor2.equals("5")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs5);
	    	  }
	    	  if(valor2.equals("6")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs6);
	    	  }
	    	  if(valor2.equals("7")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs7);
	    	  }
	    	  if(valor2.equals("8")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs8);
	    	  }
	    	  if(valor2.equals("9")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs9);
	    	  }
	    	  if(valor2.equals("10")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubs10);
	    	  }
	    	  if(valor2.equals("j")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubsj);
	    	  }
	    	  if(valor2.equals("q")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubsq);
	    	  }
	    	  if(valor2.equals("k")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubsk);
	    	  }
	    	  if(valor2.equals("a")){
	    		  boton2.setBackgroundResource(R.drawable.cardclubsa);
	    	  }
	      }
	}
}
