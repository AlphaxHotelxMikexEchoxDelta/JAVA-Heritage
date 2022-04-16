public class Evaluation extends Lecteur {

private String personnage ;
private int numero ;
private String titre ;

public Evaluation( String personnage, int numero, String titre){
	super(numero, titre);
	this.personnage = personnage ;
	}

public String toHTML(){
	
	String html = "<div>\n\t" + super.numero + "(" + super.nbAudioBook + "produits )\n\t" 
				+ personnage + "\n\t" + super.titre + "\n" + "<div>\n"; 
	
	if(nbAudioBook == nombreAudioBook_Max){ 
		html = "<div>\n\t" + super.numero + "( <strong>Production bloquee</strong> )\n\t"	
				+ personnage + "\n\t" + super.titre + "\n" + "<div>\n" ;
	}
	return html ;
}


}
