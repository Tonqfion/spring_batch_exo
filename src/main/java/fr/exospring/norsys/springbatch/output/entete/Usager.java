package fr.exospring.norsys.springbatch.output.entete;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Usager {
	
	@XmlElement(name="nom")
	private String nom;
	
	@XmlElement(name="prenom")
	private String prenom;
	
	@XmlElement(name="nir")
	private int nir;
	
	@XmlElement(name="civilite")
	private String civilite;
}
