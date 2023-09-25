package library;

public class Equipamentos extends Recursos{
    public Equipamentos(int id) {
        super(id);
    }

    class Informatica{
        String modelo;
        String codigoModelo;
        
    }
    class Audiovisual{
        String modelo;
        String codigoModelo;
        
    }
    class Impressao{
        String modelo;
        String codigoModelo;
        
    }

    enum CategoriaEquipamento{
        INFORMATICA,
        AUDIOVISUAL,
        IMPRESSAO
    }
}
