package Mundo;



public class CentralClientes {
	
	public Cliente primero;
	
	// Insertar un elemento en la lista
		public void insert1Elemento(Cliente a) {
			// Si esta vacia
			Cliente actual;
			if (primero == null) {
				primero = a;
				a.setSiguiente(null);
			} else {
				a.setSiguiente(primero);
				primero = a;
			}
		}

		// Mostramos la lista
		public void mostrarLista() {
			Cliente actual = primero;
			// System.out.println("El siguiente es" + actual.getContendio());
			while (actual != null) {
				System.out.println("El cliente llamado " + actual.getNombre() + "Se encuentra en nuestra base de datos identificado con el código único " + actual.getIdentificacion());
				actual = actual.getSiguiente();
			}
		}

		// Buscar un elemento
		public Cliente buscarElemento(int codigo) {
			Cliente actual = primero;
			while (actual != null && actual.getIdentificacion() != codigo) {
				actual = actual.getSiguiente();
			}
			// System.out.println("El elemento es" + actual.getContendio());
			return actual;

		}

		// localizar el ultimo elemento
		public Cliente encontrarUltimo() {
			Cliente actual = primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			System.out.println("El ultimo elemento es " + actual.getIdentificacion());
			return actual;
		}

		// Localizar elemento anterior a otro elemento
		public Cliente encontraAntesDe(int codigo) {
			Cliente anterior = null;
			Cliente actual = primero;
			while (actual != null && actual.getIdentificacion() != codigo) {
				anterior = actual;
				actual = actual.getSiguiente();
			}
			System.out.println("El elemento anterior a " + codigo + "es " + anterior.getIdentificacion());
			return actual != null ? anterior : null;
		}

		// Calcular el número de elementos de la lsita
		public int nElementos() {
			Cliente actual = primero;
			int longitud = 0;
			while (actual != null) {
				longitud++;
				actual = actual.getSiguiente();

			}
			return longitud;
		}

		// insertar despues de un elemento del cual tenemos la referencia
		public void insertarDespuesDe(int codigo, Cliente n) {
			Cliente actual = buscarElemento(codigo);
			// System.out.println(actual.getSiguiente().getContendio());
			n.setSiguiente(actual.getSiguiente());
			actual.setSiguiente(n);

		}

		// eliminar un elemento
		public void eliminarElemento(int codigo) {
			Cliente actual = buscarElemento(codigo);
			Cliente anterior = encontraAntesDe(codigo);
			anterior.setSiguiente(actual.getSiguiente());
		}

		// Insertar un elemento al final
		public void insertarAlfinal(Cliente n) {
			Cliente ultimo = encontrarUltimo();
			ultimo.setSiguiente(n);
			n.setSiguiente(null);

		}

		// Insertar un elemento antes de otro
		public void insertarAntesDe(int codigo, Cliente n) {
			Cliente actual = buscarElemento(codigo);
			Cliente anterior = encontraAntesDe(codigo);
			anterior.setSiguiente(n);
			n.setSiguiente(actual);
		}

		// Desconectar
		public Cliente desconectar() {
			Cliente desc = primero;
			primero.setSiguiente(primero.getSiguiente());
			return desc;

		}

		// Invertir la lista
		public void invertirListaNuevo() {

			Cliente actual = primero, temp = null;

			while (actual.getSiguiente() != null) {

				temp = actual.getSiguiente();

				actual.setSiguiente(temp.getSiguiente());

				temp.setSiguiente(primero);

				primero = temp;

			}
		}
		
		//Mover un elemento al comienzo
		public void moverAlComienzo(int codigo) {
			//Encontramos el elemento y nos situamos en el
			Cliente actual = buscarElemento(codigo);
			//Encontramos el anterior a dicho elemento
			Cliente anterior = encontraAntesDe(actual.getIdentificacion());
			anterior.setSiguiente(actual.getSiguiente());
			actual.setSiguiente(primero);
			primero = actual;		
			
		}
		
		//mover un elemento al final
		public void moverAlfinal(int codigo) {
			//Encontramos el elemento y nos situamos en el
			Cliente actual = buscarElemento(codigo);
			//Encontramos el antrior a dicho elemento
			Cliente anterior = encontraAntesDe(codigo);
			//Encontramos el ultimo elemento de la lista
			Cliente ultimo = encontrarUltimo();
			anterior.setSiguiente(actual.getSiguiente());
			ultimo.setSiguiente(actual);
			actual.setSiguiente(null);
		}
		
		//Ordenar la lista
		public void ordenarLista() {
			Cliente anterior = primero,temp=null;
			Cliente actual = anterior.getSiguiente();
			int longitud = nElementos(),i=0;
			while(i<=longitud) {
				while(actual!=null) {
					if(anterior.getIdentificacion() > actual.getIdentificacion()) {
						temp = actual;
						
					}
				}
			}
			
		}

}
