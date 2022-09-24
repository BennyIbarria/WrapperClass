import java.lang.reflect.Method;

public class MetdoGetClass {
    public static void main(String[] args) {

        //Creamos una instancia del tipo String

        String texto = "Regards fellows!!";

        //Para ver la estructura interna de la clase
        Class strClass = texto.getClass();

        //Mostrar el nombre completo de la clase incluyendo el package
        System.out.println("strClass.getName() = " + strClass.getName());

        //Obtener el nombre sin el nombre del package
        System.out.println("strClass.getName() = " + strClass.getSimpleName());

        //Obtener el nombre del paquete
        System.out.println("strClass.getName() = " + strClass.getPackageName());

        //Imprimimos el objeto para ver su reflexion - Estrutura Interna -
        System.out.println("strClass.getName() = " + strClass);

        //Ver los metodos de la clase String strClass mediante el uso de la estructura foreach
        for(Method m: strClass.getMethods()){
            System.out.println("metodo= " + m.getName());
        }
        //Creamosun una instancia de la clas Integer
        Integer numero = 34;

        //Para ver la estructura interna de la clase
        Class intClass = numero.getClass();

        //Mostrar el nombre completo de la clase incluyendo el package
        System.out.println("intClass.getName() = " + intClass.getName());

        //Mostrar el nombre completo de la clase sin el nombre del paquete
        System.out.println("intClass.getName() = " + intClass.getSimpleName());

        //Mostrar el nombre del package y extender la instrucción hacia los metodos que contiene el paquete
        System.out.println("intClass.getName() = " + intClass.getPackage().getName());

        //Mostrar de forma reflexiva la superclase a la que pertenece el valor asignado a la variable intNumber -intClass-
        System.out.println("intClass.getName() = " + intClass.getSuperclass());

        //Conocer todos los metodos de la clase Object con la sentencia foreach
        Class objClass = intClass.getSuperclass().getSuperclass();
        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

    }
}
