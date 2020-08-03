import { Injectable, Injector } from '@angular/core';
import { ModuleEditController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/edit/module-edit-controller';
import { ModuleVO } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-vo';


@Injectable()
export class ModuleEditControllerImpl extends ModuleEditController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public doInitialiseEditScreen(): void {
		let form = this.getEditModuleSaveForm();
		
	}

	public doNewModule(): void {
		let form = this.getEditModuleSaveForm();
		form.moduleVO = new ModuleVO();
		localStorage.setItem('editModuleEditModuleSaveForm', JSON.stringify(form));
	}

	public doSaveModule(): void {
		this.moduleService.saveModule(this.getEditModuleSaveForm().moduleVO).subscribe(
			result => {
				console.log(result);
				let form = this.getEditModuleSaveForm();
				form.moduleVO = result;
				localStorage.setItem('editModuleEditModuleSaveForm', JSON.stringify(form));
			}
		);
	}

}
