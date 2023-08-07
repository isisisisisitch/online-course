package ca.bytetube.server.service;

import ca.bytetube.server.domain.Category;
import ca.bytetube.server.domain.CategoryExample;
import ca.bytetube.server.dto.CategoryDto;
import ca.bytetube.server.dto.PageDto;
import ca.bytetube.server.mapper.CategoryMapper;
import ca.bytetube.server.util.CopyUtil;
import ca.bytetube.server.util.UuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    /**
     * 列表查询
     */
    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.setOrderByClause("sort asc");
        List<Category> categoryList = categoryMapper.selectByExample(categoryExample);
        PageInfo<Category> pageInfo = new PageInfo<>(categoryList);
        pageDto.setTotal(pageInfo.getTotal());
        List<CategoryDto> categoryDtoList = CopyUtil.copyList(categoryList, CategoryDto.class);
        pageDto.setList(categoryDtoList);
    }

    /**
     * 保存，id有值时更新，无值时新增
     */
    public void save(CategoryDto categoryDto) {
        Category category = CopyUtil.copy(categoryDto, Category.class);
        if (StringUtils.isEmpty(categoryDto.getId())) {
            this.insert(category);
        } else {
            this.update(category);
        }
    }

    /**
    * 新增
    */
    private void insert(Category category) {
    category.setId(UuidUtil.getShortUuid());
    categoryMapper.insert(category);
    }

    /**
     * 更新
     */
    private void update(Category category) {
        categoryMapper.updateByPrimaryKey(category);
    }

    /**
     * 删除
     */
    public void delete(String id) {
        categoryMapper.deleteByPrimaryKey(id);
    }
}