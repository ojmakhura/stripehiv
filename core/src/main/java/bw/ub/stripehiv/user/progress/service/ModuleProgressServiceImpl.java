// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 * TEMPLATE:    SpringServiceImpl.vsl in andromda-spring cartridge
 * MODEL CLASS: StripeHIV::bw.ub.stripehiv::user::progress::service::UserProgressService
 * STEREOTYPE:  WebService
 * STEREOTYPE:  Service
 */
package bw.ub.stripehiv.user.progress.service;

import bw.ub.stripehiv.user.progress.vo.ModuleProgressVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @see bw.ub.stripehiv.user.progress.service.UserProgressService
 */
 @Transactional(propagation = Propagation.REQUIRED, readOnly=false)
@Service("moduleProgressService")
public class ModuleProgressServiceImpl
    extends ModuleProgressServiceBase
{

	@Override
	protected ModuleProgressVO handleSaveModuleProgress(ModuleProgressVO moduleProgressVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Boolean handleRemoveModuleProgress(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

    

}