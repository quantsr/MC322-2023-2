package library;

public class Equipamentos {
    class Informatica{
        String modelo;
        String codigoModelo;
        enum TipoDeRecurso{
            COMPUTADOR,
            TABLET,
            PROJETOR
        }
    }
    class Audiovisual{
        String modelo;
        String codigoModelo;
        enum TipoDeRecurso{
            CAMERA,
            MICROFONE,
            CAIXA_DE_SOM
        }
    }
    class Impressao{
        String modelo;
        String codigoModelo;
        enum TipoDeRecurso{
            IMPRESSORA,
            SCANNER,
            COPIADORA
        }
    }
    enum CategoriaEquipamento{
        INFORMATICA,
        AUDIOVISUAL,
        IMPRESSAO
    }
}
