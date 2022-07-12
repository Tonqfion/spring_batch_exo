package fr.exospring.norsys.springbatch.output.dsij;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class OuvertureDroit {
	
	@XmlElement(name="salaire")
	private Salaire salaire;
	
	@XmlElement(name="reponse")
	private String reponse;
}
