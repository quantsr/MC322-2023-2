package library;

public class Comentario {
    int membroId;
    int itemId;
    String texto;
    //test
    
    public Comentario(int membroId, int itemId, String texto) {
        this.membroId = membroId;
        this.itemId = itemId;
        this.texto = texto;
    }

    public int getMembroId() {
        return membroId;
    }

    public void setMembroId(int membroId) {
        this.membroId = membroId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
