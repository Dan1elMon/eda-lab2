import java.util.ArrayList;

public class ejercicioResuelto{
	public static void main(String []args){
		ArayList<String> alumnos=new ArrayList<String>();
		ArayList<Integer> notas=new ArrayList<Integer>();
		
		alumnos.add("Henry");
		alumnos.add("Diego");
		alumnos.add("Richart");
		alumnos.add("Gabriel");
		System.out.println(alumnos.hashcode);
		System.out.println(alumnos.IsEmpty);
		System.out.println(alumnos.size);

		Iterator<String> itA = 	alumnos.interator();

	}
}

