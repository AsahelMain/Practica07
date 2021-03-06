import java.lang.Math;

/**
 * Clase Quicksort en la que se implementa el ordenamiento quicksort
 */
public class Quicksort{
    
    /**
     * Metodo que ordena en orden decreciente los elementos de un arreglo
     * @author Enrique
     * @param El arreglo a ordenar
     * @param El primer indice del arreglo
     * @param El ultimo indice del arreglo
     */
    public static void ordenar(int arr[], int izquierda, int derecha) {

	 //El pivote sera el primer elemento del arreglo
	int pivote = arr[izquierda];
	// i va a buscar elementos menores que el pivote de izquierda a derecha        
	int i = izquierda;
	//j va a buscar elementos mayores o iguales que el pivote de izquierda a derecha      
	int j = derecha;  


	//Cuando i y j se crucen entonces el ciclo termina
	while(i < j){
	    //Si el valor del arreglo en el indice i es menor que el pivote entonces acaba el ciclo,
	    //de lo contrario se aumenta 1 a i y se vuelve a comparar hasta que se encuentre un elemento
	    //menor que el pivote o hasta que i y j se crucen
	    while(arr[i] >= pivote && i < j){ 
		i++;
	    }
	    //Si el valor del arreglo en el indice j es mayor que el pivote entonces acaba el ciclo, de
	    //De lo contrario se disminuye j en 1  y se vuelve a comparar hasta que se encuentre un elemento
	    //mayor o igual al pivote
	    while(arr[j] < pivote){
		j--;
	    }

	    //Cuando ya se tiene un elemento menor que el pivote y uno mayor que el pivote entonces:
	    //Si i y j todavia no se cruzan entonces se intercambian los valores de arr[i] y arr[j]
	    if (i < j) {
		int temp;
		temp= arr[i];                      
		arr[i]=arr[j];
		arr[j]=temp;
	    }
	}

	//Una vez que termina el ciclo intercambiamos el valor del arreglo en el indice de la izquierda
	//con el arreglo en el indice j
	//De esta forma los elementos a la izquierda de arr[j] seran todos mas pequeños que los elementos
	// a la derecha de arr[j]
	int temp = arr[izquierda];
	arr[izquierda]=arr[j];                 
	arr[j]=temp;      

	//Si j-1 es menor o igual a izquierda entonces no se aplica el metodo a la parte del arreglo
	//a la izquierda de arr[j] ya que no habria una parte izquierda
	if(izquierda < j-1){
	    //Aplicamos el mismo metodo pero solo a la parte del arreglo  a la izquierda de arr[j]
	    //Dado que arr[j] en este caso es menor que la parte izquierda del array entonces
	    //tomamos como limite derecho a j-1
	    ordenar(arr,izquierda,j-1);
	}
	//Si j+1 es mayor o igual a derecha entonces no se aplica el metodo a la parte del arreglo
	//a la derecha de arr[j] ya que no habria una parte derecha 
	if(j+1 < derecha){
	    //Se llama el mismo metodo pero solo para la parte del arreglo a la derecha de arr[j]
	    ordenar(arr,j+1,derecha);         
	}
    }

    /**
     * Metodo principal en donde se declara un array y se le asignan numeros aleatorios
     * posteriormente se ordena el arreglo
     * @param args Los argumentos
     */
    public static void main(String[] args){
	int arr[] = new int[100000];

	//El maximo valor que podran tomar los numeros aleatorios
	int maximo = 100000000;
	//El minimo valor que podran tomar los numeros aleatorios
	int minimo = 0;
	//El rango
	int rango = maximo - minimo + 1;

	//Se le asigna un valor aleatorio a cada posicion en el arreglo
	for(int i = 0; i<arr.length; i++){
	    arr[i] = (int)(Math.random() * rango) + minimo;
	}

	//Se llama al metodo ordenar
	ordenar(arr, 0,  arr.length-1);
       

	//Imprimimos el arreglo ordenado	
	for(int p: arr){
	    System.out.println(p);
	}
    }
}
