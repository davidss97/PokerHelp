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
			HeadsUp.win1text("100% -> " + rankingmano1 + " < " +rankingmano2 + " ----- " + orden1);
			HeadsUp.win2text("0%");
			
		}else if(rankingmano1>rankingmano2){
			HeadsUp.win1text("0% -> "+ rankingmano1 + " // " +rankingmano2+ " ----- " + orden1);
			HeadsUp.win2text("100%");
		}else{
			if(rankingmano1==1){
				if(empate1(m1,m2)==1){
					//Ganador mano1
					HeadsUp.win1text("100%");
					HeadsUp.win2text("0%");
				}else if(empate1(m1,m2)==2){
					//Ganador mano2
					HeadsUp.win1text("0%");
					HeadsUp.win2text("100%");
				}else{
					//Empate
					HeadsUp.win1text("50%");
					HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==2){
				if(empate2(m1,m2)==1){
					//Ganador mano1
					HeadsUp.win1text("100%");
					HeadsUp.win2text("0%");
				}else if(empate2(m1,m2)==2){
					//Ganador mano2
					HeadsUp.win1text("0%");
					HeadsUp.win2text("100%");
				}else{
					//Empate
					HeadsUp.win1text("50%");
					HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==3){
				if(empate3(m1,m2)==1){
					//Ganador mano1
					HeadsUp.win1text("100%");
					HeadsUp.win2text("0%");
				}else if(empate3(m1,m2)==2){
					//Ganador mano2
					HeadsUp.win1text("0%");
					HeadsUp.win2text("100%");
				}else{
					//Empate
					HeadsUp.win1text("50%");
					HeadsUp.win2text("50%");
				}
				
			}else if(rankingmano1==4){
				
			}else if(rankingmano1==5){
				
			}else if(rankingmano1==6){
				
			}else if(rankingmano1==7){
				
			}else if(rankingmano1==8){
				
			}else if(rankingmano1==9){
				
			}
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

		
		boolean trio = false;
		
		if(
				
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
			
			
		){trio=true;}
		
		int cuentaColor = 0;
		for(int i=1;i<7;i++){
			if(m[0].palo == m[i].palo){
				
				cuentaColor++;
				
			}
		}if(cuentaColor<4){
			cuentaColor=0;	
		for(int i=2;i<7;i++){
			if(m[1].palo == m[i].palo){
				
				cuentaColor++;
				
			}
		}}
		if(cuentaColor<4){
			cuentaColor=0;
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
			cuentaEscaleraNormal=0;
			for(int i=0;i<7;i++){
				if(m[1].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscaleraNormal=0;
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
		{
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 1;}//poker
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
		{
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 2;}
		//añadir valorPoker = m[3].palo
		
		else if(
				trio
				/*((m[0].numero==(m[1].numero)
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
				&& m[5].numero==(m[6].numero)))*/
		){//Si hay un trio pasara a mirar si hay un full house
			if(((m[0].numero==(m[1].numero)//1
				&& m[1].numero==(m[2].numero)))){
					if(m[3].numero==(m[4].numero)
						||m[4].numero==(m[5].numero)
						||m[5].numero==(m[6].numero))
					{
						cuentaColor = 0;
						cuentaEscColor = 0;
						cuentaEscaleraNormal = 0;
						return 3;
					}
			}else if(((m[1].numero==(m[2].numero)//2
					&& m[2].numero==(m[3].numero)))){
						if(m[4].numero==(m[5].numero)
							||m[5].numero==(m[6].numero))
						{
							cuentaColor = 0;
							cuentaEscColor = 0;
							cuentaEscaleraNormal = 0;
							return 3;
						}
			}else if(((m[2].numero==(m[3].numero)//3
					&& m[3].numero==(m[4].numero)))){
						if(m[5].numero==(m[6].numero)
								||m[0].numero==(m[1].numero))
						{
							cuentaColor = 0;
							cuentaEscColor = 0;
							cuentaEscaleraNormal = 0;
							return 3;
						}
			}else if(((m[3].numero==(m[4].numero)//4
					&& m[4].numero==(m[5].numero)))){
						if(m[0].numero==(m[1].numero)
								||m[1].numero==(m[2].numero))
						{
							cuentaColor = 0;
							cuentaEscColor = 0;
							cuentaEscaleraNormal = 0;
							return 3;
						}
			}else if(((m[4].numero==(m[5].numero)//4
					&& m[5].numero==(m[6].numero)))){
						if(m[0].numero==(m[1].numero)
								||m[1].numero==(m[2].numero)
								||m[2].numero==(m[3].numero))
						{
							cuentaColor = 0;
							cuentaEscColor = 0;
							cuentaEscaleraNormal = 0;
							return 3;
						}
			}
			
		}
		if(cuentaColor>=4){
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 4;
		}
		if(cuentaEscaleraNormal>=4){
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 5;
		}
		if(trio
				/*
				(m[0].numero==(m[1].numero)
				&& m[1].numero==(m[2].numero))
				||
				(m[1].numero==(m[2].numero)
				&& m[2].numero==(m[3].numero))
				||
				(m[2].numero==(m[3].numero)
				&& m[3].numero==(m[4].numero))
				||
				(m[3].numero==(m[4].numero)
				&& m[4].numero==(m[5].numero))
				||
				(m[4].numero==(m[5].numero)
				&& m[5].numero==(m[6].numero))*/
		){
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 6;
		}
		if(
				((m[0].numero==(m[1].numero)))
				||
				((m[1].numero==(m[2].numero)))
				||
				((m[2].numero==(m[3].numero)))
				||
				((m[3].numero==(m[4].numero)))
				||
				((m[4].numero==(m[5].numero)))
				||
				((m[4].numero==(m[5].numero)))
		){
			if(((m[0].numero==(m[1].numero)))){
				if(m[2].numero==(m[3].numero)
				||m[3].numero==(m[4].numero)
				||m[4].numero==(m[5].numero)
				||m[5].numero==(m[6].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}else if(((m[1].numero==(m[2].numero)))){
				if(m[3].numero==(m[4].numero)
				||m[4].numero==(m[5].numero)
				||m[5].numero==(m[6].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}else if(((m[2].numero==(m[3].numero)))){
				if(m[0].numero==(m[1].numero)
				||m[4].numero==(m[5].numero)
				||m[5].numero==(m[6].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}else if(((m[3].numero==(m[4].numero)))){
				if(m[0].numero==(m[1].numero)
				||m[1].numero==(m[2].numero)
				||m[5].numero==(m[6].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}else if(((m[4].numero==(m[5].numero)))){
				if(m[0].numero==(m[1].numero)
				||m[1].numero==(m[2].numero)
				||m[2].numero==(m[3].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}else if(((m[5].numero==(m[6].numero)))){
				if(m[0].numero==(m[1].numero)
				||m[1].numero==(m[2].numero)
				||m[2].numero==(m[3].numero)
				||m[3].numero==(m[4].numero))
				{
					cuentaColor = 0;
					cuentaEscColor = 0;
					cuentaEscaleraNormal = 0;
					return 7;
				}	
			}
		}if(
				((m[0].numero==(m[1].numero)))
				||
				((m[1].numero==(m[2].numero)))
				||
				((m[2].numero==(m[3].numero)))
				||
				((m[3].numero==(m[4].numero)))
				||
				((m[4].numero==(m[5].numero)))
				||
				((m[4].numero==(m[5].numero)))
		){
			cuentaColor = 0;
			cuentaEscColor = 0;
			cuentaEscaleraNormal = 0;
			return 8;
		}
		cuentaColor = 0;
		cuentaEscColor = 0;
		cuentaEscaleraNormal = 0;
		return 9;
		
	}
	public int empate1(carta[] m1, carta[] m2){
		int ultimovalor1 = 0;
		int cuentaEscColor1 = 0;
		for(int i=0;i<7;i++){
			if(m1[0].numero==m1[i].numero-(cuentaEscColor1+1)
			   && m1[0].palo == m1[i].palo){
				
				cuentaEscColor1++;
				ultimovalor1 = m1[i].numero;
			}
		}
		if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=0;i<7;i++){
				if(m1[1].numero==m1[i].numero-(cuentaEscColor1+1)
				   && m1[1].palo == m1[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m1[i].numero;
					
				}
			}
		}
		if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=0;i<7;i++){
				if(m1[2].numero==m1[i].numero-(cuentaEscColor1+1)
				   && m1[2].palo == m1[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m1[i].numero;
					
				}
			}
		}
		////////////////////////////////////////////////////////
		int ultimovalor2 = 0;
		int cuentaEscColor2 = 0;
		for(int i=0;i<7;i++){
			if(m2[0].numero==m2[i].numero-(cuentaEscColor2+1)
			   && m2[0].palo == m2[i].palo){
				
				cuentaEscColor2++;
				ultimovalor2 = m2[i].numero;
			}
		}
		if(cuentaEscColor2<4){
			cuentaEscColor2=0;
			for(int i=0;i<7;i++){
				if(m2[1].numero==m2[i].numero-(cuentaEscColor2+1)
				   && m2[1].palo == m2[i].palo){
					
					cuentaEscColor2++;
					ultimovalor2 = m2[i].numero;
					
				}
			}
		}
		if(cuentaEscColor2<4){
			cuentaEscColor2=0;
			for(int i=0;i<7;i++){
				if(m2[2].numero==m2[i].numero-(cuentaEscColor2+1)
				   && m2[2].palo == m2[i].palo){
					
					cuentaEscColor2++;
					ultimovalor2 = m2[i].numero;
					
				}
			}
		}
		if(ultimovalor1>ultimovalor2){
			return 1;
		}else if(ultimovalor1<ultimovalor2){
			return 2;
		}else{
			return 0;
		}
	}
	public int empate2(carta[] m1, carta[] m2){
		if(m1[3].numero>m2[3].numero){
			return 1;
		}else if(m1[3].numero<m2[3].numero){
			return 2;
		}else{
			if(m1[6].numero>m2[6].numero
				&& m1[6].numero!=m1[3].numero	){
				return 1;
			}else if(m1[6].numero<m2[6].numero
				&& m2[6].numero!=m1[3].numero	){
				return 2;
			}else if(m1[6].numero==m2[6].numero
				&& m2[6].numero!=m1[3].numero	){
				return 0;
			}
			
			if(m1[5].numero>m2[5].numero
				&& m1[5].numero!=m1[3].numero	){
				return 1;
			}else if(m1[5].numero<m2[5].numero
				&& m2[5].numero!=m1[3].numero	){
				return 2;
			}else if(m1[5].numero==m2[5].numero
				&& m1[5].numero!=m1[3].numero	){
				return 0;
			}
			
			if(m1[4].numero>m2[4].numero
				&& m1[4].numero!=m1[3].numero	){
				return 1;
			}else if(m1[4].numero<m2[4].numero
				&& m2[4].numero!=m1[3].numero	){
				return 2;
			}else if(m1[4].numero==m2[4].numero
				&& m1[4].numero!=m1[3].numero	){
				return 0;
			}
			
			if(m1[2].numero>m2[2].numero
				&& m1[2].numero!=m1[3].numero	){
				return 1;
			}else if(m1[2].numero<m2[2].numero
				&& m2[2].numero!=m1[3].numero	){
				return 2;
			}else if(m1[2].numero==m2[2].numero
				&& m1[2].numero!=m1[3].numero	){
				return 0;
			}//solo hasta m1[2] porque sera la unica relevante(la mayor) cuando el poker sea de cartas superiores
			else{
				return 0; 
			}
			
		}
		
	}
	public int empate3(carta[] m1, carta[] m2){
		int valorTrio1=0;
		int valorTrio2=0;
		int valorPar1=0;
		int valorPar2=0;
		if(
			((m1[2].numero==(m1[3].numero)
			&& m1[3].numero==(m1[4].numero)))
			||
			((m1[3].numero==(m1[4].numero)
			&& m1[4].numero==(m1[5].numero)))
			||
			((m1[4].numero==(m1[5].numero)
			&& m1[5].numero==(m1[6].numero)))
			
		){
				
			valorTrio1 = m1[4].numero;
		}else if(
			((m1[0].numero==(m1[1].numero)//Cambiar a sentido contrario para calcular primero trio alto (?)
			&& m1[1].numero==(m1[2].numero)))
			||
			((m1[1].numero==((m1[2].numero))
			&& m1[2].numero==((m1[3].numero))))
		){
			valorTrio1 = m1[2].numero;
		}
		
		if(
			((m2[2].numero==(m2[3].numero)
			&& m2[3].numero==(m2[4].numero)))
			||
			((m2[3].numero==(m2[4].numero)
			&& m2[4].numero==(m2[5].numero)))
			||
			((m2[4].numero==(m2[5].numero)
			&& m2[5].numero==(m2[6].numero)))
		){
				
			valorTrio2 = m2[4].numero;
		}else if(
			((m2[0].numero==(m2[1].numero)
			&& m2[1].numero==(m2[2].numero)))
			||
			((m2[1].numero==((m2[2].numero))
			&& m2[2].numero==((m2[3].numero))))
		){
			valorTrio2 = m2[2].numero;
		}
		
		if(valorTrio1>valorTrio2){
			return 1;
		}else if(valorTrio1<valorTrio2){
			return 2;
		}else{
			if ((m1[6].numero==m1[5].numero
				||m1[5].numero==m1[4].numero)
				&&m1[5].numero!=valorTrio1){
				valorPar1=m1[5].numero;
			}else if ((m1[4].numero==m1[3].numero
				||m1[3].numero==m1[2].numero)
				&&m1[3].numero!=valorTrio1){
				valorPar1=m1[3].numero;
			}
			else if ((m1[2].numero==m1[1].numero
				||m1[1].numero==m1[0].numero)
				&&m1[1].numero!=valorTrio1){
				valorPar1=m1[1].numero;
			}
			if(valorPar1>valorPar2){
				return 1;
			}else if(valorPar1<valorPar2){
				return 2;
			}else{
				return 0;
			}
			
			//[...]
			
		}
	}
}
