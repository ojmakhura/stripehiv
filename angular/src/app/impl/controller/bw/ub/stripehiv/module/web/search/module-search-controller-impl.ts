import { Injectable, Injector } from '@angular/core';
import { ModuleSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/module-search-controller';
import { SearchModulesViewPopulator } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/search-modules.view.populator';
import { SearchModulesSearchFormImpl } from 'src/app/gen/form/bw/ub/stripehiv/module/web/search/search-modules-search-form-impl';


@Injectable()
export class ModuleSearchControllerImpl extends ModuleSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseSearchScreen(form): void {
		console.log('-------', localStorage);
		
	}

	public  doModuleSearch(): void {
		let form = JSON.parse(localStorage.getItem('searchModulesSearchModulesSearchForm'));

		if(form.searchCriteriaSet) {
			this.moduleService.searchModules(form.searchCriteria).subscribe(
				modules => {
					console.log('>>>>>>>>>>>>>>>>>>');
					console.log(modules);
					form = SearchModulesSearchFormImpl.setModules(form, modules);
					localStorage.setItem('searchModulesSearchModulesSearchForm', JSON.stringify(form))
				}
			);
		}
	}

	public  doEditModule(form): void {
	}

}
