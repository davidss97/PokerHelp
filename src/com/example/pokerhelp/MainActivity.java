package com.example.pokerhelp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button preflop;
	Button flop;
	Button turn;
	Button river;
	Button image;
	Button heads;
	
	//final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.fragment_main);
      preflop = (Button)findViewById(R.id.preflop);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      preflop.setOnClickListener(new Button.OnClickListener(){
    	  @Override
    	  public void onClick(View arg0) {
    		  Intent i = new Intent(getApplicationContext(), preflopfirstcard.class);
    		  startActivity(i);
	  }});
      
      heads = (Button)findViewById(R.id.button1);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      heads.setOnClickListener(new Button.OnClickListener(){
    	  @Override
    	  public void onClick(View arg0) {
    		  Intent i = new Intent(getApplicationContext(), HeadsUp.class);
    		  startActivity(i);
	  }});
      
      flop = (Button)findViewById(R.id.flop);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      flop.setOnClickListener(new Button.OnClickListener(){
    	  @Override
    	  public void onClick(View arg0) {
    		  Toast.makeText(getApplicationContext(), "In development", Toast.LENGTH_SHORT).show();
	  }});
      
      turn = (Button)findViewById(R.id.turn);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      turn.setOnClickListener(new Button.OnClickListener(){
    	  @Override
    	  public void onClick(View arg0) {
    		  Toast.makeText(getApplicationContext(), "In development", Toast.LENGTH_SHORT).show();
	  }});
      
      river = (Button)findViewById(R.id.river);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      river.setOnLongClickListener(new Button.OnLongClickListener(){
    	  @Override
    	  public boolean onLongClick(View arg0) {
    		  //Toast.makeText(getApplicationContext(), "In development", Toast.LENGTH_SHORT).show();
    		  Intent i = new Intent(getApplicationContext(), Image.class);
    		  startActivity(i);
    		  return true;
	  }});
      
      /*image = (Button)findViewById(R.id.diamonds8);
      //animRotate = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
      image.setOnClickListener(new Button.OnClickListener(){
    	  @Override
    	  public void onClick(View arg0) {
    		  Intent i = new Intent(getApplicationContext(), Image.class);
    		  startActivity(i);
	  }});*/
    }
}