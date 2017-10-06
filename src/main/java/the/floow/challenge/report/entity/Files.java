package the.floow.challenge.report.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="files")
public class Files {
	
	@Id
	private ObjectId id;
	private String name;
	public Files(ObjectId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

