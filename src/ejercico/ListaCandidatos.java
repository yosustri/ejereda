package ejercico;

import java.util.ArrayList;

public class ListaCandidatos {
	
	private static ListaCandidatos listaCandidatos = new ListaCandidatos();
	
	ArrayList<Candidato> candidatos;
	
	public ListaCandidatos(){}
	
	//Saber a que partido es cada candidato
	//Buscar un candidato concreto

    public static ListaCandidatos getInstance() {
        return listaCandidatos;
    }
    
    public void agregarCandidato(){
    	
    }
    
    public void eliminarCandidato(Candidato candidato){
    	
    }
    
    public void busquedaCandidato(){}
    
}
