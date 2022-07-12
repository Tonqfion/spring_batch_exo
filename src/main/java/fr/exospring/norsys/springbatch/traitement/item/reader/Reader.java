package fr.exospring.norsys.springbatch.traitement.item.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import fr.exospring.norsys.springbatch.model.TraitementEntity;

public class Reader implements ItemReader<TraitementEntity> {

	@Override
	public TraitementEntity read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		return null;
	}

}
