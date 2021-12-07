import java.lang.Math;
/**
 * Clase Bubblesort, en donde se implementa la ordenamiento bubblesort
 * @author Asahel Main
 */
public class Bubblesort{
    /**
     * Metodo ordenar, toma un arreglo como parametro
     * @param El arreglo a ordenar
     */
    public static void ordenar(int arr[]){
	for(int i = 0; i<arr.length; i++){
	    for(int j = i+1; j<arr.length; j++){
		if(arr[i] >  arr[j]){ 
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		}
	    }
	}
    }

    /**
     * Metodo principal en donde se declara un arreglo
     * y se le asignan valores aleatorios
     * @param args Los argumentos
     */
    public static void main(String[] args){
	int arr[] = new int[100000];

	//El valor maximo que pueden tomar los numeros aleatorios
	int maximo = 1000000;
	//El valor minimo que pueden tomar los numeros aleatorios
	int minimo = 0;
	//El rango
	int rango = maximo - minimo + 1;

	//Se le asigna un valor aleatorio a cada posicion del arreglo
	for(int i = 0; i<arr.length; i++){
	    arr[i] = (int)(Math.random() * rango) + minimo;
	}

	//Se llama al metodo ordenar
	ordenar(arr);

	//Se imprime el arreglo ordenado de menor a mayor
	for(int p: arr){
	    System.out.println(p);
	}
    }
}
