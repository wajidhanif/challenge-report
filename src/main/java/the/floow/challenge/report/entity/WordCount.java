package the.floow.challenge.report.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="wordCounts")
public class WordCount {
	
	@Id
	private CompositeKey id;
	private double value;
	
	public WordCount(CompositeKey id, double value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public CompositeKey getId() {
		return id;
	}

	public void setId(CompositeKey id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}	
}

