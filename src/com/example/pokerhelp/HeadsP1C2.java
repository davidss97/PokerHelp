package com.example.pokerhelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HeadsP1C2 extends Activity{
	Button clubs2;
	Button clubs3;
	Button clubs4;
	Button clubs5;
	Button clubs6;
	Button clubs7;
	Button clubs8;
	Button clubs9;
	Button clubs10;
	Button clubsj;
	Button clubsq;
	Button clubsk;
	Button clubsa;
	//////////////////////////////////////////
	Button diamonds2;
	Button diamonds3;
	Button diamonds4;
	Button diamonds5;
	Button diamonds6;
	Button diamonds7;
	Button diamonds8;
	Button diamonds9;
	Button diamonds10;
	Button diamondsj;
	Button diamondsq;
	Button diamondsk;
	Button diamondsa;
	//////////////////////////////////////////
	Button spades2;
	Button spades3;
	Button spades4;
	Button spades5;
	Button spades6;
	Button spades7;
	Button spades8;
	Button spades9;
	Button spades10;
	Button spadesj;
	Button spadesq;
	Button spadesk;
	Button spadesa;
	//////////////////////////////////////////
	Button hearts2;
	Button hearts3;
	Button hearts4;
	Button hearts5;
	Button hearts6;
	Button hearts7;
	Button hearts8;
	Button hearts9;
	Button hearts10;
	Button heartsj;
	Button heartsq;
	Button heartsk;
	Button heartsa;
	//////////////////////////////////////////
	public String palo1;
	public String valor1;
	
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.firstcard);
	      clubs2 = (Button)findViewById(R.id.clubs2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "2";
	    		  Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
	    		  
		  }});
	      
	      clubs3 = (Button)findViewById(R.id.clubs3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs4 = (Button)findViewById(R.id.clubs4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs5 = (Button)findViewById(R.id.clubs5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs6 = (Button)findViewById(R.id.clubs6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs7 = (Button)findViewById(R.id.clubs7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs8 = (Button)findViewById(R.id.clubs8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs9 = (Button)findViewById(R.id.clubs9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubs10 = (Button)findViewById(R.id.clubs10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubsj = (Button)findViewById(R.id.clubsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubsq = (Button)findViewById(R.id.clubsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubsk = (Button)findViewById(R.id.clubsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      clubsa = (Button)findViewById(R.id.clubsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      //////////////////////////////////////////////////////////////////////////  
	      diamonds2 = (Button)findViewById(R.id.diamonds2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "2";
	    		  Toast.makeText(getApplicationContext(), "2 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds3 = (Button)findViewById(R.id.diamonds3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds4 = (Button)findViewById(R.id.diamonds4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds5 = (Button)findViewById(R.id.diamonds5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds6 = (Button)findViewById(R.id.diamonds6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de trevoles", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds7 = (Button)findViewById(R.id.diamonds7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds8 = (Button)findViewById(R.id.diamonds8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds9 = (Button)findViewById(R.id.diamonds9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamonds10 = (Button)findViewById(R.id.diamonds10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamondsj = (Button)findViewById(R.id.diamondsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamondsq = (Button)findViewById(R.id.diamondsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamondsk = (Button)findViewById(R.id.diamondsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      diamondsa = (Button)findViewById(R.id.diamondsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de diamantes", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      ////////////////////////////////////////////////////////////////////////// 
	      spades2 = (Button)findViewById(R.id.spades2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "2";
	    		  Toast.makeText(getApplicationContext(), "2 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades3 = (Button)findViewById(R.id.spades3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades4 = (Button)findViewById(R.id.spades4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades5 = (Button)findViewById(R.id.spades5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades6 = (Button)findViewById(R.id.spades6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades7 = (Button)findViewById(R.id.spades7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades8 = (Button)findViewById(R.id.spades8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades9 = (Button)findViewById(R.id.spades9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spades10 = (Button)findViewById(R.id.spades10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spadesj = (Button)findViewById(R.id.spadesj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spadesq = (Button)findViewById(R.id.spadesq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spadesk = (Button)findViewById(R.id.spadesk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      spadesa = (Button)findViewById(R.id.spadesa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de picas", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      ////////////////////////////////////////////////////////////////////////// 
	      hearts2 = (Button)findViewById(R.id.hearts2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "2";
	    		  Toast.makeText(getApplicationContext(), "2 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts3 = (Button)findViewById(R.id.hearts3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts4 = (Button)findViewById(R.id.hearts4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts5 = (Button)findViewById(R.id.hearts5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts6 = (Button)findViewById(R.id.hearts6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts7 = (Button)findViewById(R.id.hearts7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts8 = (Button)findViewById(R.id.hearts8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts9 = (Button)findViewById(R.id.hearts9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      hearts10 = (Button)findViewById(R.id.hearts10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      heartsj = (Button)findViewById(R.id.heartsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      heartsq = (Button)findViewById(R.id.heartsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      heartsk = (Button)findViewById(R.id.heartsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      
	      heartsa = (Button)findViewById(R.id.heartsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de corazones", Toast.LENGTH_SHORT).show();

	    		 
	    		  HeadsUp.P1C2palo=palo1;
	    		  HeadsUp.P1C2valor=valor1; Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i);
	    		  
		  }});
	      ////////////////////////////////////////////////////////////////////////// 
	}
}
