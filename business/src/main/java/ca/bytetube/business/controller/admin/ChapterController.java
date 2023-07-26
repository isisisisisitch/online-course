package ca.bytetube.business.controller.admin;

import ca.bytetube.server.domain.Chapter;
import ca.bytetube.server.dto.ChapterDto;
import ca.bytetube.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;
    //http://127.0.0.1:9002/business/admin/chapter
    @RequestMapping("/chapter")
    public List<ChapterDto> chapter() {
        return chapterService.list();
    }
}
