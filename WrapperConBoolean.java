public class WrapperConBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        //Creacion de un primitivo booleano
        boolean primBoolean=num1>num2;

        //Creacion de instancias booleanas, al primero se le aplica unboxing
        Boolean objBoolean = Boolean.valueOf(primBoolean);

        //Booleano que recibe un String
        Boolean objBoolean2 = Boolean.valueOf("false");

        //Declaracion de un Objeto Booleano como se realiza de manera habitual
        Boolean objBoolean3= true;

        //Impresión de los estados de los objetos y los primitivos
        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //Comparando los objetos Booleanos y con los primitivos
        System.out.println("Comparacion de dos objetos Booleanos: " + (objBoolean==objBoolean2));
        System.out.println("Comparacion de dos objetos Booleanos: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparacion de dos objetos Booleanos: " + (objBoolean2==objBoolean3));
        System.out.println("Comparacion de dos objetos Booleanos: " + (objBoolean==objBoolean3));

        //Declaramos un nuevo Booleano como primitivo a partir de un objeto
        boolean primBoolean2= objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
