package com.example.pokerhelp;

import android.widget.Toast;

public class Calculate {
	static int a=0;
	int rankingmano1;
	int rankingmano2;
	int valor1;
	Calculate(){}
	public int Calculator(carta[] m1, carta[] m2){
		
		int b = m1[5].numero;
		
		m1 = Ordenar(m1);//solo llega jhasta m[5]
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
			return 1;
			//HeadsUp.win1text("100% -> " + rankingmano1 + " < " +rankingmano2 + " ----- " + orden1);
			//HeadsUp.win2text("0%");
			
		}else if(rankingmano1>rankingmano2){
			return 2;
			//HeadsUp.win1text("0% -> "+ rankingmano1 + " // " +rankingmano2+ " ----- " + orden1);
			//HeadsUp.win2text("100%");
		}else{
			if(rankingmano1==1){
				if(empate1(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate1(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==2){
				if(empate2(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate2(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==3){
				if(empate3(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate3(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==4){
				if(empate4(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate4(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==5){
				if(empate5(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate5(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==6){
				if(empate6(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate6(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==7){
				if(empate7(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate7(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==8){
				if(empate8(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate8(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else if(rankingmano1==9){
				if(empate9(m1,m2)==1){
					//Ganador mano1
					return 1;
					//HeadsUp.win1text("100%");
					//HeadsUp.win2text("0%");
				}else if(empate9(m1,m2)==2){
					//Ganador mano2
					return 2;
					//HeadsUp.win1text("0%");
					//HeadsUp.win2text("100%");
				}else{
					//Empate
					return 0;
					//HeadsUp.win1text("50%");
					//HeadsUp.win2text("50%");
				}
			}else{
				return 0;
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
			
			if(a<6){
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
		if(m[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m[i].numero-(cuentaEscColor+1)
						   && m[6].palo == m[i].palo){
					
					cuentaEscColor++;
				}
			}
		}if(cuentaEscColor<4){
			cuentaEscColor=0;
			for(int i=1;i<7;i++){
				if(m[0].numero==m[i].numero-(cuentaEscColor+1)
				   && m[0].palo == m[i].palo){
					
					cuentaEscColor++;
					
				}
			}
		}
		if(cuentaEscColor<4){
			cuentaEscColor=0;
			for(int i=2;i<7;i++){
				if(m[1].numero==m[i].numero-(cuentaEscColor+1)
				   && m[1].palo == m[i].palo){
					
					cuentaEscColor++;
					
				}
			}
		}
		if(cuentaEscColor<4){
			cuentaEscColor=0;
			for(int i=3;i<7;i++){
				if(m[2].numero==m[i].numero-(cuentaEscColor+1)
				   && m[2].palo == m[i].palo){
					
					cuentaEscColor++;
					
				}
			}
		}
		/////////////////////////////////
		int cuentaEscaleraNormal =0;
		if(m[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscaleraNormal=0;
			for(int i=1;i<7;i++){
				if(m[0].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscaleraNormal=0;
			for(int i=2;i<7;i++){
				if(m[1].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		if(cuentaEscaleraNormal<4){
			cuentaEscaleraNormal=0;
			for(int i=3;i<7;i++){
				if(m[2].numero==m[i].numero-(cuentaEscaleraNormal+1)){
					
					cuentaEscaleraNormal++;
					
				}
			}
		}
		
		
		if(
				
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
		//a�adir valorPoker = m[3].palo
		
		else if(
				trio
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
				((m[5].numero==(m[6].numero)))
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
		if(m1[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m1[i].numero-(cuentaEscColor1+1)
					&& m1[6].palo == m1[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m1[i].numero;
				}
			}
		}if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=1;i<7;i++){
				if(m1[0].numero==m1[i].numero-(cuentaEscColor1+1)
				   && m1[0].palo == m1[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m1[i].numero;
				}
			}
		}if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=2;i<7;i++){
				if(m1[1].numero==m1[i].numero-(cuentaEscColor1+1)
				   && m1[1].palo == m1[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m1[i].numero;
					
				}
			}
		}
		if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=3;i<7;i++){
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
		if(m2[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m2[i].numero-(cuentaEscColor1+1)
					&& m2[6].palo == m2[i].palo){
					
					cuentaEscColor1++;
					ultimovalor1 = m2[i].numero;
				}
			}
		}if(cuentaEscColor1<4){
			cuentaEscColor1=0;
			for(int i=1;i<7;i++){
				if(m2[0].numero==m2[i].numero-(cuentaEscColor2+1)
				   && m2[0].palo == m2[i].palo){
					
					cuentaEscColor2++;
					ultimovalor2 = m2[i].numero;
				}
			}
		}if(cuentaEscColor2<4){
			cuentaEscColor2=0;
			for(int i=2;i<7;i++){
				if(m2[1].numero==m2[i].numero-(cuentaEscColor2+1)
				   && m2[1].palo == m2[i].palo){
					
					cuentaEscColor2++;
					ultimovalor2 = m2[i].numero;
					
				}
			}
		}
		if(cuentaEscColor2<4){
			cuentaEscColor2=0;
			for(int i=3;i<7;i++){
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
	public int empate4(carta[] m1, carta[] m2){
		int[] ultimovalor1 = new int[]{0,0,0,0,0,0,0};
		int cuentaColor1 = 0;
		for(int i=1;i<7;i++){
			if(m1[0].palo == m1[i].palo){
				cuentaColor1++;
				ultimovalor1[cuentaColor1] = m1[i].numero;
			}
		}
		if(cuentaColor1<4){
			cuentaColor1=0;
			ultimovalor1 = new int[]{0,0,0,0,0,0,0};
			for(int i=2;i<7;i++){
				if(m1[1].palo == m1[i].palo){
					
					cuentaColor1++;
					ultimovalor1[cuentaColor1] = m1[i].numero;
					
				}
			}
		}
		if(cuentaColor1<4){
			cuentaColor1=0;
			ultimovalor1 = new int[]{0,0,0,0,0,0,0};
			for(int i=3;i<7;i++){
				if(m1[2].palo == m1[i].palo){
					
					cuentaColor1++;
					ultimovalor1[cuentaColor1] = m1[i].numero;
					
				}
			}
		}
		////////////////////////////////////////////////////////
		int[] ultimovalor2 = new int[]{0,0,0,0,0,0,0};
		int cuentaColor2 = 0;
		for(int i=1;i<7;i++){
			if(m2[0].palo == m2[i].palo){
				
				cuentaColor2++;
				ultimovalor2[cuentaColor2] = m2[i].numero;
			}
		}
		if(cuentaColor2<4){
			cuentaColor2=0;
			ultimovalor2 = new int[]{0,0,0,0,0,0,0};
			for(int i=2;i<7;i++){
				if(m2[1].palo == m2[i].palo){
					
					cuentaColor2++;
					ultimovalor2[cuentaColor2] = m2[i].numero;
					
				}
			}
		}
		if(cuentaColor2<4){
			cuentaColor2=0;
			ultimovalor2 = new int[]{0,0,0,0,0,0,0};
			for(int i=3;i<7;i++){
				if(m2[2].palo == m2[i].palo){
					
					cuentaColor2++;
					ultimovalor2[cuentaColor2] = m2[i].numero;
					
				}
			}
		}
		if(ultimovalor1[cuentaColor1]>ultimovalor2[cuentaColor2]){
			return 1;
		}else if(ultimovalor2[cuentaColor2]>ultimovalor1[cuentaColor1]){
			return 2;
		}else if(ultimovalor1[cuentaColor1-1]>ultimovalor2[cuentaColor2-1]){
			return 1;
		}else if(ultimovalor2[cuentaColor2-1]>ultimovalor1[cuentaColor1-1]){
			return 2;
		}else if(ultimovalor1[cuentaColor1-2]>ultimovalor2[cuentaColor2-2]){
			return 1;
		}else if(ultimovalor2[cuentaColor2-2]>ultimovalor1[cuentaColor1-2]){
			return 2;
		}else if(ultimovalor1[cuentaColor1-3]>ultimovalor2[cuentaColor2-3]){
			return 1;
		}else if(ultimovalor2[cuentaColor2-3]>ultimovalor1[cuentaColor1-3]){
			return 2;
		}else if(ultimovalor1[cuentaColor1-4]>ultimovalor2[cuentaColor2-4]){
			return 1;
		}else if(ultimovalor2[cuentaColor2-4]>ultimovalor1[cuentaColor1-4]){
			return 2;
		}else{
			return 0;
		}
		
	}
	public int empate5(carta[] m1, carta[] m2){
		int ultimovalor1 = 0;
		int cuentaEsc1 = 0;
		if(m1[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m1[i].numero-(cuentaEsc1+1)){
					
					cuentaEsc1++;
					ultimovalor1 = m1[i].numero;
				}
			}
		}if(cuentaEsc1<4){
			cuentaEsc1=0;
			for(int i=1;i<7;i++){
				if(m1[0].numero==m1[i].numero-(cuentaEsc1+1)){
					
					cuentaEsc1++;
					ultimovalor1 = m1[i].numero;
				}
			}
		}
		if(cuentaEsc1<4){
			cuentaEsc1=0;
			for(int i=2;i<7;i++){
				if(m1[1].numero==m1[i].numero-(cuentaEsc1+1)){
					
					cuentaEsc1++;
					ultimovalor1 = m1[i].numero;
					
				}
			}
		}
		if(cuentaEsc1<4){
			cuentaEsc1=0;
			for(int i=3;i<7;i++){
				if(m1[2].numero==m1[i].numero-(cuentaEsc1+1)){
					
					cuentaEsc1++;
					ultimovalor1 = m1[i].numero;
					
				}
			}
		}
		////////////////////////////////////////////////////////
		int ultimovalor2 = 0;
		int cuentaEsc2 = 0;
		if(m2[6].numero == 14){
			for(int i=0;i<6;i++){
				if(1==m2[i].numero-(cuentaEsc1+1)){
					
					cuentaEsc1++;
					ultimovalor1 = m2[i].numero;
				}
			}
		}if(cuentaEsc1<4){
			cuentaEsc1=0;
			for(int i=1;i<7;i++){
				if(m2[0].numero==m2[i].numero-(cuentaEsc2+1)){
					
					cuentaEsc2++;
					ultimovalor2 = m2[i].numero;
				}
			}
		}if(cuentaEsc2<4){
			cuentaEsc2=0;
			for(int i=2;i<7;i++){
				if(m2[1].numero==m2[i].numero-(cuentaEsc2+1)){
					
					cuentaEsc2++;
					ultimovalor2 = m2[i].numero;
					
				}
			}
		}
		if(cuentaEsc2<4){
			cuentaEsc2=0;
			for(int i=3;i<7;i++){
				if(m2[2].numero==m2[i].numero-(cuentaEsc2+1)){
					
					cuentaEsc2++;
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
	public int empate6(carta[] m1, carta[] m2){
		int valorTrio1=0;
		int altasIguales = 0;
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
		
		int valorTrio2=0;		
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
			if(m1[6].numero > m2[6].numero
				&& m1[6].numero != valorTrio1){
				return 1;
			}else if(m1[6].numero < m2[6].numero
				&& m2[6].numero != valorTrio2){
				return 2;
			}else if(m1[6].numero == m2[6].numero
				&& m1[6].numero != valorTrio1){
				altasIguales++;
			}else if(m1[5].numero > m2[5].numero
				&& m1[5].numero != valorTrio1){
				return 1;
			}else if(m1[5].numero < m2[5].numero
				&& m2[5].numero != valorTrio2){
				return 2;
			}else if(m1[5].numero == m2[5].numero
				&& m1[5].numero != valorTrio1){
				altasIguales++;
			}
			
			if(altasIguales == 2){
				return 0;
			}else if(m1[4].numero > m2[4].numero
				&& m1[4].numero != valorTrio1){
				return 1;
			}else if(m1[4].numero < m2[4].numero
				&& m2[4].numero != valorTrio2){
				return 2;
			}else if(m1[4].numero == m2[4].numero
				&& m1[4].numero != valorTrio1){
				altasIguales++;
			}
			
			if(altasIguales == 2){
				return 0;
			}else if(m1[3].numero > m2[3].numero
				&& m1[3].numero != valorTrio1){
				return 1;
			}else if(m1[3].numero < m2[3].numero
				&& m2[3].numero != valorTrio2){
				return 2;
			}else if(m1[3].numero == m2[3].numero
				&& m1[3].numero != valorTrio1){
				altasIguales++;
			}
			
			if(altasIguales == 2){
				return 0;
			}else if(m1[2].numero > m2[2].numero
				&& m1[2].numero != valorTrio1){
				return 1;
			}else if(m1[2].numero < m2[2].numero
				&& m2[2].numero != valorTrio2){
				return 2;
			}
			
			return 0;
		}
	}
	public int empate7(carta[] m1, carta[] m2){
		int contadorAltas = 0;
		int valorPar11=0;
		int valorPar12=0;
		int valorPar21=0;
		int valorPar22=0;
		
		if ((m1[6].numero==m1[5].numero
			||m1[5].numero==m1[4].numero)){
			valorPar11=m1[5].numero;
		}if ((m1[4].numero==m1[3].numero
			||m1[3].numero==m1[2].numero)){
			if(valorPar11==0){
				valorPar11=m1[3].numero;
			}else{
				valorPar12=m1[3].numero;
			}
		}if ((m1[2].numero==m1[1].numero
			||m1[1].numero==m1[0].numero)){
			if(valorPar11==0){
				valorPar11=m1[1].numero;
			}else if (valorPar12==0){
				valorPar12=m1[1].numero;
			}
		}
		
		if ((m2[6].numero==m2[5].numero
				||m2[5].numero==m2[4].numero)){
				valorPar21=m2[5].numero;
		}if ((m2[4].numero==m2[3].numero
			||m2[3].numero==m2[2].numero)){
			if(valorPar21==0){
				valorPar21=m2[3].numero;
			}else{
				valorPar22=m2[3].numero;
			}
		}if ((m2[2].numero==m2[1].numero
			||m2[1].numero==m2[0].numero)){
			if(valorPar21==0){
				valorPar21=m2[1].numero;
			}else if (valorPar22==0){
				valorPar22=m2[1].numero;
			}
		}
		
		if(valorPar11>valorPar21){
			return 1;
		}else if(valorPar11<valorPar21){
			return 2;
		}else if(valorPar12>valorPar22){
			return 1;
		}else if(valorPar12<valorPar22){
			return 2;
		}else{
			if(m1[6].numero>m2[6].numero
				&& m1[6].numero != valorPar11
				&& m1[6].numero != valorPar12){
				return 1;
			}else if(m1[6].numero<m2[6].numero
				&& m2[6].numero != valorPar21
				&& m2[6].numero != valorPar22){
				return 2;
			}else if(m1[6].numero==m2[6].numero
				&& m2[6].numero != valorPar21
				&& m2[6].numero != valorPar22){
				contadorAltas++;
			}
			
			if(contadorAltas==1){
		    	return 0;
		    }else if(m1[5].numero>m2[5].numero
				&& m1[5].numero != valorPar11
				&& m1[5].numero != valorPar12){
				return 1;
			}else if(m1[5].numero<m2[5].numero
				&& m2[5].numero != valorPar21
				&& m2[5].numero != valorPar22){
				return 2;
			}else if(m1[5].numero==m2[5].numero
				&& m2[5].numero != valorPar21
				&& m2[5].numero != valorPar22){
				contadorAltas++;
			}
			
		    if(contadorAltas==1){
		    	return 0;
		    }else if(m1[4].numero>m2[4].numero
				&& m1[4].numero != valorPar11
				&& m1[4].numero != valorPar12){
				return 1;
			}else if(m1[4].numero<m2[4].numero
				&& m2[4].numero != valorPar21
				&& m2[4].numero != valorPar22){
				return 2;
			}else if(m1[4].numero==m2[4].numero
				&& m2[4].numero != valorPar21
				&& m2[4].numero != valorPar22){
				contadorAltas++;
			}
			
		    if(contadorAltas==1){
		    	return 0;
		    }else if(m1[3].numero>m2[3].numero
				&& m1[3].numero != valorPar11
				&& m1[3].numero != valorPar12){
				return 1;
			}else if(m1[3].numero<m2[3].numero
				&& m2[3].numero != valorPar21
				&& m2[3].numero != valorPar22){
				return 2;
			}else if(m1[3].numero==m2[3].numero
				&& m2[3].numero != valorPar21
				&& m2[3].numero != valorPar22){
				contadorAltas++;
			}
		    
		    if(contadorAltas==1){
		    	return 0;
		    }else if(m1[2].numero>m2[2].numero
				&& m1[2].numero != valorPar11
				&& m1[2].numero != valorPar12){
				return 1;
			}else if(m1[2].numero<m2[2].numero
				&& m2[2].numero != valorPar21
				&& m2[2].numero != valorPar22){
				return 2;
			}else if(m1[2].numero==m2[2].numero
				&& m2[2].numero != valorPar21
				&& m2[2].numero != valorPar22){
				contadorAltas++;
			}
		    
		    return 0;
		}
	}
	public int empate8(carta[] m1, carta[] m2){
		int contadorAltas = 0;
		int valorPar1=0;
		int valorPar2=0;
		
		if ((m1[6].numero==m1[5].numero
			||m1[5].numero==m1[4].numero)){
			valorPar1=m1[5].numero;
		}
		else if ((m1[4].numero==m1[3].numero
			||m1[3].numero==m1[2].numero)){
			valorPar1=m1[3].numero;
		}
		else if ((m1[2].numero==m1[1].numero
			||m1[1].numero==m1[0].numero)){
			valorPar1=m1[1].numero;
		}
		
		if ((m2[6].numero==m2[5].numero
			||m2[5].numero==m2[4].numero)){
			valorPar2=m2[5].numero;
		}
		else if ((m2[4].numero==m2[3].numero
			||m2[3].numero==m2[2].numero)){
			valorPar2=m2[3].numero;
		}
		else if ((m2[2].numero==m2[1].numero
			||m2[1].numero==m2[0].numero)){
			valorPar2=m2[1].numero;
		}
		
		if(valorPar1>valorPar2){
			return 1;
		}else if(valorPar1<valorPar2){
			return 2;
		}else{
			if(m1[6].numero>m2[6].numero
				&& m1[6].numero != valorPar1){
				return 1;
			}else if(m1[6].numero<m2[6].numero
				&& m2[6].numero != valorPar2){
				return 2;
			}else if(m1[6].numero==m2[6].numero
				&& m2[6].numero != valorPar2){
				contadorAltas++;
			}
			
			if(m1[5].numero>m2[5].numero
				&& m1[5].numero != valorPar1){
				return 1;
			}else if(m1[5].numero<m2[5].numero
				&& m2[5].numero != valorPar2){
				return 2;
			}else if(m1[5].numero==m2[5].numero
				&& m2[5].numero != valorPar2){
				contadorAltas++;
			}
			
		    if(contadorAltas==3){
		    	return 0;
		    }else if(m1[4].numero>m2[4].numero
				&& m1[4].numero != valorPar1){
				return 1;
			}else if(m1[4].numero<m2[4].numero
				&& m2[4].numero != valorPar2){
				return 2;
			}else if(m1[4].numero==m2[4].numero
				&& m2[4].numero != valorPar2){
				contadorAltas++;
			}
			
		    if(contadorAltas==3){
		    	return 0;
		    }else if(m1[3].numero>m2[3].numero
				&& m1[3].numero != valorPar1){
				return 1;
			}else if(m1[3].numero<m2[3].numero
				&& m2[3].numero != valorPar2){
				return 2;
			}else if(m1[3].numero==m2[3].numero
				&& m2[3].numero != valorPar2){
				contadorAltas++;
			}
		    
		    if(contadorAltas==3){
		    	return 0;
		    }else if(m1[2].numero>m2[2].numero
				&& m1[2].numero != valorPar1){
				return 1;
			}else if(m1[2].numero<m2[2].numero
				&& m2[2].numero != valorPar2){
				return 2;
			}else if(m1[2].numero==m2[2].numero
				&& m2[2].numero != valorPar2){
				contadorAltas++;
			}
		    
		    return 0;
		}
	}
	public int empate9(carta[] m1, carta[] m2){
		if(m1[6].numero>m2[6].numero){
			return 1;
		}else if(m1[6].numero<m2[6].numero){
			return 2;
		}else if(m1[5].numero>m2[5].numero){
			return 1;
		}else if(m1[5].numero<m2[5].numero){
			return 2;
		}else if(m1[4].numero>m2[4].numero){
			return 1;
		}else if(m1[4].numero<m2[4].numero){
			return 2;
		}else if(m1[3].numero>m2[3].numero){
			return 1;
		}else if(m1[3].numero<m2[3].numero){
			return 2;
		}else if(m1[2].numero>m2[2].numero){
			return 1;
		}else if(m1[2].numero<m2[2].numero){
			return 2;
		}else {
			return 0;
		}
	    
	   
	}
}
