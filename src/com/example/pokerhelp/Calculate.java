package com.example.pokerhelp;

import java.util.Timer;
import java.util.TimerTask;

public class Calculate {
	static int a=0;
	int rankingmano1;
	int rankingmano2;
	int valor1;
	Calculate(carta[] m1, carta[] m2){
		
		m1 = Ordenar(m1);
		m2 = Ordenar(m2);
		
		
		String orden1 =  m1[0].numero + " " + m1[1].numero  + " " + m1[2].numero  + " " + m1[3].numero  + " " + m1[4].numero  + " " + m1[5].numero  + " " + m1[6].numero;
		
		
		rankingmano1 = ranking(m1);
		rankingmano2 = ranking(m2);
		//1: E. Color 
		//2: poker 
		//3: full
		//4: color
		//5: escalera
		//6: trio 
		//7: dobles
		//8: pareja
		//9: alta
		
		if(rankingmano1<rankingmano2){
			HeadsUp.win1text("mano ganadora: escalera color " + rankingmano1 + " < " +rankingmano2 + " ----- " + orden1);
		}else{
			HeadsUp.win1text("mano NO ganadora "+ rankingmano1 + " // " +rankingmano2+ " ----- " + orden1);
		}
		
		/*	
		new Timer().schedule(new TimerTask() {          
		    @Override
		    public void run() {
		    	if(a<=100){
				HeadsUp.setProgreso(a);
				a++;
		    	}
		    }
		}, 50);*/
		
	}
	public carta[] Ordenar(carta[] m){
		for(int a =0;a<7;a++){
			carta aux;
			
			
			if( m[0].numero > m[1].numero) {
				aux = m[0];
				m[0] = m[1];
				m[1] = aux;
			}if( m[1].numero > m[2].numero) {
				aux = m[1];
				m[1] = m[2];
				m[2] = aux;
			}if( m[2].numero > m[3].numero) {
				aux = m[2];
				m[2] = m[3];
				m[3] = aux;
			}if( m[3].numero > m[4].numero) {
				aux = m[3];
				m[3] = m[4];
				m[4] = aux;
			}if( m[4].numero > m[5].numero) {
				aux = m[4];
				m[4] = m[5];
				m[5] = aux;
			}if( m[5].numero > m[6].numero) {
				aux = m[5];
				m[5] = m[6];
				m[6] = aux;
			}
			
			if(a<6){//cambiar de posicion parejas para poder calcular escaleras y colores o modificar como buscar la escalera***
				if( m[a].numero == m[a+1].numero) {
					if( a < 5){
					if( m[a].palo == m[a+2].palo) {
						aux = m[a];
						m[a] = m[a+1];
						m[a+1] = aux;
					}}
					if(a>=5){
					if( m[a].palo == m[a-2].palo) {
						aux = m[a];
						m[a] = m[a-1];
						m[a-1] = aux;
					}}		
					
				}
			}	
			
		}
		return m;
	}
	public int ranking(carta[] m){
		boolean color = false;
		int cuentaColor = 0;
		for(int i=1;i<7;i++){
			if(m[0].palo == m[i].palo){
				
				cuentaColor++;
				
			}
		}if(cuentaColor<4){
		for(int i=2;i<7;i++){
			if(m[1].palo == m[i].palo){
				
				cuentaColor++;
				
			}
		}}
		if(cuentaColor<4){
		for(int i=3;i<7;i++){
			if(m[2].palo == m[i].palo){
				
				cuentaColor++;
				
			}
		}}
		
		/////////////////////////////////////////////////
		int cuentaEscColor = 0;
		for(int i=0;i<7;i++){
			if(m[0].numero==m[i].numero-(cuentaEscColor+1)
			   && m[0].palo == m[i].palo){
				
				cuentaEscColor++;
				
			}
		}
		if(cuentaEscColor<4){
			cuentaEscColor=0;
			for(int i=0;i<7;i++){
				if(m[1].numero==m[i].numero-(cuentaEscColor+1)
				   && m[1].palo == m[i].palo){
					
					cuentaEscColor++;
					
				}
			}
		}
		if(cuentaEscColor<4){
			cuentaEscColor=0;
			for(int i=0;i<7;i++){
				if(m[2].numero==m[i].numero-(cuentaEscColor+1)
				   && m[2].palo == m[i].palo){
					
					cuentaEscColor++;
					
				}
			}
		}
		/////////////////////////////////
		int cuentaEscaleraNormal =0;
		for(int i=0;i<7;i++){
			if(m[0].numero==m[i].numero-(cuentaEscaleraNormal+1)){
				
				cuentaEscaleraNormal++;
				
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscColor=0;
			for(int i=0;i<7;i++){
				if(m[1].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscColor=0;
			for(int i=0;i<7;i++){
				if(m[2].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		
		
		if(
				/*((m[0].numero==(m[1].numero-1)
				&& m[1].numero==(m[2].numero-1)
				&& m[2].numero==(m[3].numero-1)
				&& m[3].numero==(m[4].numero-1))
				&&
				(m[0].palo==m[1].palo
				&& m[1].palo==m[2].palo
				&& m[2].palo==m[3].palo
				&& m[3].palo==m[4].palo))
				||
				((m[1].numero==((m[2].numero)-1)
				&& m[2].numero==((m[3].numero)-1)
				&& m[3].numero==((m[4].numero)-1)
				&& m[4].numero==((m[5].numero)-1))
				&&
				(m[1].palo==m[2].palo
				&& m[2].palo==m[3].palo
				&& m[3].palo==m[4].palo
				&& m[4].palo==m[5].palo))
				||
				((m[2].numero==(m[3].numero-1)
				&& m[3].numero==(m[4].numero-1)
				&& m[4].numero==(m[5].numero-1)
				&& m[5].numero==(m[6].numero-1))
				&&
				(m[2].palo==m[3].palo
				&& m[3].palo==m[4].palo
				&& m[4].palo==m[5].palo
				&& m[5].palo==m[6].palo))*/
				
				cuentaEscColor>=4
				
				)
		{return 1;}//poker
		else if(
				((m[0].numero==(m[1].numero)
				&& m[1].numero==(m[2].numero)
				&& m[2].numero==(m[3].numero)))
				||
				((m[1].numero==((m[2].numero))
				&& m[2].numero==((m[3].numero))
				&& m[3].numero==((m[4].numero))))
				||
				((m[2].numero==(m[3].numero)
				&& m[3].numero==(m[4].numero)
				&& m[4].numero==(m[5].numero)))
				||
				((m[3].numero==(m[4].numero)
				&& m[4].numero==(m[5].numero)
				&& m[5].numero==(m[6].numero)))
				)
		{return 2;}
		//a�adir valorPoker = m[3].palo
		
		else if(
				((m[0].numero==(m[1].numero)
				&& m[1].numero==(m[2].numero)))
				||
				((m[1].numero==((m[2].numero))
				&& m[2].numero==((m[3].numero))))
				||
				((m[2].numero==(m[3].numero)
				&& m[3].numero==(m[4].numero)))
				||
				((m[3].numero==(m[4].numero)
				&& m[4].numero==(m[5].numero)))
				||
				((m[4].numero==(m[5].numero)
				&& m[5].numero==(m[6].numero)))
		){//Si hay un trio pasara a mirar si hay un full house
			if(((m[0].numero==(m[1].numero)//1
				&& m[1].numero==(m[2].numero)))){
					if(m[3].numero==(m[4].numero)
						||m[4].numero==(m[5].numero)
						||m[5].numero==(m[6].numero))
					{
						return 3;
					}
			}else if(((m[1].numero==(m[2].numero)//2
					&& m[2].numero==(m[3].numero)))){
						if(m[4].numero==(m[5].numero)
							||m[5].numero==(m[6].numero))
						{
							return 3;
						}
			}else if(((m[2].numero==(m[3].numero)//3
					&& m[3].numero==(m[4].numero)))){
						if(m[5].numero==(m[6].numero)
								||m[0].numero==(m[1].numero))
						{
							return 3;
						}
			}else if(((m[3].numero==(m[4].numero)//4
					&& m[4].numero==(m[5].numero)))){
						if(m[0].numero==(m[1].numero)
								||m[1].numero==(m[2].numero))
						{
							return 3;
						}
			}else if(((m[4].numero==(m[5].numero)//4
					&& m[5].numero==(m[6].numero)))){
						if(m[0].numero==(m[1].numero)
								||m[1].numero==(m[2].numero)
								||m[2].numero==(m[3].numero))
						{
							return 3;
						}
			}
			
		}else if(cuentaColor>=4){
			return 4;
		}else if(cuentaEscaleraNormal>=4){
			return 5;
		}
		
		return 10;
		
	}
}
