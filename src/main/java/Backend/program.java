package Backend;

import java.util.Scanner;

public class program {

    private String texto;
    Identificador tipoDato = Identificador.ID;
    Scanner digitDato = new Scanner(System.in);


    public program(){

        texto = digitDato.nextLine();
        IdentificarTexto(texto);

    }

    public void IdentificarTexto(String texto){
        for (int i = 0; i < texto.length(); i++) {
            
        }
    }

}
