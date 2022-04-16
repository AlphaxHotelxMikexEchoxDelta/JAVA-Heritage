public class Lecteur{

protected int numero ;    
protected String titre ;
protected int nbAudioBook = 0 ;
public final int nombreAudioBook_Max = 5;   

	public Lecteur(int numero, String titre){
		this.numero = numero   ;
		this.titre = titre ;        
		if( nbAudioBook < nombreAudioBook_Max ){ nbAudioBook ++ ; }
	}    
	
	public Lecteur(int numero){
		this.numero = numero ;        
		if( nbAudioBook < nombreAudioBook_Max ){ nbAudioBook ++ ; }
	}
	
	public int getNB_AudioBook(){ return this.nbAudioBook ; }    
	public int getnbADBMax(){ return nombreAudioBook_Max ; }
	
	public void setNumero( int numero ){ this.numero = numero ; }
	public void setTitre( String titre ){ this.titre = titre ; }   

	public void moreAUB(){ 
		if(nbAudioBook < nombreAudioBook_Max){ nbAudioBook += 1 ; } 
	}
	
	public String toHTML(){
		String html = "<div>\n\t" + numero + "(" + nbAudioBook + "produits )\n\t"	+ titre + "\n" + "<div>\n"; 
		if(nbAudioBook == nombreAudioBook_Max){ html = "<div>\n\t" + numero + "( <strong>Production bloquee</strong> )\n\t"	+ titre + "\n" + "<div>\n" ;}
		return html ;
	}
	
	
	public String toString(){ 
		return "Oeuvre[ " + numero + ":" + titre + " ]	\n avec " 
				+ nbAudioBook + " AudioBooks sur " 
				+ nombreAudioBook_Max + " maximum" ; 
	}

}
