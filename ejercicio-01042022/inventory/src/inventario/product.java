
package inventario;


public class product {
    private int numelements;
    private String nombrepro;
    private int unidades;
    private int precio;

    @Override
    public String toString() {
        return "productos \n" + 
                "numelements  =  " + numelements +
                "nombrepro     =  " + nombrepro +"\n"+ 
                " unidades  =  " + unidades + "\n"+ 
                " precio  =  " + precio;
    }

    
    
    
    
    //Se genera un constructor vacio
    public product() {
    }
    //Se genera un constructor con los 4 parametros
    public product(int numelements, String nombrepro, int unidades, int precio) {
        this.numelements = numelements;
        this.nombrepro = nombrepro;
        this.unidades = unidades;
        this.precio = precio;
    }
    //Se generan los Getters para obtener la info y setters para settear la info
    public int getNumelements() {
        return numelements;
    }

    public void setNumelements(int numelements) {
        this.numelements = numelements;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
    
    
}
