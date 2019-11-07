package gc.com.dao;

import gc.com.entity.GcUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (GcUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-06 15:29:41
 */
public interface GcUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    GcUser queryById(Integer uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GcUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param gcUser 实例对象
     * @return 对象列表
     */
    List<GcUser> queryAll(GcUser gcUser);

    /**
     * 新增数据
     *
     * @param gcUser 实例对象
     * @return 影响行数
     */
    int insert(GcUser gcUser);

    /**
     * 修改数据
     *
     * @param gcUser 实例对象
     * @return 影响行数
     */
    int update(GcUser gcUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(Integer uid);

}