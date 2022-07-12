package fr.exospring.norsys.springbatch.output.header;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class header {
	
	@XmlElement(name="id")
	private String id;
	
	@XmlElement(name="usager")
	private Usager usager;
}
