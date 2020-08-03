// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: NewModel::bw.ub.stripehiv::module::objective::service::ObjectiveService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
 */
package bw.ub.stripehiv.module.objective.service;

import bw.ub.stripehiv.module.objective.Objective;
import bw.ub.stripehiv.module.objective.vo.ObjectiveVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.module.objective.service.ObjectiveService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("objectiveService")
public class ObjectiveServiceImpl
    extends ObjectiveServiceBase
{

    /**
     * @see bw.ub.stripehiv.module.objective.service.ObjectiveService#saveObjective(ObjectiveVO)
     */
    @Override
    protected  ObjectiveVO handleSaveObjective(ObjectiveVO objectiveVO)
        throws Exception
    {
    	Objective objective = getObjectiveDao().objectiveVOToEntity(objectiveVO);
    	
    	objective = getObjectiveDao().createOrUpdate(objective);
    	return getObjectiveDao().toObjectiveVO(objective);
    }

    /**
     * @see bw.ub.stripehiv.module.objective.service.ObjectiveService#removeObjective(Long)
     */
    @Override
    protected  Boolean handleRemoveObjective(Long id)
        throws Exception
    {
    	
    	if(id == null) {
    		return false;
    	}
    	
    	getObjectiveDao().remove(id);
    	
    	return true;
    }

    /**
     * @see bw.ub.stripehiv.module.objective.service.ObjectiveService#findById(Long)
     */
    @Override
    protected  ObjectiveVO handleFindById(Long id)
        throws Exception
    {
    	return getObjectiveDao().toObjectiveVO(getObjectiveDao().load(id));
    }

}