package gc.com.service;

import gc.com.entity.GcUser;
import java.util.List;

/**
 * (GcUser)表服务接口
 *
 * @author makejava
 * @since 2019-11-06 15:29:42
 */
public interface GcUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    GcUser queryById(Integer uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<GcUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param gcUser 实例对象
     * @return 实例对象
     */
    GcUser insert(GcUser gcUser);

    /**
     * 修改数据
     *
     * @param gcUser 实例对象
     * @return 实例对象
     */
    GcUser update(GcUser gcUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}