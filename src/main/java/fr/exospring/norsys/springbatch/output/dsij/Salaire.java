package fr.exospring.norsys.springbatch.output.dsij;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Salaire {
	
	@XmlElement(name="debut")
	private LocalDate debut;
	
	@XmlElement(name="fin")
	private LocalDate fin;
	
	@XmlElement(name="montant")
	private int montant;
}
