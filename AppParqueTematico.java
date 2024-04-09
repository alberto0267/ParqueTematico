package practica2;
import java.util.Scanner;
/**
 * Ejercicio 4, Crear una aplicacion para un parque de atracciones 
 * @author Blanco
 */
public class ejercicio4 {
/**
 * Muestra un despliegue de opciones como guia
 */	
	public static void mostrarMenuOpciones() {
		System.out.println("1. Atracciones del parque.");
		System.out.println("2. resturantes.");
		System.out.println("3. Dias con entradas disponibles.");
		System.out.println("4. Entradas y precios.");
		System.out.println("5. !Participa en el sorteo!");
		System.out.println("6. Salir de la aplicacion");
	}
	/**
	 * para estableces un nuevo login y luego verificarlo
	 * @param userNew La creacion del usuario por primera vez
	 * @param user la verificacion del usuario		
	 * @param passwordNew La creacion de la contraseñapor primera vez
	 * @param password la verificacion de la contraseña
	 * @return delvuelve  tru o false si user y user new son igual y lo mismo aplica para la contraseña
	 */
	public static boolean login( String userNew,String user, int passwordNew, int password) {
		Scanner da= new Scanner(System.in);
		 boolean resultado;		 
		 if( (userNew.equals(user)) && (passwordNew==password) ) {
			 System.out.println("***password and user correcto***");//Los prints al main
			 resultado=true;
		 }else {
			 System.out.println("***password or  user incorrecto***");
			 resultado=false;					
		 }		 
		return resultado;
			}
	/**
	 * Describe las distinta atracciones del paque al llamar esta funcion
	 */
	public static void mostrarAtracciones() {
		System.out.println("Lista de atracciones del parque. ");
		System.out.println("- Los rápidos. Intensidad: suave");
		System.out.println("- Sillas voladoras. Intensidad: Moderada");
		System.out.println("- La lanzadera. Intensidad: Alta");
		System.out.println("- Star Flyer. Intensidad: Alta");
		System.out.println("- Vertigo. Intensidad: Moderada");
		System.out.println("- Los fiordos. Intensidad: moderada");
	}
	/**
	 * MUestra los restaurante disponibles del paque
	 */
	public static void mostrarRestaurantes() {
		System.out.println("Descripcion:: muestra la lista de los restaurantes del parque. ");
		System.out.println("- La Super Plaza");
		System.out.println("¡En la plaza deguistaras los mejores hot dogs!");
		System.out.println("-Food truck Adrenalina");
		System.out.println("El yogurt helado con los toppings masd deliciosos y frescos");
		System.out.println("-burguer Alegria");
		System.out.println("Si pruebas nuestras increible hamburguesas, repetiras a cada visita");
		System.out.println("Freeze Brain");
		System.out.println("¡Disfruta de un rico granizado!");
	}
	/**
	 * Limita los diasd por cada mes.
	 * @param el susuario el envia el mes que quiere ir
	 * @return devuelve los dias que exiten para cada mes
	 */
	public static int cantidadDias(int mes) {
		switch (mes){
		case 1,3,5,7,8,10,12 -> mes = 31;
		case 4,6,9,11 -> mes = 30;
		case 2 -> mes = 28;
		}
		return mes;
	}
	/**
	 * Se apoya en la funcion cantidadDias para ver que dias disponibles hay
	 * @param maximo muestra los dias maximo por cada mes
	 * @return devulve 5 dias aleatorios limitados por cada mes
	 */
	public static int numeroAleatorio(int maximo) {//Esta función solo genera un número
		int resultado;
		int n;
		resultado=0;
		n= cantidadDias(maximo);		
		for(int i= 1; i<=5;i++) {
			resultado= (int) (Math.random()*n)+1;//Esta parte al main
			System.out.println("Dia " + resultado);			
		}		
		return resultado;
	}
	/**
	 * Muestra los precio de cada entrada disponible
	 */
	public static void mostrarPrecios() {
		System.out.println("Precio de la entrada reducida y general");
		System.out.println("- Entrada reducida (< 140 cm): 29.90€ ");
		System.out.println("- Entrada general: 39.90€");
	}
	/**
	 * muestra el total de las entrada que solicite en usuario
	 * @param entradaReducida si quiere entrada reducida
	 * @param entradaGeneral si quiere entrada reducida
	 * @return devuelve el total entre ambas entrada solicitadas
	 */
	public static  double calcularImporte(int entradaReducida, int entradaGeneral) {		
		double precioReducida,precioGeneral;
		precioReducida = 29.90;
		precioGeneral = 39.90;		
		return (precioReducida * entradaReducida)+(precioGeneral * entradaGeneral);	
	}
	/**
	 * Para saber si se gasto mas de cierta cantidad saber que descuento le correspon de
	 * @param importe apoyado en el total de las entradas solcitadas
	 * @return devuelve cuanto porcentaje le corresponde, basado en el total de la funcion anterior
	 */
	public static int descuentoAsociado(double importe) {		
	int resultado;
		resultado=0;
	if(importe<=50) {
		System.out.println("descuento del 0%");
		resultado= 0;
	} else if ((importe >50)&& (importe <=100)) {//La alineación de los else-if
			System.out.println("descuento del 5%");
			resultado= 5;
		}else  if ((importe>100) && (importe<=200)){//Está bien, si ponemos primer las restricciones de mayor a menor se simiplicican las comparaciones
			System.out.println("descuento del 10%");
			resultado=10;
		}else   {
			System.out.println("descuento del 30%");
			resultado=30;
		}
		return resultado;	
	}
	/**
	 *Hace el calculo del decuento con el total
	 * @param importe coge el total de la funcion importe
	 * @param descuento	cpge que descuento le corresponde
	 * @return devuelve el total con el descuento aplicado
	 */
	public static double aplicarAsociado(double importe, int descuento) {	
		double resultado;
		resultado = importe- ((importe*descuento)/100);
		System.out.println("Importe final: " + resultado + "€");//El print al main
		return resultado;		
		}
	/**
	 * Para saber que numero es primo y cual no
	 * @param numero envia un int para saber si en primo	
	 * @return devuelve true su es primo y false en caso contrario
	 */
	static public boolean esPrimo(int numero) {
		boolean resultado;
		resultado = false;
		int contador = 0;
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			resultado = (numero % i == 0);// aqui voy diviendo cada numero entre los numeros anteriores a el, si es mas
											// de uno es false
			if (resultado) {
				contador++;
			}
			if (contador == 2) {//Esto hay que sacarl ofuera del for porque solo queremos comparar al final
				resultado = true;
			} else {
				resultado = false;
			}
		}
		return resultado;
	}
