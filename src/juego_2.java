import javax.swing.*;

class juego_2{

	public static void main(String[] args) {
		//Juego en Java: Piedra,Papel,Tijera,Lagarto,Spock.
		
		int puntaje=0,puntaje_maquina=0,ronda,maquina;
		String respuesta,opcion;;
		

		do {
			//Bienvenida:
				JOptionPane.showMessageDialog(null,"Bienvenidos al Piedra,Papel,Tijera,Lagarto o Spock ! ", "TP2",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/introduccion.gif")));
				
		//Validacion-Rondas
				ronda=Integer.parseInt(JOptionPane.showInputDialog("Ingresar cantidad de rondas (maximo 5)"));
				if(ronda>=1 && ronda<=5) {
				JOptionPane.showMessageDialog(null, "Rondas permitidas.");
				
	   //Rondas
				for (int i = 1; i <=ronda; i++) {
					
				opcion= (String) JOptionPane.showInputDialog(null,"Elige sabiamente, en caso contrario perderas una ronda:\n1-Piedra\n2-Papel\n3-Tijera\n4-Lagarto\n5-Spock ", "1-Juego",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/reglas.jpg")), null, null);
				
	  //Convierto las opciones en integer:
				int convertibilidad;
				convertibilidad=Integer.parseInt(opcion);
				
				maquina=(int)(Math.random()*4+1);
				
				switch(convertibilidad) {
					case 1:
						if(maquina==1) {
							JOptionPane.showMessageDialog(null,"Empate , la maquina eligio: Piedra", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/piedra.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							
						}else if(maquina==3){
							JOptionPane.showMessageDialog(null,"Ganaste , la maquina eligio: Tijera", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/tijera.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==4) {
							JOptionPane.showMessageDialog(null,"Ganaste , la maquina eligio: Lagarto", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/lagarto.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==2) {
							JOptionPane.showMessageDialog(null,"Perdiste , la maquina eligio: Papel", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/papel.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else {
							JOptionPane.showMessageDialog(null," Perdiste! , la maquina eligio:  Spock", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/spock.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}
						break;
					case 2:
						if(maquina==1) {
							JOptionPane.showMessageDialog(null,"Ganaste! , la maquina eligio: Piedra", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/piedra.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==3){
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Tijera", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/tijera.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else if(maquina==4) {
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Lagarto", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/lagarto.png")));
							System.out.println("Opcion de la maquina: "+maquina);
						}else if(maquina==2) {
							JOptionPane.showMessageDialog(null,"Empate! , la maquina eligio: Papel", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/papel.png")));
							System.out.println("Opcion de la maquina: "+maquina);
		
						}else {
							JOptionPane.showMessageDialog(null," Ganaste! , la maquina eligio:  Spock", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/spock.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}
						break;
					case 3 :
						if(maquina==1) {
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Piedra", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/piedra.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else if(maquina==3){
							JOptionPane.showMessageDialog(null,"Empate! , la maquina eligio: Tijera", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/tijera.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							
						}else if(maquina==4) {
							JOptionPane.showMessageDialog(null,"Ganaste , la maquina eligio: Lagarto", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/lagarto.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==2) {
							JOptionPane.showMessageDialog(null,"Ganaste! , la maquina eligio: Papel", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/papel.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else {
							JOptionPane.showMessageDialog(null,"Perdiste! La maquina eligio:  Spock", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/spock.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}
						break;
					case 4:
						if(maquina==1) {
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Piedra", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/piedra.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else if(maquina==3){
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Tijera", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/tijera.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else if(maquina==4) {
							JOptionPane.showMessageDialog(null,"Empate , la maquina eligio: Lagarto", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/lagarto.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							
						}else if(maquina==2) {
							JOptionPane.showMessageDialog(null,"Ganaste! , la maquina eligio: Papel", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/papel.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else {
							JOptionPane.showMessageDialog(null,"Ganaste! La maquina eligio:  Spock", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/spock.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}
						break;
					case 5:
						if(maquina==1) {
							JOptionPane.showMessageDialog(null,"Ganaste! , la maquina eligio: Piedra", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/piedra.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==3){
							JOptionPane.showMessageDialog(null,"Ganaste , la maquina eligio: Tijera", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/tijera.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje++;
						}else if(maquina==4) {
							JOptionPane.showMessageDialog(null,"Perdiste! , la maquina eligio: Lagarto", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/lagarto.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else if(maquina==2) {
							JOptionPane.showMessageDialog(null,"Perdiste , la maquina eligio: Papel", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/papel.png")));
							System.out.println("Opcion de la maquina: "+maquina);
							puntaje_maquina++;
						}else {
							JOptionPane.showMessageDialog(null,"Empate! La maquina eligio:  Spock", "Juego_2",JOptionPane.DEFAULT_OPTION, new ImageIcon(juego_2.class.getResource("/img/spock.png")));
							System.out.println("Opcion de la maquina: "+maquina);

						}
						break;
						default:
							JOptionPane.showMessageDialog(null, "Error ! , no existe esa opción, ronda perdida..");
							break;
					}
			}
			//Empate:
				if(puntaje==puntaje_maquina) {
					JOptionPane.showMessageDialog(null, "Empate!, prueba mejor suerte la proxima vez");
			//Gana:	
				}else if (puntaje>puntaje_maquina) {
					JOptionPane.showMessageDialog(null, "Te felicito, Ganaste!");
			//Pierde:	
				}else {
					JOptionPane.showMessageDialog(null, "La maquina gano, suerte para la proxima!");
			}	
		    //Validacion-Rondas
				}else {
					JOptionPane.showMessageDialog(null, "Error!, no se permite esa cantidad de rondas");
				}
				respuesta=JOptionPane.showInputDialog("¿Quiere volver a jugar ?\nSi/No");
		}
			
		while (respuesta.equalsIgnoreCase("si"));	
			
	}
}
