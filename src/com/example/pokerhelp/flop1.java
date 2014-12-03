package com.example.pokerhelp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class flop1 extends Activity{
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
	      overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	      setContentView(R.layout.firstcard);
	      clubs2 = (Button)findViewById(R.id.clubs2);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs2.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "2";
	    		  Toast.makeText(getApplicationContext(), "2 de trevoles", Toast.LENGTH_SHORT).show();
	    		  
	    		  HeadsUp.F1 = new carta(2,2);HeadsUp.cambiarf1(R.drawable.cardclubs2);
	    		  //HeadsUp.F1 = new carta(3,);HeadsUp.cambiarf1(R.drawable.cardclubs2);
	    		  finish();
	    		  
	    		  
		  }});
	      
	      clubs3 = (Button)findViewById(R.id.clubs3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de trevoles", Toast.LENGTH_SHORT).show();

	    		  HeadsUp.F1 = new carta(2,3);HeadsUp.cambiarf1(R.drawable.cardclubs3);
	    		  
	    		  //HeadsUp.F1 = new carta(3,);HeadsUp.cambiarf1(R.drawable.cardclubs3);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs4 = (Button)findViewById(R.id.clubs4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,4);HeadsUp.cambiarf1(R.drawable.cardclubs4);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs5 = (Button)findViewById(R.id.clubs5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,5);HeadsUp.cambiarf1(R.drawable.cardclubs5);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs6 = (Button)findViewById(R.id.clubs6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,6);HeadsUp.cambiarf1(R.drawable.cardclubs6);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs7 = (Button)findViewById(R.id.clubs7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,7);HeadsUp.cambiarf1(R.drawable.cardclubs7);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs8 = (Button)findViewById(R.id.clubs8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,8);HeadsUp.cambiarf1(R.drawable.cardclubs8);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs9 = (Button)findViewById(R.id.clubs9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,9);HeadsUp.cambiarf1(R.drawable.cardclubs9);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubs10 = (Button)findViewById(R.id.clubs10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubs10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,10);HeadsUp.cambiarf1(R.drawable.cardclubs10);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubsj = (Button)findViewById(R.id.clubsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,11);HeadsUp.cambiarf1(R.drawable.cardclubsj);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubsq = (Button)findViewById(R.id.clubsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,12);HeadsUp.cambiarf1(R.drawable.cardclubsq);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubsk = (Button)findViewById(R.id.clubsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,13);HeadsUp.cambiarf1(R.drawable.cardclubsk);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      clubsa = (Button)findViewById(R.id.clubsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      clubsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "trev";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(2,14);HeadsUp.cambiarf1(R.drawable.cardclubsa);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
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

	    		  
	    		  HeadsUp.F1 = new carta(4,2);HeadsUp.cambiarf1(R.drawable.carddiamonds2);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds3 = (Button)findViewById(R.id.diamonds3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,3);HeadsUp.cambiarf1(R.drawable.carddiamonds3);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds4 = (Button)findViewById(R.id.diamonds4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,4);HeadsUp.cambiarf1(R.drawable.carddiamonds4);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds5 = (Button)findViewById(R.id.diamonds5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,5);HeadsUp.cambiarf1(R.drawable.carddiamonds5);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds6 = (Button)findViewById(R.id.diamonds6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de trevoles", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,6);HeadsUp.cambiarf1(R.drawable.carddiamonds6);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds7 = (Button)findViewById(R.id.diamonds7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,7);HeadsUp.cambiarf1(R.drawable.carddiamonds7);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds8 = (Button)findViewById(R.id.diamonds8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,8);HeadsUp.cambiarf1(R.drawable.carddiamonds8);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds9 = (Button)findViewById(R.id.diamonds9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,9);HeadsUp.cambiarf1(R.drawable.carddiamonds9);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamonds10 = (Button)findViewById(R.id.diamonds10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamonds10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,10);HeadsUp.cambiarf1(R.drawable.carddiamonds10);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamondsj = (Button)findViewById(R.id.diamondsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,11);HeadsUp.cambiarf1(R.drawable.carddiamondsj);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamondsq = (Button)findViewById(R.id.diamondsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,12);HeadsUp.cambiarf1(R.drawable.carddiamondsq);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamondsk = (Button)findViewById(R.id.diamondsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,13);HeadsUp.cambiarf1(R.drawable.carddiamondsk);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      diamondsa = (Button)findViewById(R.id.diamondsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      diamondsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "diam";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de diamantes", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(4,14);HeadsUp.cambiarf1(R.drawable.carddiamondsa);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
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

	    		  
	    		  HeadsUp.F1 = new carta(1,2);HeadsUp.cambiarf1(R.drawable.cardspades2);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades3 = (Button)findViewById(R.id.spades3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,3);HeadsUp.cambiarf1(R.drawable.cardspades3);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades4 = (Button)findViewById(R.id.spades4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,4);HeadsUp.cambiarf1(R.drawable.cardspades4);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades5 = (Button)findViewById(R.id.spades5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,5);HeadsUp.cambiarf1(R.drawable.cardspades5);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades6 = (Button)findViewById(R.id.spades6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,6);HeadsUp.cambiarf1(R.drawable.cardspades6);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades7 = (Button)findViewById(R.id.spades7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,7);HeadsUp.cambiarf1(R.drawable.cardspades7);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades8 = (Button)findViewById(R.id.spades8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,8);HeadsUp.cambiarf1(R.drawable.cardspades8);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades9 = (Button)findViewById(R.id.spades9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,9);HeadsUp.cambiarf1(R.drawable.cardspades9);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spades10 = (Button)findViewById(R.id.spades10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spades10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,10);HeadsUp.cambiarf1(R.drawable.cardspades10);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spadesj = (Button)findViewById(R.id.spadesj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,11);HeadsUp.cambiarf1(R.drawable.cardspadesj);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spadesq = (Button)findViewById(R.id.spadesq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,12);HeadsUp.cambiarf1(R.drawable.cardspadesq);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spadesk = (Button)findViewById(R.id.spadesk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,13);HeadsUp.cambiarf1(R.drawable.cardspadesk);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      spadesa = (Button)findViewById(R.id.spadesa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      spadesa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "spad";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de picas", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(1,14);HeadsUp.cambiarf1(R.drawable.cardspadesa);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
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

	    		  
	    		  HeadsUp.F1 = new carta(3,2);HeadsUp.cambiarf1(R.drawable.cardhearts2);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts3 = (Button)findViewById(R.id.hearts3);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts3.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "3";
	    		  Toast.makeText(getApplicationContext(), "3 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,3);HeadsUp.cambiarf1(R.drawable.cardhearts3);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts4 = (Button)findViewById(R.id.hearts4);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts4.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "4";
	    		  Toast.makeText(getApplicationContext(), "4 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,4);HeadsUp.cambiarf1(R.drawable.cardhearts4);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts5 = (Button)findViewById(R.id.hearts5);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts5.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "5";
	    		  Toast.makeText(getApplicationContext(), "5 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,5);HeadsUp.cambiarf1(R.drawable.cardhearts5);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts6 = (Button)findViewById(R.id.hearts6);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts6.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "6";
	    		  Toast.makeText(getApplicationContext(), "6 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,6);HeadsUp.cambiarf1(R.drawable.cardhearts6);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts7 = (Button)findViewById(R.id.hearts7);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts7.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "7";
	    		  Toast.makeText(getApplicationContext(), "7 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,7);HeadsUp.cambiarf1(R.drawable.cardhearts7);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts8 = (Button)findViewById(R.id.hearts8);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts8.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "8";
	    		  Toast.makeText(getApplicationContext(), "8 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,8);HeadsUp.cambiarf1(R.drawable.cardhearts8);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts9 = (Button)findViewById(R.id.hearts9);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts9.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "9";
	    		  Toast.makeText(getApplicationContext(), "9 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,9);HeadsUp.cambiarf1(R.drawable.cardhearts9);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      hearts10 = (Button)findViewById(R.id.hearts10);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      hearts10.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "10";
	    		  Toast.makeText(getApplicationContext(), "10 de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,10);HeadsUp.cambiarf1(R.drawable.cardhearts10);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      heartsj = (Button)findViewById(R.id.heartsj);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsj.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "j";
	    		  Toast.makeText(getApplicationContext(), "J de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,11);HeadsUp.cambiarf1(R.drawable.cardheartsj);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      heartsq = (Button)findViewById(R.id.heartsq);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsq.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "q";
	    		  Toast.makeText(getApplicationContext(), "Q de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,12);HeadsUp.cambiarf1(R.drawable.cardheartsq);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      heartsk = (Button)findViewById(R.id.heartsk);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsk.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "k";
	    		  Toast.makeText(getApplicationContext(), "K de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,13);HeadsUp.cambiarf1(R.drawable.cardheartsk);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      
	      heartsa = (Button)findViewById(R.id.heartsa);
	      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
	      heartsa.setOnClickListener(new Button.OnClickListener(){
	    	  @Override
	    	  public void onClick(View arg0) {
	    		  palo1 = "hear";
	    		  valor1 = "a";
	    		  Toast.makeText(getApplicationContext(), "A de corazones", Toast.LENGTH_SHORT).show();

	    		  
	    		  HeadsUp.F1 = new carta(3,14);HeadsUp.cambiarf1(R.drawable.cardheartsa);
	    		  finish();//Intent i = new Intent(getApplicationContext(), HeadsUp.class); startActivity(i); overridePendingTransition(R.anim.fadein, R.anim.fadeout);
	    		  
		  }});
	      ////////////////////////////////////////////////////////////////////////// 
	}
}