/**
 * saca los divisores de un numero y suma sus primos
 * @param numero se envia un numero para buscar sus divisores
 * @return devuelve la suma de los divisores  primos del numero para sumarlos
 */
	public static int sumaDivisoresPrimos(int numero) {
		boolean resultado;
		resultado = false;
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			resultado = numero % i == 0;
			if (resultado) {//Dos if seguidos son uno if con un &&: if(esPrimo(i)&&numero%i==0)
				if (esPrimo(i)) {
					suma += i;
				}
			}
		}
		return suma;
	}
/**
 * Para saber si el usuario gano un premio o no 
 * @param numero que se apoya en la funcion anterior 
 * @return resultada ganador si el numero es primo o si no es primo que la suma se sus divisores primos de >que 10 
 */	
	  public static boolean premio(int numero) {
		  boolean resultado;
		 resultado=false;
		  if(esPrimo(numero)) {
			  System.out.println("“Enhorabuena, has ganado un granizado gratis en Freeze Brain");
			  resultado=true;
		  }else if(!esPrimo(numero)) {
			  if(sumaDivisoresPrimos(numero)>10) {
				  System.out.println("“Felicidades, has ganado dos menús de La Super Plaza”");
				  resultado=true;
			  }
		  }else {
			  resultado=false;
		  }
		  return resultado;
	  }	
	public static void main(String[] args) {
		Scanner da= new Scanner(System.in);
		int passwordNew,password,opcion,cantEntradaGeneral, cantEntradaReducida,descuento,sorteo,contador;
		opcion=0;
		contador=1;
		int contadorCaso5 = 1;
		double importe3,total;
		char salir=0;
		boolean login;		
		//creamos nuestra credenciales	
		System.out.println("establece tu nuevo usuario");
		String userNew= da.next();	
		System.out.println("Establece tu nueva contraseña");
		passwordNew = da.nextInt();		
		System.out.println("Registro realizado");		
		System.out.println("verificando credenciales, introduce las credenciales establecidas antes");		
		login = true;		
		do{
			System.out.println("introduce tu usuario");
			String user= da.next();
			
			System.out.println("introduce tu contraseña");
			password = da.nextInt();			
			login =login(userNew,user,passwordNew,password);				
		}	while(!login);		
		//que nuestras credenciales si esten correctas		
			//si las credenciales son correctas entramos
			System.out.println("***Bienvenido***");
			System.out.println();
			
			//mostramos menu y que nos imprima los opciones
			do {
				mostrarMenuOpciones();
				System.out.println();
				System.out.println("Selecciona un opcion del menu");
				 opcion = da.nextInt();
				System.out.println("--------------------");
				 switch(opcion) {				 
				 case 1 -> {
					 mostrarAtracciones() ;
				 }
				 case 2 ->{
					 mostrarRestaurantes();
				 }
				 case 3 -> {
					 int visitaDia;
					 System.out.println("Que mes visitaras el parque?");
					 visitaDia = da.nextInt();
					 System.out.println("Fechas dsponibles ese mes seran: "); 
					 visitaDia= numeroAleatorio(visitaDia);
				 }
				 case 4-> {
					 mostrarPrecios();
						System.out.println("Deseas consultar cuál será el importe en función del número de entradas: S = si");
						salir=da.next().charAt(0);	//Está entrando en conflicto el scanner del caracter con el scanner de la opción, en estos casos, hay que utilizar 2 scanner					
						if (salir=='s') {			//Es un error muy concreto y un poco raro, pero es saberlo para las siguietnes veces que se pida un int y un char seguidos
							System.out.println("introduce la cantidad de entradas reducidad que deseas");
							cantEntradaReducida = da.nextInt();
							System.out.println("introduce la cantidad de entradas generales que deseas");
							cantEntradaGeneral = da.nextInt();
							System.out.println("importe total " +  calcularImporte(cantEntradaReducida,cantEntradaGeneral) + " €");//Guardar el retrono de la función en una variable para no invocar la misma varias veces
							importe3= calcularImporte(cantEntradaReducida,cantEntradaGeneral);
							descuento = descuentoAsociado(importe3);
							total= aplicarAsociado(importe3,descuento);
						}
				 }
				 case 5-> {		 
					 boolean sorteoCaso5=false;
					 if(contadorCaso5==2) {
							System.out.println("ya has participado...pillin");
						}
					 if(contadorCaso5==1) {
						 contadorCaso5++;
						 //Un for que va de uno a uno no es un for
					 for(int contador1=1;contador1<=1;contador1++) {//Se invoca a la función premio, se guarda el retorno y se establece un número de intentro while(!premiado && oportunidadesMas>0)						 					
						 for(int contador2=1 ; contador2<=3;contador2++) {							 
							 if(!sorteoCaso5) {//Este if dentro del for da la pista de qeu es un while
							 System.out.println("Introduce el número que quieras y podrás ganar un premio");
								sorteo = da.nextInt();
								sorteoCaso5 = premio(sorteo); 
								if(!sorteoCaso5) {
									if(contador2<3) {
										System.out.println("intentalo de nuevo");
									}
								}								
							 }						 
						 }					 
						 if(!sorteoCaso5) {
							 System.out.println("En otra ocasion sera");					
						 }						
					 }	
					}
					}
				 case 6-> { }
				 default ->  System.out.println("Debes elegir una opcion dentro las opciones dadas");
				 } 
				 System.out.println();
			}while(opcion!=6);			
			System.out.println("hasta pronto");		
		}
}
