public class AutoBoxing {
    public static void main(String[] args) {

        //Declaramos un arreglo con elementos del tipo instancias de enteros
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int suma = 0;

        //Realizamos la operacion de manera explicita, trabajar con las instancias de enteros primitivos
        for (Integer i : numeros){
            if (i.intValue() % 2==0){
                suma +=i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        //Realizar la operacion de manera implicita, trabajar con las instancias de enteros primitivos
        suma=0;
        for(Integer i : numeros){
            if(i%2==0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
