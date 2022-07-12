package fr.exospring.norsys.springbatch.item;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import fr.exospring.norsys.springbatch.input.entities.Ndas;

public class Reader implements ItemReader<Ndas> {

	@Override
	public Ndas read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

}
