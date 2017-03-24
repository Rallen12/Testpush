package Model;

public class Obra {
private String artista,titulo,categoria,tipo,data;
private int id;

public Obra(String artista,String titulo,String categoria,String tipo,String data){
super();
artista = artista;
titulo = titulo;
categoria = categoria;
tipo = tipo;
data = data;
}

public String getArtista() {
	return artista;
}

public void setArtista(String artista) {
	this.artista = artista;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


}

