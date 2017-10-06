package the.floow.challenge.report.dao;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import the.floow.challenge.report.entity.WordCount;

public interface WordCountDao {
	public List<WordCount> listWordCount();
	public List<WordCount> listWordCount(String fileID, int limit, Direction sort);

}
