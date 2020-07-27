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

import bw.ub.stripehiv.module.vo.ModuleSearchCriteria;
import bw.ub.stripehiv.module.vo.ModuleVO;
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
        // TODO implement protected  ModuleVO handleSaveModule(ModuleVO moduleVO)
        throw new UnsupportedOperationException("bw.ub.stripehiv.module.service.ModuleService.handleSaveModule(ModuleVO moduleVO) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.module.service.ModuleService#removeModule(Long)
     */
    @Override
    protected  Boolean handleRemoveModule(Long id)
        throws Exception
    {
        // TODO implement protected  Boolean handleRemoveModule(Long id)
        throw new UnsupportedOperationException("bw.ub.stripehiv.module.service.ModuleService.handleRemoveModule(Long id) Not implemented!");
    }

    /**
     * @see bw.ub.stripehiv.module.service.ModuleService#searchModules(ModuleSearchCriteria)
     */
    @Override
    protected  Collection<ModuleVO> handleSearchModules(ModuleSearchCriteria searchCriteria)
        throws Exception
    {
        // TODO implement protected  Collection<ModuleVO> handleSearchModules(ModuleSearchCriteria searchCriteria)
        throw new UnsupportedOperationException("bw.ub.stripehiv.module.service.ModuleService.handleSearchModules(ModuleSearchCriteria searchCriteria) Not implemented!");
    }

}