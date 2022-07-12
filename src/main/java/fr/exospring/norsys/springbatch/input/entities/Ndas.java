package fr.exospring.norsys.springbatch.input.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Ndas {

	@XmlElement(name = "s21_g01")
	private S21G01 s21g01;

	@XmlElement(name = "s21_g02")
	private S21G02 s21g02;
}
