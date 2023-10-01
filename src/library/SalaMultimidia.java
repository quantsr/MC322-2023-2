package library;

public class SalaMultimidia extends Sala {
    
    boolean gravadorAudio;
    boolean gravadorCD;
    boolean gravadorDVD;
    boolean editorAudio;
    boolean leitorCD;
    boolean leitorDVD;
    public SalaMultimidia(int id, boolean gravadorAudio,
            boolean gravadorCD, boolean gravadorDVD, boolean editorAudio, boolean leitorCD, boolean leitorDVD) {
        super(id, 1);
        this.gravadorAudio = gravadorAudio;
        this.gravadorCD = gravadorCD;
        this.gravadorDVD = gravadorDVD;
        this.editorAudio = editorAudio;
        this.leitorCD = leitorCD;
        this.leitorDVD = leitorDVD;
    }
    public boolean isGravadorAudio() {
        return gravadorAudio;
    }
    public void setGravadorAudio(boolean gravadorAudio) {
        this.gravadorAudio = gravadorAudio;
    }
    public boolean isGravadorCD() {
        return gravadorCD;
    }
    public void setGravadorCD(boolean gravadorCD) {
        this.gravadorCD = gravadorCD;
    }
    public boolean isGravadorDVD() {
        return gravadorDVD;
    }
    public void setGravadorDVD(boolean gravadorDVD) {
        this.gravadorDVD = gravadorDVD;
    }
    public boolean isEditorAudio() {
        return editorAudio;
    }
    public void setEditorAudio(boolean editorAudio) {
        this.editorAudio = editorAudio;
    }
    public boolean isLeitorCD() {
        return leitorCD;
    }
    public void setLeitorCD(boolean leitorCD) {
        this.leitorCD = leitorCD;
    }
    public boolean isLeitorDVD() {
        return leitorDVD;
    }
    public void setLeitorDVD(boolean leitorDVD) {
        this.leitorDVD = leitorDVD;
    }
}
