package the.floow.challenge.report.service;

import java.util.List;

import the.floow.challenge.report.entity.WordCount;

public interface WordCountService {
	public List<WordCount> listWordCount();
	public List<WordCount> listWordCount(String fileID, int limit, String order);
}
