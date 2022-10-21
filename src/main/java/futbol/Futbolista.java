package futbol;
import javax.swing.plaf.FontUIResource;



public abstract class Futbolista implements  Comparable {
	 private String nombre;
	 private int edad;
	 private String posicion;
	 
	
	 //contructores
	
	 
	 public Futbolista(String nombre, int edad, String posicion) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.posicion = posicion;
	    }
	 
	 public Futbolista(){
	        this.nombre = "Maradona";
	        this.edad = 30;
	        this.posicion = "delantero";
	 }
	 
	 //metodos getter
	 
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public int getEdad() {
	        return edad;
	    }
	    
	    public String getPosicion() {
	        return posicion;
	    }
	    

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }



	    public void setEdad(int edad) {
	        this.edad = edad;
	    }


	    public void setPosicion(String posicion) {
	        this.posicion = posicion;
	    }
	 
	    
	    @Override
	    public String toString() {
	        return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
	    }
	    
	    
	    @Override
	    public boolean equals(Object obj) {
	        return super.equals(obj);
	    }
	    
	    @Override
	    public int compareTo(Object x) {
	        return 0;
	    }
	    
	    public abstract boolean jugarConLasManos();
	 
	

}
