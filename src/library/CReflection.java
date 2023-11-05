package library;

import java.lang.reflect.*;
import usuario.*;


public class CReflection {
    public static void listaMetodosClasse(ItemMultimidia item) {
        Class<?> classe = ItemMultimidia.class;
		Method[] methods = classe.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    public static void listaMetodosClasse(Membro membro) {
        Class<?> classe = Membro.class;
		Method[] methods = classe.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    public static void listaAttClasse(ItemMultimidia item){
        Class<?> classe = ItemMultimidia.class;
        Field[] fields = classe.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }
    }

    public static void listaAttClasse(Membro membro){
        Class<?> classe = ItemMultimidia.class;
        Field[] fields = classe.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }
    }


    
}
