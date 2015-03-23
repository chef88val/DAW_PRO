public class Cifrar {
 
    int desplazamiento;
    String mensaje;
    String clave = "";
    String caracter;
    char array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
 
    public String descifrarMensaje(String msj, int desp){
        mensaje = msj;
        desplazamiento = desp;
        recorrerMensaje();
        return clave;
    }
 
    /**
     * Recorrer cada letra del mensaje
     */
    private void recorrerMensaje(){
        String decod = "";
        for(int i = 0; i <= mensaje.length() - 1; i++){
            caracter = mensaje.substring(i, i + 1);
            if(!caracter.equals(" ")){
                int posicion = getPosicionCaracter(caracter);
                decod = decrypt(posicion);
                clave += decod;
            }else{
                clave += " ";
            }
        }
        //String substring = mensaje.substring(desplazamiento, desplazamiento)
    }
 
    private int getPosicionCaracter(String letra){
        int posicion = 0;
        for(int i = 0; i <= array.length; i++){
            if(String.valueOf(array[i]).equals(letra)){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
 
    //Desencripta un caracter
    public String decrypt(int c){
        int posicion = c + desplazamiento;
        if(posicion > array.length - 1) posicion = posicion - array.length;
        String decod = String.valueOf(array[posicion]);
        return decod;
    }
}