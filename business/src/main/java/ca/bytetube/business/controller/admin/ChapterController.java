package ca.bytetube.business.controller.admin;

import ca.bytetube.server.domain.Chapter;
import ca.bytetube.server.dto.ChapterDto;
import ca.bytetube.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin/chapter")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @RequestMapping("/list")
    public List<ChapterDto> list() {
        return chapterService.list();
    }
}

