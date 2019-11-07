package gc.com.service.impl;

import gc.com.entity.GcUser;
import gc.com.dao.GcUserDao;
import gc.com.service.GcUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GcUser)表服务实现类
 *
 * @author makejava
 * @since 2019-11-06 15:29:43
 */
@Service("gcUserService")
public class GcUserServiceImpl implements GcUserService {
    @Resource
    private GcUserDao gcUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public GcUser queryById(Integer uid) {
        return this.gcUserDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GcUser> queryAllByLimit(int offset, int limit) {
        return this.gcUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gcUser 实例对象
     * @return 实例对象
     */
    @Override
    public GcUser insert(GcUser gcUser) {
        this.gcUserDao.insert(gcUser);
        return gcUser;
    }

    /**
     * 修改数据
     *
     * @param gcUser 实例对象
     * @return 实例对象
     */
    @Override
    public GcUser update(GcUser gcUser) {
        this.gcUserDao.update(gcUser);
        return this.queryById(gcUser.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.gcUserDao.deleteById(uid) > 0;
    }
}