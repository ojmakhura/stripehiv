import { Injectable, Injector } from '@angular/core';
import { RoleEditController } from 'src/app/gen/controller/bw/ub/stripehiv/role/web/edit/role-edit-controller';
import { EditRoleSaveFormImpl } from 'src/app/gen/form/bw/ub/stripehiv/role/web/edit/edit-role-save-form-impl';


@Injectable()
export class RoleEditControllerImpl extends RoleEditController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseEditScreen(form): void {
	}

	public  doNewRole(): void {
	}

	public  doSaveRole(): void {
		let form: EditRoleSaveFormImpl = JSON.parse(localStorage.getItem('editRoleEditRoleSaveForm'));
		if(form.roleVOSet) {
			this.roleService.saveRole(form.roleVO).subscribe(
				role => {
					form = EditRoleSaveFormImpl.setRoleVO(form, role);
					localStorage.setItem('editRoleEditRoleSaveForm', JSON.stringify(form));
				}
			);
		}
	}

}
