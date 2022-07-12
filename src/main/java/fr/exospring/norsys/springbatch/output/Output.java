package fr.exospring.norsys.springbatch;

import fr.exospring.norsys.springbatch.output.dsij.Dsij;
import fr.exospring.norsys.springbatch.output.header.Header;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Output {
	private Dsij dsij;
	private Header header;
}
