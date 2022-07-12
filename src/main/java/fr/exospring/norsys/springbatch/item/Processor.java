package fr.exospring.norsys.springbatch.item;

import org.springframework.batch.item.ItemProcessor;

import fr.exospring.norsys.springbatch.input.entities.Ndas;
import fr.exospring.norsys.springbatch.output.Output;

public class Processor implements ItemProcessor<Ndas, Output> {

	@Override
	public Output process(Ndas item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
