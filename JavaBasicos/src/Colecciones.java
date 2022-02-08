
import java.util.Set;
import java.util.Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Colecciones {
	
	//Orden de velocidad 
	//1.HashSet
	//2.LinkedHashSet
	//3.TreeSet


	public static void main(String[] args) {
		//Set<String> frutas = new HashSet<String>();
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandía");
		frutas.add("mamey");
		frutas.add("fresa");
		
		
//		for(String fruta : frutas) {
//			System.out.println(fruta);
//		}
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("patamon");
		pokemones.add("charizard");
		pokemones.add("Psyduck");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		pokemones.add(2, "volvasour");
		
		
//		for(String pokemon : pokemones) {
//			System.out.println(pokemon);
//		}
//		
//		pokemones.remove(3);
//		System.out.println("-----------------");
//		System.out.println(pokemones.get(4));
//		System.out.println(pokemones.indexOf("Gengar"));
		
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1,"Carlos Eduardo");
		usuarios.put(2,"Jonathan");
		usuarios.put(3,"Yair");
		
		System.out.println("------------------");
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		Map<Integer, String> tamales = new TreeMap<Integer, String>();
		tamales.put(4,"Mole Rojo");
		tamales.put(145,"Mole Rojo");
		tamales.put(645,"Verde");
		tamales.put(12,"Gansito");
		
		System.out.println("------------------");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		tamales.entrySet().forEach(elemento ->{
			System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			System.out.println(elemento);
		});
		
		
		
	}
}