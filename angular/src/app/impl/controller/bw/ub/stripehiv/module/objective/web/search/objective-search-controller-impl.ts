import { Injectable, Injector } from '@angular/core';
import { ObjectiveSearchController } from 'src/app/gen/controller/bw/ub/stripehiv/module/objective/web/search/objective-search-controller';


@Injectable()
export class ObjectiveSearchControllerImpl extends ObjectiveSearchController {

    constructor(private injector: Injector) {
        super(injector);
    }

	public  doInitialiseSearchScreen(form): void {
	}

	public  doObjectiveSearch(): void {
	}

	public  doEditObjective(form): void {
	}

}
