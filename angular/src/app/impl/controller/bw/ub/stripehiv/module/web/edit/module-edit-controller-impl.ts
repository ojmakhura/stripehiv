import { Injectable, Injector } from '@angular/core';
import { ModuleEditController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/edit/module-edit-controller';
import { EditModuleSaveFormImpl } from 'src/app/gen/form/bw/ub/stripehiv/module/web/edit/edit-module-save-form-impl';
import { EditModuleViewPopulator } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/edit/edit-module.view.populator';
import { ModuleVO } from 'src/app/gen/model/bw/ub/stripehiv/module/vo/module-vo';


@Injectable()
export class ModuleEditControllerImpl extends ModuleEditController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseEditScreen(form): void {
		let modules: Array<ModuleVO>;
		this.moduleService.getAllModules().subscribe(
			results => {
				modules = results;
				localStorage.setItem('moduleVOBackingList', JSON.stringify(modules));
			}
		);
	}

	public  doNewModule(): void {
	}

	public  doSaveModule(): void {
		let form: EditModuleSaveFormImpl = JSON.parse(localStorage.getItem('editModuleEditModuleSaveForm'));
		console.log(form);

		if(form.moduleVOSet) {
			this.moduleService.saveModule(form.moduleVO).subscribe(
				module => {
					console.log(module);
					form = EditModuleViewPopulator.populateEditModuleSaveFormWithEditModuleSaveForm(form, form);
					localStorage.setItem('editModuleEditModuleSaveForm', JSON.stringify(form))
				},
				error => {
					console.log('Error occured: ', error);
					
				}
			);
		}
	}

}
