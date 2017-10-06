package the.floow.challenge.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import the.floow.challenge.report.dao.WordCountDao;
import the.floow.challenge.report.entity.WordCount;

@Service
public class WordCountServiceImpl implements WordCountService {

	@Autowired
	WordCountDao wordCountDao; 
	
	public List<WordCount> listWordCount() {
		return this.wordCountDao.listWordCount();
	}

	public List<WordCount> listWordCount(String fileID, int limit, String order) {
		Direction sort = Direction.DESC;
		if(order.equals("1")){
			sort = Direction.ASC;
		}
		return this.wordCountDao.listWordCount(fileID,limit,sort);
	}

}
