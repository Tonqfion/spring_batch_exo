package fr.exospring.norsys.springbatch.item;

import org.springframework.batch.item.ItemProcessor;

import fr.exospring.norsys.springbatch.output.TreatmentEntity;

public class Processor implements ItemProcessor<TreatmentEntity, TreatmentEntity> {

	@Override
	public TreatmentEntity process(TreatmentEntity item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
