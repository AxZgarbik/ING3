
package Modelo;


public class Persona {

    
    private String nombre = "";
    private int numTel;
    private String Direc = "";
    private String Dcorreo="";
    
    public Persona (String nombre,int numTel, String Direc, String Dcorreo){
        this.nombre=nombre;
        this.numTel=numTel;
        this.Direc=Direc;
        this.Dcorreo=Dcorreo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    public String getDcorreo() {
        return Dcorreo;
    }

    public void setDcorreo(String Dcorreo) {
        this.Dcorreo = Dcorreo;
    }
    @Override
    public String toString(){
        String mensaje = "El Nombre es: "+nombre +
                "la direccion es: "+Direc +
                "el numero de telefono es: "+numTel +
                "el correo electronico es: "+Dcorreo;
        return mensaje;
        
    }
}
