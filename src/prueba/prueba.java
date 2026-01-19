package prueba;

public class prueba {
	public static void main(String[] args) {
		System.out.println("Bienvenido al programa");
		imprimirNumeros();
		saludo();
	}

	public static void imprimirNumeros() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            // COMENTARIO POR MARIO
            //Hola buenas tardes soy Sergio el presi
        }
	}
	public static void saludo() {
		System.out.println("Hablo desde la rama de Mario");
		System.out.println("Hablo desde la rama de Sergio");
	}
}
