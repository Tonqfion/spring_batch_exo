package fr.exospring.norsys.springbatch.output;

import fr.exospring.norsys.springbatch.output.dsij.Dsij;
import fr.exospring.norsys.springbatch.output.entete.Entete;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Output {
	private Dsij dsij;
	private Entete header;
}
