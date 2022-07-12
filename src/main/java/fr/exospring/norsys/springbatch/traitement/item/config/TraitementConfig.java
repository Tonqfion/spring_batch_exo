package fr.exospring.norsys.springbatch.traitement.item.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.exospring.norsys.springbatch.model.TraitementEntity;
import fr.exospring.norsys.springbatch.traitement.item.processor.Processor;
import fr.exospring.norsys.springbatch.traitement.item.reader.Reader;
import fr.exospring.norsys.springbatch.traitement.item.writer.Writer;

@Configuration
@ComponentScan({ "fr.exospring.norsys.springbatch.traitement" })
@EnableBatchProcessing
public class TraitementConfig {

	@Bean
	public Job traitementJob(final JobBuilderFactory jobBuilderFactory, final Step mainStep) {
		return jobBuilderFactory //
				.get("traitementJob") //
				.start(mainStep) //
				.build();
	}

	@Bean
	public Step mainStep(final StepBuilderFactory stepBuilderFactory, //
			final Reader reader, //
			final ItemProcessor<TraitementEntity, TraitementEntity> processor, //
			final Writer writer) {
		return stepBuilderFactory.get("mainStep") //
				.<TraitementEntity, TraitementEntity>chunk(5) //
				.reader(reader) //
				.processor(processor) //
				.writer(writer) //
				.build();
	}

	@Bean
	@StepScope
	public Reader reader() {
		return new Reader();
	}

	@Bean
	@StepScope
	public Writer writer() {
		return new Writer();
	}

	@Bean
	@StepScope
	public ItemProcessor<TraitementEntity, TraitementEntity> processor() {
		return new Processor();
	}

}
