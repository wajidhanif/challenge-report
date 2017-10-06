package the.floow.challenge.report.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import the.floow.challenge.report.entity.Files;
import the.floow.challenge.report.entity.WordCount;
import the.floow.challenge.report.service.FilesService;
import the.floow.challenge.report.service.WordCountService;

@Controller
@RequestMapping(value="/words")
public class WordCountController {

	@Autowired
	WordCountService wordCountService; 
	
	@Autowired
	FilesService filesService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView model = new ModelAndView("words/list");
		List<Files> fileList = this.filesService.listAll();
		model.addObject("fileList", fileList);
		return model;
	}
	
	@RequestMapping(value="/counts", method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView wordCounts(@RequestParam("fileID") String fileID, 
									@RequestParam("limit") String limit,
									@RequestParam("order") String order){
		ModelAndView model = new ModelAndView("words/list");
		List<WordCount> list = this.wordCountService.listWordCount(fileID, Integer.parseInt(limit),order);
		model.addObject("listWords", list);
		
		List<Files> fileList = this.filesService.listAll();
		model.addObject("fileList", fileList);
	
		return model;
	}
	
}
