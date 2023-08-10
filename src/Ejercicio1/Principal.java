package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] emps = new Empleado[5];
		emps[0] = new Empleado();
		emps[0].setNombre("Ramiro");
		emps[0].setEdad(15);
		emps[1] = new Empleado();
		emps[1].setNombre("Juana");
		emps[1].setEdad(33);
		emps[2] = new Empleado("Jose",30);
		emps[3] = new Empleado("Rita", 24);
		emps[4] = new Empleado("Noa", 18);
		
		for (Empleado empleado : emps) {
			System.out.println(empleado.toString());
		}
		
		System.out.println(Empleado.devuelveProximoID());
	}

}
