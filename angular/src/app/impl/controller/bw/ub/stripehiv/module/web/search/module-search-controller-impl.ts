import { Injectable, Injector } from '@angular/core';
import { ModuleSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/module/web/search/module-search-controller';


@Injectable()
export class ModuleSearchControllerImpl extends ModuleSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseSearchScreen(form): void {
	}

	public  doModuleSearch(): void {
		//this.moduleService.searchModules()
	}

	public  doEditModule(form): void {
	}

}
