package the.floow.challenge.report.dao;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import the.floow.challenge.report.entity.CompositeKey;
import the.floow.challenge.report.entity.WordCount;


@Repository
public class WordCountDaoImpl implements WordCountDao{

	@Autowired
	MongoTemplate mongoTemplete;
	
	private static final String collectionName = "wordCounts";
	/*
	public List<WordCount> listWordCount() {
		return this.mongoTemplete.findAll(WordCount.class, this.collectionName);
	}

	*/
	public List<WordCount> listWordCount() {
		Query query = new Query();
		query.limit(10);
		query.with(new Sort(Sort.Direction.DESC, "value"));

		return this.mongoTemplete.find(query, WordCount.class);

//		return this.mongoTemplete.findAll(WordCount.class, this.collectionName);
	}
	
	public List<WordCount> listWordCount(String fileID, int limit, Direction order) {
		Criteria crt = Criteria.where("_id.FileID").is(new ObjectId(fileID));
		Sort sort = new Sort(order,"value");
		
		Query query = new Query();		
		query.addCriteria(crt);
		query.limit(limit).with(sort);
		
		return this.mongoTemplete.find(query, WordCount.class);

	}
}
