package the.floow.challenge.report.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import the.floow.challenge.report.entity.Files;
import the.floow.challenge.report.entity.WordCount;


@Repository
public class FileDaoImpl implements FileDao{

	@Autowired
	MongoTemplate mongoTemplete;
	
	private static final String collectionName = "files";

	public List<Files> listAll() {
		Query query = new Query();
		query.limit(10);
		query.with(new Sort(Sort.Direction.ASC, "name"));

		return this.mongoTemplete.find(query, Files.class);
	}
}
