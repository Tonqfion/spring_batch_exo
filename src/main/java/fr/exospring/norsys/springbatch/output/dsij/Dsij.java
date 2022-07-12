package fr.exospring.norsys.springbatch.output.dsij;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Dsij {
	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="type")
	private String type;
	
	@XmlElement(name="ouverture_droit")
	private OuvertureDroit ouvertureDroit;
}
