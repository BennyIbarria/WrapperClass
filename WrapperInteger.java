public class WrapperInteger {
    public static void main(String[] args) {

        //Creacion de un primitivo
        int enteroPrimitivo = 1279;

        //Creacion de un objeto Wrapper mediante boxing/Explicito
        Integer objetoInteger = Integer.valueOf(32765);

        //Creacion de un objeto Wrapper mediante autoboxing implicito
        Integer objetoInteger2 = 32765;

        //Asignar un valor primitivo a un objeto referencia Integer forma explicita/boxing
         objetoInteger= Integer.valueOf(enteroPrimitivo);

        //Asignar un valor primitivo a un objeto referencia Integer forma implicita/autoboxing
         objetoInteger2=enteroPrimitivo;

        System.out.println("objetoInteger = " + objetoInteger);

        //Convertir una variable primitiva a un objeto por referencia
        int num = objetoInteger;
        System.out.println("num = " + num);
        int num2 = objetoInteger.intValue();
        System.out.println("num2 = " + num2);

        //Convertir un objeto String en un objeto Integer
        String valor = "67000";
        Integer valorStringAEntero = Integer.valueOf(valor);
        System.out.println("valor = " + valorStringAEntero);

        //Convertir un objeto Short a un objeto Integer
        Short objetoShort = objetoInteger.shortValue();
        System.out.println("objetoShort = " + objetoShort);

        //Convertir un objeto Byte a un objeto Integer
        Byte objetoByte= objetoInteger.byteValue();
        System.out.println("objetoByte = " + objetoByte);

        //Convertir un objeto Long a un objeto Integer

        Long objetoLong = objetoInteger.longValue();
        System.out.println("objetoLong = " + objetoLong);


        /*Se debe de tener cuidado con el rango de valores que cada tipo de obeto puede almacenar
        * porque puede haber perdida de información o llegar a obtener valores ambiguos
        * No se puede convertir un objeto de mayor capacidad a uno de menor capacidad sin respetar
        * su rango numerico, un objeto de menor capacidad a uno de mayor capacidad si se puede convertir
        * sin restricciones de rango numerico.*/

    }
}
