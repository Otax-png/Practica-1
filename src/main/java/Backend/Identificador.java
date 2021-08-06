package Backend;

public enum Identificador {

    ID("ID","ENTERO","DECIMAL","SIMBOLO","ERROR");

    private String id;
    private String entero;
    private String decimal;
    private String simbolo;
    private String error;

    Identificador(String id, String entero, String decimal, String simbolo, String error) {
        this.id = id;
        this.entero = entero;
        this.decimal = decimal;
        this.simbolo = simbolo;
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public String getEntero() {
        return entero;
    }

    public String getDecimal() {
        return decimal;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getError() {
        return error;
    }
}
