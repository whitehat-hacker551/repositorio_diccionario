package diccionario;

public class Palabra {

String termino;
String definicion;

public Palabra(String termino, String definicion) {
	this.termino = termino;
	this.definicion = definicion;
}

String getTermino() {
	return termino;
}

void setTermino(String termino) {
	this.termino = termino;
}

String getDefinicion() {
	return definicion;
}

void setDefinicion(String definicion) {
	this.definicion = definicion;
}

}
