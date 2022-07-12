package fr.exospring.norsys.springbatch.item;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import fr.exospring.norsys.springbatch.output.TreatmentEntity;

public class Writer implements ItemWriter<TreatmentEntity>{

	@Override
	public void write(List<? extends TreatmentEntity> items) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
