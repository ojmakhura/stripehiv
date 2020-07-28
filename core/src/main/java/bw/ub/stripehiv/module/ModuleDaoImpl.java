// Generated by hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge on 07/27/2020 15:18:02+0200.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package bw.ub.stripehiv.module;

import bw.ub.stripehiv.module.vo.ModuleSearchCriteria;
import bw.ub.stripehiv.module.vo.ModuleVO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

/**
 * @see Module
 */
@Repository("moduleDao")
public class ModuleDaoImpl
    extends ModuleDaoBase
{
    /**
     * {@inheritDoc}
     */
    @Override
    public void toModuleVO(
        Module source,
        ModuleVO target)
    {
        // TODO verify behavior of toModuleVO
        super.toModuleVO(source, target);
        // WARNING! No conversion for target.nextModule (can't convert source.getNextModule():Module to ModuleVO
        if(source.getNextModule() != null) {
        	ModuleVO next = new ModuleVO();
        	next.setCode(source.getNextModule().getCode());
        	next.setDescription(source.getNextModule().getDescription());
        	next.setId(source.getNextModule().getId());
        	next.setModuleName(source.getNextModule().getModuleName());
        	
        	target.setNextModule(next);
        }
        
        // WARNING! No conversion for target.previousModule (can't convert source.getPreviousModule():Module to ModuleVO
        if(source.getPreviousModule() != null) {
        	ModuleVO prev = new ModuleVO();
        	prev.setCode(source.getPreviousModule().getCode());
        	prev.setDescription(source.getPreviousModule().getDescription());
        	prev.setId(source.getPreviousModule().getId());
        	prev.setModuleName(source.getPreviousModule().getModuleName());
        	
        	target.setPreviousModule(prev);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ModuleVO toModuleVO(final Module entity)
    {
        // TODO verify behavior of toModuleVO
        return super.toModuleVO(entity);
    }

    /**
     * Retrieves the entity object that is associated with the specified value object
     * from the object store. If no such entity object exists in the object store,
     * a new, blank entity is created
     */
    private Module loadModuleFromModuleVO(ModuleVO moduleVO)
    {
        /* A typical implementation looks like this:*/
        if (moduleVO.getId() == null)
        {
            return  Module.Factory.newInstance();
        }
        else
        {
            return this.load(moduleVO.getId());
        }
    }

    /**
     * {@inheritDoc}
     */
    public Module moduleVOToEntity(ModuleVO moduleVO)
    {
        // TODO verify behavior of moduleVOToEntity
        Module entity = this.loadModuleFromModuleVO(moduleVO);
        this.moduleVOToEntity(moduleVO, entity, true);
        
        if(moduleVO.getNextModule() != null) {
        	Module module = Module.Factory.newInstance();
        	module.setCode(moduleVO.getNextModule().getCode());
        	module.setDescription(moduleVO.getNextModule().getDescription());
        	module.setId(moduleVO.getNextModule().getId());
        	module.setModuleName(moduleVO.getNextModule().getModuleName());
        	
        	entity.setNextModule(module);
        }
        
        if(moduleVO.getPreviousModule() != null) {
        	Module module = Module.Factory.newInstance();
        	module.setCode(moduleVO.getPreviousModule().getCode());
        	module.setDescription(moduleVO.getPreviousModule().getDescription());
        	module.setId(moduleVO.getPreviousModule().getId());
        	module.setModuleName(moduleVO.getPreviousModule().getModuleName());
        	
        	entity.setPreviousModule(module);        	
        }

        return entity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void moduleVOToEntity(
        ModuleVO source,
        Module target,
        boolean copyIfNull)
    {
        // TODO verify behavior of moduleVOToEntity
        super.moduleVOToEntity(source, target, copyIfNull);
    }

	@Override
	protected Collection<Module> handleFindByCriteria(ModuleSearchCriteria searchCriteria) throws Exception {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<Module> query = builder.createQuery(Module.class);
		Root<Module> root = query.from(Module.class);
		List<Predicate> predicates = new ArrayList<Predicate>();

		if (searchCriteria.getCode() != null) {
			predicates
					.add(builder.like(root.<String>get("code"), "%" + searchCriteria.getCode() + "%"));
		}

		if (searchCriteria.getModuleName() != null) {
			predicates.add(builder.like(root.<String>get("moduleName"), "%" + searchCriteria.getModuleName() + "%"));
		}

		if (!predicates.isEmpty()) {
			query.where();
			Predicate[] pr = new Predicate[predicates.size()];
			predicates.toArray(pr);
			query.where(pr);
		}

		query.orderBy(builder.asc(root.get("code")));
		TypedQuery<Module> typedQuery = getSession().createQuery(query);
		return typedQuery.getResultList();
	}
}