package the.floow.challenge.report.entity;

import java.io.Serializable;

import org.bson.types.ObjectId;

public class CompositeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjectId fileID;
	private String word;
	public CompositeKey(ObjectId fileID, String word) {
		super();
		this.fileID = fileID;
		this.word = word;
	}
	public ObjectId getFileID() {
		return fileID;
	}
	public void setFileID(ObjectId fileID) {
		this.fileID = fileID;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	
}
