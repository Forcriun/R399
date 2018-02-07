import java.util.ArrayList;

class EjercicioR399
{
    public String encontrarPalabraConMasAes(ArrayList<String> palabras) 
    {
        // Escribe tu código a continuación...
        String palabraConMasAes = null;
        int x = 0;  // contador del bucle while
        int numMasAes = 0;
        
        while(x < palabras.size()){
            int numAes = 0;
            int y = 0;  // contador del substring
            while(y < palabras.get(x).length()){
                if(palabras.get(x).substring(y,y+1).contains("a")){
                    numAes++;
                }
                y++;
            }
            if(numAes > numMasAes){
                palabraConMasAes = palabras.get(x);
            }
            x++;
        }

        return palabraConMasAes;
    }

    // A continuación puedes escribir otros métodos si lo necesitas...

}