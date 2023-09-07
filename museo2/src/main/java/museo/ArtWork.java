package museo;

public class ArtWork {

    private String tipo;
    private String autor;
    private String material;
    private String descripcion;
    private String titulodeobra;
    private int añodecreacion;
    private int valorcomercial;
    private int valorhistorico;
    private double altura;	
    private double peso;
    private double ancho;
    private double diametro;
    private double espesor;
    
    
    
    public ArtWork(String autor, double altura, double ancho) {
		
		this.autor = autor;
		this.altura = altura;
		this.ancho = ancho;
	}

	public ArtWork(String tipo, String autor, String material, String descripcion, String titulodeobra, int añodecreacion, int valorcomercial, int valorhistorico, double altura, double peso, double ancho, double diametro, double espesor) {
        this.tipo = tipo;
        this.autor = autor;
        this.material = material;
        this.descripcion = descripcion;
        this.titulodeobra = titulodeobra;
        this.añodecreacion = añodecreacion;
        this.valorcomercial = valorcomercial;
        this.valorhistorico = valorhistorico;
        this.altura = altura;
        this.peso = peso;
        this.ancho = ancho;
        this.diametro = diametro;
        this.espesor = espesor;
    }

    public ArtWork() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulodeobra() {
        return titulodeobra;
    }

    public void setTitulodeobra(String titulodeobra) {
        this.titulodeobra = titulodeobra;
    }

    public int getAñodecreacion() {
        return añodecreacion;
    }

    public void setAñodecreacion(int añodecreacion) {
        this.añodecreacion = añodecreacion;
    }

    public int getValorcomercial() {
        return valorcomercial;
    }

    public void setValorcomercial(int valorcomercial) {
        this.valorcomercial = valorcomercial;
    }

    public int getValorhistorico() {
        return valorhistorico;
    }

    public void setValorhistorico(int valorhistorico) {
        this.valorhistorico = valorhistorico;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
    }
}