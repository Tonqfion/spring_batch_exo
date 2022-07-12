package fr.exospring.norsys.springbatch.input.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class S21G02 {
	
	@XmlElement(name="s21_g02_01")
	private final List<S21G0201> s21g0201;

}
