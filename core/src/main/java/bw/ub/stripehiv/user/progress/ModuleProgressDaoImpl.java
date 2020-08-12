// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on 08/09/2020 08:55:54+0200.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.ub.stripehiv.user.progress;

import bw.ub.stripehiv.user.progress.vo.ModuleProgressVO;
import bw.ub.stripehiv.user.vo.UserVO;

import org.springframework.stereotype.Repository;

/**
 * @see ModuleProgress
 */
@Repository("moduleProgressDao")
public class ModuleProgressDaoImpl
    extends ModuleProgressDaoBase
{
    /**
     * {@inheritDoc}
     */
    @Override
    public void toModuleProgressVO(
        ModuleProgress source,
        ModuleProgressVO target)
    {
        // TODO verify behavior of toModuleProgressVO
        super.toModuleProgressVO(source, target);
        if(source.getStartDate() != null) {
        	target.setStartDate(source.getStartDate());
        }
        
        target.setCompletionDate(source.getCompletionDate());
        
        if(source.getModule() != null) {
        	target.setModuleVO(getModuleDao().toModuleVO(source.getModule()));
        }
        
        if(source.getUser() != null) {
        	UserVO user = new UserVO();
        	user.setId(source.getUser().getId());
        	user.setUsername(source.getUser().getUsername());
        	
        	target.setUserVO(user);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModuleProgressVO toModuleProgressVO(final ModuleProgress entity)
    {
        // TODO verify behavior of toModuleProgressVO
        return super.toModuleProgressVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private ModuleProgress loadModuleProgressFromModuleProgressVO(ModuleProgressVO moduleProgressVO)
    {
        if (moduleProgressVO.getId() == null)
        {
            return  ModuleProgress.Factory.newInstance();
        }
        else
        {
            return this.load(moduleProgressVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public ModuleProgress moduleProgressVOToEntity(ModuleProgressVO moduleProgressVO)
    {
        // TODO verify behavior of moduleProgressVOToEntity
        ModuleProgress entity = this.loadModuleProgressFromModuleProgressVO(moduleProgressVO);
        this.moduleProgressVOToEntity(moduleProgressVO, entity, true);
        
        if(moduleProgressVO.getStartDate() != null) {
        	entity.setStartDate(moduleProgressVO.getStartDate());
        }
        
        if(moduleProgressVO.getModuleVO() != null && moduleProgressVO.getModuleVO().getId() != null) {
        	entity.setModule(getModuleDao().load(moduleProgressVO.getModuleVO().getId()));
        }
        
        if(moduleProgressVO.getUserVO() != null && moduleProgressVO.getUserVO().getId() != null) {
        	entity.setUser(getUserDao().load(moduleProgressVO.getUserVO().getId()));
        }
        
        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moduleProgressVOToEntity(
        ModuleProgressVO source,
        ModuleProgress target,
        boolean copyIfNull)
    {
        // TODO verify behavior of moduleProgressVOToEntity
        super.moduleProgressVOToEntity(source, target, copyIfNull);
        
    }
}