// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: NewModel::bw.ub.stripehiv::module::service::ModuleService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
 */
package bw.ub.stripehiv.module.service;

import bw.ub.stripehiv.module.Module;
import bw.ub.stripehiv.module.vo.ModuleSearchCriteria;
import bw.ub.stripehiv.module.vo.ModuleVO;

import java.util.ArrayList;
import java.util.Collection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.module.service.ModuleService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("moduleService")
public class ModuleServiceImpl
    extends ModuleServiceBase
{

    /**
     * @see bw.ub.stripehiv.module.service.ModuleService#saveModule(ModuleVO)
     */
    @Override
    protected  ModuleVO handleSaveModule(ModuleVO moduleVO)
        throws Exception
    {
    	if(moduleVO.getNextModule() != null && moduleVO.getNextModule().getId() == null) {
    		moduleVO.setNextModule(null);
    	}
    	
    	if(moduleVO.getPreviousModule() != null && moduleVO.getPreviousModule().getId() == null) {
    		moduleVO.setPreviousModule(null);
    	}
    	
    	Module module = getModuleDao().moduleVOToEntity(moduleVO);
        if(moduleVO.getId() == null) {
        	module = getModuleDao().create(module);
        	
        } else {
        	getModuleDao().update(module);
        }
        
        return getModuleDao().toModuleVO(module);
    }

    /**
     * @see bw.ub.stripehiv.module.service.ModuleService#removeModule(Long)
     */
    @Override
    protected  Boolean handleRemoveModule(Long id)
        throws Exception
    {
        if(id == null) {
        	return false;
        }
        
        getModuleDao().remove(id);
        
        return true;
    }

    /**
     * @see bw.ub.stripehiv.module.service.ModuleService#searchModules(ModuleSearchCriteria)
     */
    @Override
    protected  Collection<ModuleVO> handleSearchModules(ModuleSearchCriteria searchCriteria)
        throws Exception
    {
    	Collection<Module> entities = getModuleDao().findByCriteria(searchCriteria);    	
    	ArrayList<ModuleVO> modules = new ArrayList<ModuleVO>();
    	
    	for(Module module : entities) {
    		modules.add(getModuleDao().toModuleVO(module));
    	}
    	
    	return modules;
    }

	@Override
	protected ModuleVO handleFindById(Long id) throws Exception {
		return getModuleDao().toModuleVO(getModuleDao().load(id));
	}

	@Override
	protected Collection<ModuleVO> handleGetAllModules() throws Exception {
		
		Collection<Module> entities = getModuleDao().loadAll();    	
    	ArrayList<ModuleVO> modules = new ArrayList<ModuleVO>();
    	
    	for(Module module : entities) {
    		modules.add(getModuleDao().toModuleVO(module));
    	}
    	
    	return modules;
    	
	}

}