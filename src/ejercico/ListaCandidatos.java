package ejercico;

import java.util.ArrayList;
//import java.util.Iterator;

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
private ArrayList<Candidato> getLista() {
return candidatos;
}
public int getTamano()
{
return ListaCandidatos.getListaCandidatos().getLista().size();
}
/*private Iterator<Candidato> getIterador()
{
return ListaCandidatos.getListaCandidatos().getLista().iterator();
}*/
public int  buscarCandidato(Candidato pCandidato)
{
	//busca segun el apellido
	
Candidato unCandidato;
int min,mitad,max;
//Iterator<Candidato> it=getIterador();
boolean enc=false;
min=0;
max=this.getTamano()-1;
mitad=(int)(max+min)/2;   	//Redondea a lo bajo
unCandidato=this.getLista().get(mitad);
while (!enc)
{
	if(unCandidato==pCandidato)
	{
		enc=true;
		return mitad;
	}
	if(unCandidato.getApellido().compareTo(pCandidato.getApellido())<0 &&!enc)
	{
		min=mitad+1;
	}
	else
	{
		max=mitad-1;
	}
	mitad=(int)(max+min)/2;
	unCandidato=this.getLista().get(mitad);
	if(min>max)
	{
		return mitad+1;
	}
}
return -1;
}

//Saber a que partido es cada candidato
    
    public void agregarCandidato(Candidato pCandidato){//Ordenadamente
    this.getListaCandidatos().getLista().add(this.buscarCandidato(pCandidato),pCandidato);
     System.out.println("añadido");
     
    }
    
public void eliminarCandidato(Candidato pCandidato){
	int indice=this.buscarCandidato(pCandidato);
    if(this.getLista().get(indice)!=pCandidato)
    {
    	System.out.println("No existe ese candidato");
    }
    else
    {
    ListaCandidatos.getListaCandidatos().getLista().remove(indice);	
    }
    }
   
    
}

