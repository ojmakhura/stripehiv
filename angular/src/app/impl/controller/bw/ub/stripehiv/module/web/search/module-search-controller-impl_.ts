import { Injectable, Injector } from '@angular/core';
import { ModuleSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/module-search-controller';


@Injectable()
export class ModuleSearchControllerImpl extends ModuleSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public doInitialiseSearchScreen(form): void {
		console.log('doInitialiseSearchScreen');
		console.log(form)
	}

	public doModuleSearch(): void {
		let criteria = this.getSearchModulesSearchForm().searchCriteria;
		this.moduleService.searchModules(criteria).subscribe(
			result => {
				console.log(result);
				let form = this.getSearchModulesSearchForm();
				form.modules = result;

			}
		);
	}

	public doEditModule(): void {
		let form = this.getSearchModulesEditForm();		
	}

}
