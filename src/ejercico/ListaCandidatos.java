package ejercico;

import java.util.ArrayList;

public class ListaCandidatos {
	
	private ArrayList<Candidato> candidatos;
	private static ListaCandidatos miLista=new ListaCandidatos();
	private ListaCandidatos(){
		this.candidatos=new ArrayList<Candidato>();
	}
	public static ListaCandidatos getListaCandidatos()
{
	return miLista;
}
private ArrayList<Candidatos> getLista() {
	return candidatos;
}
public int getTamano()
{
	return ListaCandidatos.getListaCandidatos().getLista().size();
}
private Iterator<Libro> getIterador()
{
	return ListaCandidatos.getListaCandidatos().getLista().iterator();
}
public Candidato buscarCandidato(Candidato pCandidato)
{
	Candidato unCandidato;
	iterador<candidato> it=getIterador();
	boolean enc=false;
	while (!enc && it.hasNext())
	   {  
		unCandidato = it.next(); 
		//if (unCandidato.getApellido()<)
		   if (unCandidato.getNombre() == pCandidato.getNombre()&& unCandidato.getApellido()==pCAndidato.getApellidoI())
		    {
			   enc = true;	 
	        }
	   }
	   if (enc)
	   {
		   return unCandidato;
	   }
	   else
	   {
		   return null;
	   }
   }
}
	//Saber a que partido es cada candidato
	//Buscar un candidato concreto
    
    public void agregarCandidato(Candidato pCandidato){
    	//this.ordenar();
    	if(buscarCandidato(pCandidato)==null)
    	{
    		ListaCandidatos.getListaCandidatos().getLista().add(pCandidato);
    	}
    }
    
   /* public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}*/

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public void eliminarCandidato(Candidato candidato){
    	
    }
    
    public void busquedaCandidato(){}
    
}
