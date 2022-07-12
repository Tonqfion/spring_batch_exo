package fr.exospring.norsys.springbatch.input.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class S21G0201 {
	
	@XmlElement(name="s21_g02_01_01")
	private final String s21g020101;
	
	@XmlElement(name="s21_g02_01_02")
	private final String s21g020102;
	
	@XmlElement(name="s21_g02_01_03")
	private final float s21G020103;

}
