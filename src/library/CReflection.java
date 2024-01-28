package library;

import java.lang.reflect.*;
import usuario.*;
import java.util.List;


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
        Class<?> classe = Membro.class;
        Field[] fields = classe.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field);
        }
    }

    public static<T> void listaInfo_new(List<T> lista){
        int i = 0;
        for(T m : lista){
            Class<?> classe = m.getClass();
            
            System.out.println("\nImprimindo atributos do elemento "+i);
            Field[] fields = classe.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field);
            }

            

            System.out.println("\nImprimindo metodos do elemento "+i);
            Method[] methods = classe.getDeclaredMethods();
            for(Method method : methods){
                System.out.println(method);
            }
            i++;
        }
    }
}
