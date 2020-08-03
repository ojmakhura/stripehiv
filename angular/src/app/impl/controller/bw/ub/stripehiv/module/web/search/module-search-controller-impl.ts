import { Injectable, Injector } from '@angular/core';
import { ModuleSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/module-search-controller';
import { IfStmt } from '@angular/compiler';
import { SearchModulesViewPopulator } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/search-modules.view.populator';
import { SearchModulesSearchFormImpl } from 'src/app/gen/form/bw/ub/stripehiv/module/web/search/search-modules-search-form-impl';


@Injectable()
export class ModuleSearchControllerImpl extends ModuleSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public doInitialiseSearchScreen(form): void {
				
	}

	public doModuleSearch(): void {
		let criteria = this.getSearchModulesSearchForm().searchCriteria;
		this.moduleService.searchModules(criteria).subscribe(
			result => {
				console.log(result);
				let form = this.getSearchModulesSearchForm();
				form = SearchModulesSearchFormImpl.setModules(form, result);
				localStorage.setItem('searchModulesSearchModulesSearchForm', JSON.stringify(form));
				console.log(form);
				
			}
		);
	}

	public doEditModule(form): void {
	}

}
