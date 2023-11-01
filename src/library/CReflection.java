package library;

import java.lang.reflect.*;
import usuario.*;


public class CReflection {
    public static void ListaMetodosMultimidia() {

        Class<?> classe = ItemMultimidia.class;
		Method[] methods = classe.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }


    public static void ListaMetodosMembro() {
        Class<?> classe = Membro.class;
        Method[] methods = classe.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
