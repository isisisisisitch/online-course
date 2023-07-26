package ca.bytetube.business.controller.admin;

import ca.bytetube.server.domain.Chapter;
import ca.bytetube.server.dto.ChapterDto;
import ca.bytetube.server.dto.PageDto;
import ca.bytetube.server.service.ChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    private static final Logger LOG = LoggerFactory.getLogger(ChapterController.class);

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public PageDto list(@RequestBody PageDto pageDto) {
        LOG.info("pageDto: {}", pageDto);
        chapterService.list(pageDto);
        return pageDto;
    }

    @RequestMapping("/save")
    public ChapterDto save(@RequestBody ChapterDto chapterDto) {
        LOG.info("chapterDto: {}", chapterDto);
        chapterService.save(chapterDto);
        return chapterDto;
    }
}

