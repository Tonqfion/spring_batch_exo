package fr.exospring.norsys.springbatch.input.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class S21G01 {
	
	@XmlElement(name="s21_g01_01")
	private final String s21g0101;
	
	@XmlElement(name="s21_g01_02")
	private final String s21g0102;
	
	@XmlElement(name="s21_g01_03")
	private final String s21g0103;
}
