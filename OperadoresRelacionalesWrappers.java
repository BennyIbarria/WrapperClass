public class OperadoresRelacionalesWrappers {
    public static void main(String[] args) {

        /*Autoboxing = Convertir un primitivo en una clase Wrapper*/

        /*Unboxing = LLevar una instancia a un valor primitivo, -De referencia a primitivo-*/

        Integer num1 = 1000;
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Se comparan las instancias objetos
        System.out.println("num1 y num2 son la misma instancia?: "+(num1==num2));

        //Se comparan ahora una instancia/objeto contra un valor primitivo(num2) resultado -false-
        num2 = 1000;
        System.out.println("num1 y num2 son la misma instancia num2 vale 1000 actualment: "+(num1==num2));

        //Comparar con el metodo equals -Realizando AutoBoxing-
        System.out.println("Tienen el mismo valor?: " +(num1.equals(num2)));

        //Comparamos pero pasamos los objetos a primitivos con el metodo int.Value, -Realizando UnBoxing-
        System.out.println("Tienen e mismo valor?: " + (num1.intValue() == num2.intValue()));

        // Realizar una comparación con mayor que en modo -Autoboxing-
        num2 = 500;
        boolean condicion = num1>num2;
        System.out.println("Condicion = " + condicion);

        // Realizar una comparación con mayor que en modo -Unboxing-
        boolean condicion2 = num1.intValue()>num2.intValue();
        System.out.println("Condicion = " + condicion);

    }
}
