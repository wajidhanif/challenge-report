package the.floow.challenge.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import the.floow.challenge.report.dao.FileDao;
import the.floow.challenge.report.entity.Files;

@Service
public class FilesServiceImpl implements FilesService {

	@Autowired
	FileDao fileDao;
	
	public List<Files> listAll() {
		return this.fileDao.listAll();
	}
}
