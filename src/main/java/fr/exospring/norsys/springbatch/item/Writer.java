package fr.exospring.norsys.springbatch.item;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import fr.exospring.norsys.springbatch.output.Output;

public class Writer implements ItemWriter<Output>{

	@Override
	public void write(List<? extends Output> items) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
